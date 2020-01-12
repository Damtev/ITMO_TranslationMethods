import gen.GoodLanguageGrammarBaseVisitor
import gen.GoodLanguageGrammarParser

private const val IMPORTS =
    "#include <stdio.h>\n" +
            "#include <math.h>\n" +
            "#include <stdbool.h>\n"
private const val READ_INT = "int readInt() {\n\tint x;\n\tscanf(\"%d\", &x);\n\treturn x;\n}"
private const val READ_FLOAT = "float readFloat() {\n\tfloat x;\n\tscanf(\"%f\", &x);\n\treturn x;\n}"
private const val READ_CHAR = "char readChar() {\n\tchar x;\n\tscanf(\"%c\", &x);\n\treturn x;\n}"
private const val READ_STR =
    "char * readStr() {\n\tchar* x;\n\tsize_t l = 0;\n\tgetline(&x, &l, stdin);\n\treturn x;\n}"

private const val PRINT_INT = "void printInt(int x) {\n\tprintf(\"%d\", x);\n}"
private const val PRINT_FLOAT = "void printFloat(float x) {\n\tprintf(\"%f\", x);\n}"
private const val PRINT_CHAR = "void printChar(char x) {\n\tprintf(\"%c\", x);\n}"
private const val PRINT_STR = "void printStr(char * s) {\n\tprintf(\"%s\", s);\n}"

private const val TAB = "    "

class MyGoodLanguageVisitor : GoodLanguageGrammarBaseVisitor<String>() {

    private val lineSeparator by lazy {
        System.lineSeparator()
    }

    private var curDepth = 0

    // program : blocks EOF;
    override fun visitProgram(ctx: GoodLanguageGrammarParser.ProgramContext?) = buildString {
        append(IMPORTS + "\n")

        append(READ_INT + "\n\n")
        append(READ_FLOAT + "\n\n")
        append(READ_CHAR + "\n\n")
        append(READ_STR + "\n\n")

        append(PRINT_INT + "\n\n")
        append(PRINT_FLOAT + "\n\n")
        append(PRINT_CHAR + "\n\n")
        append(PRINT_STR + "\n\n")

        append(visit(ctx!!.getChild(0)))
    }

    // blocks : (variableDeclaration | functionDeclaration)* mainBlock;
    override fun visitBlocks(ctx: GoodLanguageGrammarParser.BlocksContext?) = buildString {
        for (i in 0 until ctx!!.childCount - 1) {
            append(visit(ctx.getChild(i)) + lineSeparator.repeat(2))
        }
        append(visit(ctx.getChild(ctx.childCount - 1)))
    }

    // functionDeclaration : type NAME LPAREN args RPAREN functionBlock;
    override fun visitFunctionDeclaration(ctx: GoodLanguageGrammarParser.FunctionDeclarationContext?) = buildString {
        append(visit(ctx!!.getChild(0)) + " ")
        append(ctx.getChild(1).text)
        append(ctx.getChild(2).text)
        append(visit(ctx.getChild(3)))
        append(ctx.getChild(4).text + " ")

        append(visit(ctx.getChild(5)))
    }

    // functionBlock : LCURLY statements returnStatement RCURLY;
    override fun visitFunctionBlock(ctx: GoodLanguageGrammarParser.FunctionBlockContext?) = buildString {
        append(ctx!!.getChild(0).text + lineSeparator)
        ++curDepth
        append(visit(ctx.getChild(1)))
        append(visit(ctx.getChild(2)))
        --curDepth
        append(ctx.getChild(ctx.childCount - 1).text)
    }

    // args : (type NAME (comma type NAME)*)?;
    override fun visitArgs(ctx: GoodLanguageGrammarParser.ArgsContext?) = buildString {
        if (ctx!!.childCount == 0) {
            // do nothing
        } else {
            append(ctx.getChild(0).text + " ")
            append(ctx.getChild(1).text)
            if (ctx.childCount > 2) {
                for (i in 2 until ctx.childCount step 3) {
                    append(ctx.getChild(i).text + " ")
                    append(ctx.getChild(i + 1).text + " ")
                    append(ctx.getChild(i + 2).text)
                }
            }
        }
    }

    // returnStatement : RETURN expression SEMICOLON;
    override fun visitReturnStatement(ctx: GoodLanguageGrammarParser.ReturnStatementContext?) =
        TAB.repeat(curDepth) + ctx!!.getChild(0).text + " " + visit(ctx.getChild(1)) + ctx.getChild(2).text +
                lineSeparator

    // variableDeclaration : type NAME ASSIGN expression SEMICOLON;
    override fun visitVariableDeclaration(ctx: GoodLanguageGrammarParser.VariableDeclarationContext?) = buildString {
        append(visit(ctx!!.getChild(0)) + " ")
        append(ctx.getChild(1).text + " ")
        append(ctx.getChild(2).text + " ")
        append(visit(ctx.getChild(3)))
        append(ctx.getChild(4).text)
    }

