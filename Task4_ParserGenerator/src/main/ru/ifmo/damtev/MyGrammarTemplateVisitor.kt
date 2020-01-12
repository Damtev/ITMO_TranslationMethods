package main.ru.ifmo.damtev

import grammar.template.GrammarTemplateBaseVisitor
import grammar.template.GrammarTemplateParser
import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashMap
import kotlin.collections.HashSet
import kotlin.collections.arrayListOf
import kotlin.collections.contains
import kotlin.collections.hashMapOf
import kotlin.collections.hashSetOf
import kotlin.collections.indices
import kotlin.collections.linkedMapOf
import kotlin.collections.set

const val START = "start"
const val EOF = "EOF"
const val EPS = "EPS"

class MyGrammarTemplateVisitor : GrammarTemplateBaseVisitor<String>() {

    val rules = hashMapOf<String, ArrayList<ArrayList<String>>>()
    val tokens = linkedMapOf<String, String>()

    val first = hashMapOf<String, HashSet<String>>()
    val follow = hashMapOf<String, HashSet<String>>()

    var attributeValues = ""
    var nodeValues = ""

    val ruleNumberFromFirst = hashMapOf<String, HashMap<String, Int>>()

    // file : file : (attributes)? (nodeAttributes)? myRules myTokens EOF;
    override fun visitFile(ctx: GrammarTemplateParser.FileContext?) = buildString {
        for (child in ctx!!.children) {
            visit(child)
        }
        buildFirst()
        buildFollow()
        buildRuleNumberFromFirst()
    }

    // attributes : PERCENT ATTRIBUTE_VALUE PERCENT;
    override fun visitAttributes(ctx: GrammarTemplateParser.AttributesContext?) = buildString {
        attributeValues = ctx!!.getChild(1).text
        attributeValues = attributeValues.substring(1, attributeValues.lastIndex)
    }

    // nodeValues : DOG NODE_VALUE DOG;
    override fun visitNodeValues(ctx: GrammarTemplateParser.NodeValuesContext?) = buildString {
        nodeValues = ctx!!.getChild(1).text
        nodeValues = nodeValues.substring(1, nodeValues.lastIndex)
    }

    // myRules : (myRule)+;
    override fun visitMyRules(ctx: GrammarTemplateParser.MyRulesContext?) = buildString {
        for (child in ctx!!.children) {
            visit(child)
        }
    }

    // myRule : RULE_NAME COLON (RULE_NAME | TOKEN_NAME | SEMANTIC_RULE)+ SEMICOLON;
    override fun visitMyRule(ctx: GrammarTemplateParser.MyRuleContext?) = buildString {
        val ruleName = ctx!!.getChild(0).text
        val rule = arrayListOf<String>()
        for (i in 2 until ctx.childCount - 1) {
            rule.add(ctx.getChild(i).text)
        }
        if (ruleName !in rules.keys) {
            rules[ruleName] = arrayListOf()
        }
        rules[ruleName]!!.add(rule)
    }

    // myTokens : (myToken)+;
    override fun visitMyTokens(ctx: GrammarTemplateParser.MyTokensContext?) = buildString {
        for (child in ctx!!.children) {
            visit(child)
        }
    }

    // myToken : TOKEN_NAME COLON VALUE SEMICOLON;
    override fun visitMyToken(ctx: GrammarTemplateParser.MyTokenContext?) = buildString {
        val tokenName = ctx!!.getChild(0).text
        var value = ctx.getChild(2).text
        value = value.substring(1, value.length - 1)
        tokens[tokenName] = value
    }

    private fun getFirst(s : String): HashSet<String> {
        /*if (s in tokens.keys) {
            return hashSetOf(s)
        }

        if (s in first.keys) {
            return HashSet(first[s]!!)
        }

        return hashSetOf()*/

        if (s in tokens) {
            val result = hashSetOf<String>()
            result.add(s)
            return result
        }

        return if (s in first) {
            HashSet(first[s])
        } else hashSetOf()
    }

