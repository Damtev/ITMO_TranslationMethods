package generated.calculator
        import java.text.ParseException
        import java.util.ArrayDeque

        class Parser {

            lateinit var lexer: Lexer
            var text = ""
            
data class Complex(var real: Int, var im: Int) {
				constructor(other: Complex) : this(other.real, other.im)

				constructor(s: String) : this(0, 0) {
					if (s.contains("j")) {
						im = Integer.parseInt(s.substring(0, s.lastIndex))
					} else {
						real = Integer.parseInt(s)
					}
				}

				override fun toString(): String {
					if (im == 0) {
						return real.toString()
					}
					val sign = if (im < 0) "-" else "+"
					return "$real $sign ${if (im < 0) -im else im}j"
				}

				operator fun plus(other: Complex) = Complex(real + other.real, im + other.im)
				operator fun minus(other: Complex) = Complex(real - other.real, im - other.im)
				operator fun times(other: Complex) = Complex(real * other.real - im * other.im,
					real * other.im + im * other.real)
				operator fun unaryMinus() = Complex(-real, -im)
}
val stack = ArrayDeque<Complex>();


            private fun unexpectedLiteral(rule: String): Nothing =
                throw ParseException("Unexpected literal ${lexer.tokenValue} in rule $rule on pos: ${lexer.curPos}", lexer.curPos)

            private fun check(token: Token, rule: String) {
                if (lexer.token != token) {
                    unexpectedLiteral(rule)
                }
            }

    private fun number(): Node {
        val children = arrayListOf<Node>()
        val res = Node("number", children)
                    
        when (lexer.token) {
        
        		Token.REAL -> {
			check(Token.REAL, "REAL")
			text = lexer.tokenValue
			children.add(Node(text))

			lexer.nextToken()

			return res
		}
		Token.IMAGINARY -> {
			check(Token.IMAGINARY, "IMAGINARY")
			text = lexer.tokenValue
			children.add(Node(text))

			lexer.nextToken()

			return res
		}
		else -> {
			unexpectedLiteral("number")
		}
	}
}

    private fun fullGrammar(): Node {
        val children = arrayListOf<Node>()
        val res = Node("fullGrammar", children)
                    
        when (lexer.token) {
        
        		Token.REAL -> {
			val var0 = expression()
			children.add(var0)

res.complex = Complex(var0.complex);
			return res
		}
		Token.LPAREN -> {
			val var0 = expression()
			children.add(var0)

res.complex = Complex(var0.complex);
			return res
		}
		Token.IMAGINARY -> {
			val var0 = expression()
			children.add(var0)

res.complex = Complex(var0.complex);
			return res
		}
		Token.MINUS -> {
			val var0 = expression()
			children.add(var0)

res.complex = Complex(var0.complex);
			return res
		}
		else -> {
			unexpectedLiteral("fullGrammar")
		}
	}
}

    private fun expression(): Node {
        val children = arrayListOf<Node>()
        val res = Node("expression", children)
                    
        when (lexer.token) {
        
        		Token.REAL -> {
			val var0 = term()
			children.add(var0)

			val var1 = expressionPrime()
			children.add(var1)

res.complex = Complex(var1.complex);
			return res
		}
		Token.LPAREN -> {
			val var0 = term()
			children.add(var0)

			val var1 = expressionPrime()
			children.add(var1)

res.complex = Complex(var1.complex);
			return res
		}
		Token.IMAGINARY -> {
			val var0 = term()
			children.add(var0)

			val var1 = expressionPrime()
			children.add(var1)

res.complex = Complex(var1.complex);
			return res
		}
		Token.MINUS -> {
			val var0 = term()
			children.add(var0)

			val var1 = expressionPrime()
			children.add(var1)

res.complex = Complex(var1.complex);
			return res
		}
		else -> {
			unexpectedLiteral("expression")
		}
	}
}

    private fun exprInBrackets(): Node {
        val children = arrayListOf<Node>()
        val res = Node("exprInBrackets", children)
                    
        when (lexer.token) {
        
        		Token.LPAREN -> {
			check(Token.LPAREN, "LPAREN")
			text = lexer.tokenValue
			children.add(Node(text))

			lexer.nextToken()

			val var0 = expression()
			children.add(var0)

			check(Token.RPAREN, "RPAREN")
			text = lexer.tokenValue
			children.add(Node(text))

			lexer.nextToken()

res.complex = Complex(var0.complex);
			return res
		}
		else -> {
			unexpectedLiteral("exprInBrackets")
		}
	}
}

    private fun start(): Node {
        val children = arrayListOf<Node>()
        val res = Node("start", children)
                    
        when (lexer.token) {
        
        		Token.REAL -> {
			val var0 = fullGrammar()
			children.add(var0)

res.complex = Complex(var0.complex);
			check(Token.EOF, "EOF")
			text = lexer.tokenValue
			children.add(Node("EOF"))

			lexer.nextToken()

			return res
		}
		Token.LPAREN -> {
			val var0 = fullGrammar()
			children.add(var0)

res.complex = Complex(var0.complex);
			check(Token.EOF, "EOF")
			text = lexer.tokenValue
			children.add(Node("EOF"))

			lexer.nextToken()

			return res
		}
		Token.IMAGINARY -> {
			val var0 = fullGrammar()
			children.add(var0)

res.complex = Complex(var0.complex);
			check(Token.EOF, "EOF")
			text = lexer.tokenValue
			children.add(Node("EOF"))

			lexer.nextToken()

			return res
		}
		Token.MINUS -> {
			val var0 = fullGrammar()
			children.add(var0)

res.complex = Complex(var0.complex);
			check(Token.EOF, "EOF")
			text = lexer.tokenValue
			children.add(Node("EOF"))

			lexer.nextToken()

			return res
		}
		else -> {
			unexpectedLiteral("start")
		}
	}
}

    private fun expressionPrime(): Node {
        val children = arrayListOf<Node>()
        val res = Node("expressionPrime", children)
                    
        when (lexer.token) {
        
        		Token.RPAREN -> {
res.complex = Complex(stack.peekLast());
			children.add(Node("RPAREN"))
			return res
		}
		Token.EOF -> {
res.complex = Complex(stack.peekLast());
			children.add(Node("EOF"))
			return res
		}
		Token.MINUS -> {
			check(Token.MINUS, "MINUS")
			text = lexer.tokenValue
			children.add(Node(text))

			lexer.nextToken()

			val var0 = term()
			children.add(var0)

val second = stack.pollLast(); val first = stack.pollLast(); stack.addLast(first - second);
			val var1 = expressionPrime()
			children.add(var1)

res.complex = Complex(var1.complex);
			return res
		}
		Token.PLUS -> {
			check(Token.PLUS, "PLUS")
			text = lexer.tokenValue
			children.add(Node(text))

			lexer.nextToken()

			val var0 = term()
			children.add(var0)

val second = stack.pollLast(); val first = stack.pollLast(); stack.addLast(first + second);
			val var1 = expressionPrime()
			children.add(var1)

res.complex = Complex(var1.complex);
			return res
		}
		else -> {
			unexpectedLiteral("expressionPrime")
		}
	}
}

    private fun term(): Node {
        val children = arrayListOf<Node>()
        val res = Node("term", children)
                    
        when (lexer.token) {
        
        		Token.REAL -> {
			val var0 = factor()
			children.add(var0)

			val var1 = termPrime()
			children.add(var1)

res.complex = Complex(var1.complex);
			return res
		}
		Token.LPAREN -> {
			val var0 = factor()
			children.add(var0)

			val var1 = termPrime()
			children.add(var1)

res.complex = Complex(var1.complex);
			return res
		}
		Token.IMAGINARY -> {
			val var0 = factor()
			children.add(var0)

			val var1 = termPrime()
			children.add(var1)

res.complex = Complex(var1.complex);
			return res
		}
		Token.MINUS -> {
			val var0 = factor()
			children.add(var0)

			val var1 = termPrime()
			children.add(var1)

res.complex = Complex(var1.complex);
			return res
		}
		else -> {
			unexpectedLiteral("term")
		}
	}
}

    private fun factor(): Node {
        val children = arrayListOf<Node>()
        val res = Node("factor", children)
                    
        when (lexer.token) {
        
        		Token.REAL -> {
			val var0 = number()
			children.add(var0)

res.complex = Complex(text); stack.addLast(Complex(text));
			return res
		}
		Token.LPAREN -> {
			val var0 = exprInBrackets()
			children.add(var0)

			return res
		}
		Token.IMAGINARY -> {
			val var0 = number()
			children.add(var0)

res.complex = Complex(text); stack.addLast(Complex(text));
			return res
		}
		Token.MINUS -> {
			check(Token.MINUS, "MINUS")
			text = lexer.tokenValue
			children.add(Node(text))

			lexer.nextToken()

			val var0 = exprInBrackets()
			children.add(var0)

res.complex = -var0.complex; stack.pollLast(); stack.addLast(res.complex);
			return res
		}
		else -> {
			unexpectedLiteral("factor")
		}
	}
}

    private fun termPrime(): Node {
        val children = arrayListOf<Node>()
        val res = Node("termPrime", children)
                    
        when (lexer.token) {
        
        		Token.MUL -> {
			check(Token.MUL, "MUL")
			text = lexer.tokenValue
			children.add(Node(text))

			lexer.nextToken()

			val var0 = factor()
			children.add(var0)

val second = stack.pollLast(); val first = stack.pollLast(); stack.addLast(first * second);
			val var1 = termPrime()
			children.add(var1)

res.complex = Complex(var1.complex);
			return res
		}
		Token.RPAREN -> {
res.complex = Complex(stack.peekLast());
			children.add(Node("RPAREN"))
			return res
		}
		Token.EOF -> {
res.complex = Complex(stack.peekLast());
			children.add(Node("EOF"))
			return res
		}
		Token.MINUS -> {
res.complex = Complex(stack.peekLast());
			children.add(Node("MINUS"))
			return res
		}
		Token.PLUS -> {
res.complex = Complex(stack.peekLast());
			children.add(Node("PLUS"))
			return res
		}
		else -> {
			unexpectedLiteral("termPrime")
		}
	}
}
    fun parse(input: String): Node {
        lexer = Lexer(input)
        return start()
    }
}