    // mainBlock : MAIN codeBlock;
    override fun visitMainBlock(ctx: GoodLanguageGrammarParser.MainBlockContext?) =
        buildString {
            append("int main() ")
            append(visit(ctx!!.getChild(1)))
        }

    // codeBlock : LCURLY statements RCURLY;
    override fun visitCodeBlock(ctx: GoodLanguageGrammarParser.CodeBlockContext?) =
        buildString {
            append(ctx!!.getChild(0).text + lineSeparator)
            ++curDepth
            append(visit(ctx.getChild(1)))
            --curDepth
            append(TAB.repeat(curDepth))
            append(ctx.getChild(2).text)
        }

    // statements : (simpleStatement | complexStatement | variableDeclarationInsideCodeBlock)*;
    override fun visitStatements(ctx: GoodLanguageGrammarParser.StatementsContext?) = buildString {
        if (ctx!!.childCount == 0) {
            // do nothing
        } else {
            for (child in ctx.children) {
                append(visit(child))
                append(lineSeparator)
            }
        }
    }

    // simpleStatement : (assignmentStatement | functionCall) SEMICOLON;
    override fun visitSimpleStatement(ctx: GoodLanguageGrammarParser.SimpleStatementContext?) = buildString {
        append(TAB.repeat(curDepth))
        append(visit(ctx!!.getChild(0)))
        append(ctx.getChild(1).text)
    }

    // assignmentStatement : NAME ASSIGN expression;
    override fun visitAssignmentStatement(ctx: GoodLanguageGrammarParser.AssignmentStatementContext?) = buildString {
        append(ctx!!.getChild(0).text + " ")
        append(ctx.getChild(1).text + " ")
        append(visit(ctx.getChild(2)))
    }

    // functionCall : NAME LPAREN parameters RPAREN;
    override fun visitFunctionCall(ctx: GoodLanguageGrammarParser.FunctionCallContext?) = buildString {
        append(ctx!!.getChild(0).text)
        append(ctx.getChild(1).text)
        append(visit(ctx.getChild(2)))
        append(ctx.getChild(3).text)
    }

    // parameters : (expression (COMMA expression)*)?;
    override fun visitParameters(ctx: GoodLanguageGrammarParser.ParametersContext?) = buildString {
        if (ctx!!.childCount != 0) {
            append(visit(ctx.getChild(0)))
            for (i in 1 until ctx.childCount step 2) {
                append(ctx.getChild(i).text + " ")
                append(visit(ctx.getChild(i + 1)))
            }
        }
    }

    // variableDeclarationInsideCodeBlock : variableDeclaration;
    override fun visitVariableDeclarationInsideCodeBlock(
        ctx: GoodLanguageGrammarParser.VariableDeclarationInsideCodeBlockContext?
    ) = TAB.repeat(curDepth) + visit(ctx!!.getChild(0))!!

    // expression : simpleExpression (minimalPriorityOperator expression)?;
    override fun visitExpression(ctx: GoodLanguageGrammarParser.ExpressionContext?) = buildString {
        append(visit(ctx!!.getChild(0)))
        if (ctx.childCount > 1) {
            append(" " + visit(ctx.getChild(1)) + " ")
            append(visit(ctx.getChild(2)))
        }
    }

    // simpleExpression : term (middlePriorityOperator simpleExpression)?;
    override fun visitSimpleExpression(ctx: GoodLanguageGrammarParser.SimpleExpressionContext?) = buildString {
        append(visit(ctx!!.getChild(0)))
        if (ctx.childCount > 1) {
            append(" " + visit(ctx.getChild(1)) + " ")
            append(visit(ctx.getChild(2)))
        }
    }

    // term : signedFactor (maximumPriorityOperator term)? ;
    override fun visitTerm(ctx: GoodLanguageGrammarParser.TermContext?) = buildString {
        append(visit(ctx!!.getChild(0)))
        if (ctx.childCount > 1) {
            append(" " + visit(ctx.getChild(1)) + " ")
            append(visit(ctx.getChild(2)))
        }
    }

    // signedFactor : (PLUS | MINUS)? factor ;
    override fun visitSignedFactor(ctx: GoodLanguageGrammarParser.SignedFactorContext?) = buildString {
        var i = 0
        if (ctx!!.childCount > 1) {
            append(ctx.getChild(i).text)
            ++i
        }
        append(visit(ctx.getChild(i)))
    }

    // factor : varName | LPAREN expression RPAREN | functionCall | NOT factor | value;
    override fun visitFactor(ctx: GoodLanguageGrammarParser.FactorContext?) = buildString {
        val count = ctx!!.childCount
        if (count == 1) {
            append(visit(ctx.getChild(0)))
        } else {
            append(ctx.getChild(0).text + visit(ctx.getChild(1)))
            if (count == 3) {
                append(ctx.getChild(2).text)
            }
        }
    }