    private fun buildFirst() {
        for (key in rules.keys) {
            first[key] = hashSetOf()
        }
        /*for (token in tokens.keys) {
            first[token] = hashSetOf(token)
        }*/
        var changed = true
        /*while (changed) {
            changed = false
            for (ruleName in rules.keys) {
                ruleNumberFromFirst[ruleName] = hashMapOf()
                for ((i, rule) in rules[ruleName]!!.withIndex()) {
                    val curSize = first[ruleName]!!.size
                    val firstFirst = getFirst(rule[0])
                    if (EPS in firstFirst && firstFirst.size > 1) {
                        firstFirst.remove(EPS)
                        if (rule.size > 1) {
                            firstFirst.addAll(getFirst(rule[1]))
                        } else {
                            firstFirst.add(EPS)
                        }
                    }
                    for (it in firstFirst) {
                        ruleNumberFromFirst[ruleName]!![it] = i
                    }
                    first[ruleName]!!.addAll(firstFirst)
                    if (curSize != first[ruleName]!!.size) {
                        changed = true
                    }
                }
            }
        }*/

        while (changed) {
            changed = false
            for (key in rules.keys) {
                for (rule in rules[key]!!) {
                    val firstItem = getFirst(rule[0])
                    val prevSize = first[key]!!.size
                    first[key]!!.addAll(firstItem)
                    if (first[key]!!.size != prevSize) {
                        changed = true
                    }
                }
            }
        }
    }

    private fun getFollow(s : String) = if (s in follow.keys) HashSet(follow[s]!!) else hashSetOf()

    // todo: добавить атрибуты
    private fun buildFollow() {
        for (key in rules.keys) {
            follow[key] = hashSetOf()
        }
        follow[START] = hashSetOf(EOF)
        var changed = true

        /*while (changed) {
            changed = false
            for (ruleName in rules.keys) {
                for (rule in rules[ruleName]!!) {
                    for (pos in rule.indices) {
                        if (rule[pos] !in rules.keys) {
                            continue
                        }
                        val nonTerminal = rule[pos]
                        val curSize = follow[nonTerminal]!!.size

                        val nextFirst = if (pos == rule.lastIndex) {
                            hashSetOf(EPS)
                        } else {
                            getFirst(rule[pos + 1])
                        }

                        if (EPS in nextFirst) {
                            nextFirst.remove(EPS)
                            follow[nonTerminal]!!.addAll(getFollow(ruleName))
                        }

                        follow[nonTerminal]!!.addAll(nextFirst)
                        if (follow[nonTerminal]!!.size != curSize) {
                            changed = true
                        }
                    }
                }
            }
        }*/

        while (changed) {
            changed = false
            for (key in rules.keys) {
                for (rule in rules[key]!!) {
                    for (i in rule.indices) {
                        if (rule[i].startsWith("$") || rule[i] !in rules) {
                            continue
                        }
                        if (i < rule.size - 1) {
                            var position = i + 1
                            while (position < rule.size && rule[position].startsWith("$")) {
                                position++
                            }
                            if (position >= rule.size) {
                                val parentFollow = getFollow(key)
                                val prevSize = follow[rule[i]]!!.size
                                follow[rule[i]]!!.addAll(parentFollow)
                                if (follow[rule[i]]!!.size != prevSize) {
                                    changed = true
                                }
                                continue
                            }
                            val nextFirst = getFirst(rule[position])
                            if (nextFirst.contains("EPS")) {
                                nextFirst.remove("EPS")
                                val nextFollow = getFollow(rule[position])
                                val prevSize = follow[rule[i]]!!.size
                                follow[rule[i]]!!.addAll(nextFollow)
                                if (follow[rule[i]]!!.size != prevSize) {
                                    changed = true
                                }
                            }
                            val prevSize = follow[rule[i]]!!.size
                            follow[rule[i]]!!.addAll(nextFirst)
                            if (follow[rule[i]]!!.size != prevSize) {
                                changed = true
                            }
                        } else {
                            val parentFollow = getFollow(key)
                            val prevSize = follow[rule[i]]!!.size
                            follow[rule[i]]!!.addAll(parentFollow)
                            if (follow[rule[i]]!!.size != prevSize) {
                                changed = true
                            }
                        }
                    }
                }
            }
        }
    }

    private fun buildRuleNumberFromFirst() {
        for (ruleName in first.keys) {
            ruleNumberFromFirst[ruleName] = hashMapOf()
            for (firstElement in first[ruleName]!!) {
                for (i in rules[ruleName]!!.indices) {
                    if (firstElement in getFirst(rules[ruleName]!![i][0])) {
                        val tokenToRule = ruleNumberFromFirst[ruleName]!!
                        tokenToRule[firstElement] = i
                    }
                }
            }
        }
    }
}