    // value : NUMBER #numberConst | LITERAL #literalConst;

    override fun visitNumberConst(ctx: GoodLanguageGrammarParser.NumberConstContext?) = ctx!!.text!!

    override fun visitLiteralConst(ctx: GoodLanguageGrammarParser.LiteralConstContext?) =
        "\"" + ctx!!.text.substring(1, ctx.text.length - 1) + "\""

    // varName : NAME;
    override fun visitVarName(ctx: GoodLanguageGrammarParser.VarNameContext?) = ctx!!.text!!

    // complexStatement : codeBlock | conditionalStatement | loopStatement;
    override fun visitComplexStatement(ctx: GoodLanguageGrammarParser.ComplexStatementContext?) =
        visit(ctx!!.getChild(0))!!

    // ifStatement : IF LPAREN expression RPAREN codeBlock (ELSE codeBlock)?;
    override fun visitIfStatement(ctx: GoodLanguageGrammarParser.IfStatementContext?) = buildString {
        append(TAB.repeat(curDepth))
        append(ctx!!.getChild(0).text + " ")
        append(ctx.getChild(1).text)
        append(visit(ctx.getChild(2)))
        append(ctx.getChild(3).text + " ")
        append(visit(ctx.getChild(4)))

        if (ctx.childCount > 5) {
            append(" " + ctx.getChild(5).text + " ")
            append(visit(ctx.getChild(6)))
        }
    }

    // loopStatement : whileStatement | forStatement;
    override fun visitLoopStatement(ctx: GoodLanguageGrammarParser.LoopStatementContext?) = visit(ctx!!.getChild(0))!!

    // whileStatement : WHILE LPAREN expression RPAREN codeBlock;
    override fun visitWhileStatement(ctx: GoodLanguageGrammarParser.WhileStatementContext?) = buildString {
        append(TAB.repeat(curDepth))

        append(ctx!!.getChild(0).text + " ")
        append(ctx.getChild(1).text)
        append(visit(ctx.getChild(2)))
        append(ctx.getChild(3).text + " ")
        append(visit(ctx.getChild(4)))
    }

    // forStatement : FOR LPAREN NAME IN (NUMBER | NAME) DOUBLEDOT (NUMBER | NAME) (STEP (NUMBER | NAME))? RPAREN codeBlock;
    override fun visitForStatement(ctx: GoodLanguageGrammarParser.ForStatementContext?) = buildString {
        append(TAB.repeat(curDepth))

        val name = ctx!!.getChild(2).text
        val from = ctx.getChild(4).text
        val to = ctx.getChild(6).text
        append(ctx.getChild(0).text + " ")
        append(ctx.getChild(1).text)
        append("int $name = $from;")
        var hasStep = false
        var isNegativeStep = false
        var step = 1
        var last = 7
        if (ctx.childCount > 9) {
            hasStep = true
            last = 9
            if (ctx.getChild(8).text.startsWith("-")) {
                isNegativeStep = true
            }
            val start = if (isNegativeStep) 1 else 0
            step = ctx.getChild(8).text.substring(start).toInt()
        }
        append(" $name ")
        if (!hasStep || !isNegativeStep) {
            append("<= ")
        } else {
            append(">= ")
        }
        append("$to;")
        append(" $name")
        if (!hasStep) {
            append("++")
        } else {
            append(" " + if (!isNegativeStep) "+" else "-")
            append("= $step")
        }

        append(ctx.getChild(last).text + " ")
        append(visit(ctx.getChild(last + 1)))
    }

    // maximumPriorityOperator : MULT | MOD | AND;
    override fun visitMaximumPriorityOperator(ctx: GoodLanguageGrammarParser.MaximumPriorityOperatorContext?) =
        ctx!!.text!!

    // middlePriorityOperator : PLUS | MINUS | OR;
    override fun visitMiddlePriorityOperator(ctx: GoodLanguageGrammarParser.MiddlePriorityOperatorContext?) =
        ctx!!.text!!

    // minimalPriorityOperator : EQUAL | NOT_EQUAL | LT | LTE | GTE | GT;
    override fun visitMinimalPriorityOperator(ctx: GoodLanguageGrammarParser.MinimalPriorityOperatorContext?) =
        ctx!!.text!!

    // type : (INT | BOOL | STRING | FLOAT | CHAR);
    override fun visitType(ctx: GoodLanguageGrammarParser.TypeContext?) = when (ctx!!.getChild(0).text) {
        "string" -> "char *"
        else -> ctx.getChild(0).text
    }!!

    // bool : TRUE | FALSE;
    override fun visitBool(ctx: GoodLanguageGrammarParser.BoolContext?) = ctx!!.text!!
}