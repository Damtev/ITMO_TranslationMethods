// Generated from /media/damtev/Storage/ITMO/ITMO_MT/Task3_OwnLanguage/GoodLanguageGrammar.g4 by ANTLR 4.7.2
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GoodLanguageGrammarParser}.
 */
public interface GoodLanguageGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GoodLanguageGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(GoodLanguageGrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodLanguageGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(GoodLanguageGrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodLanguageGrammarParser#blocks}.
	 * @param ctx the parse tree
	 */
	void enterBlocks(GoodLanguageGrammarParser.BlocksContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodLanguageGrammarParser#blocks}.
	 * @param ctx the parse tree
	 */
	void exitBlocks(GoodLanguageGrammarParser.BlocksContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodLanguageGrammarParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(GoodLanguageGrammarParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodLanguageGrammarParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(GoodLanguageGrammarParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodLanguageGrammarParser#functionBlock}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBlock(GoodLanguageGrammarParser.FunctionBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodLanguageGrammarParser#functionBlock}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBlock(GoodLanguageGrammarParser.FunctionBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodLanguageGrammarParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(GoodLanguageGrammarParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodLanguageGrammarParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(GoodLanguageGrammarParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodLanguageGrammarParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(GoodLanguageGrammarParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodLanguageGrammarParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(GoodLanguageGrammarParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodLanguageGrammarParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(GoodLanguageGrammarParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodLanguageGrammarParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(GoodLanguageGrammarParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodLanguageGrammarParser#mainBlock}.
	 * @param ctx the parse tree
	 */
	void enterMainBlock(GoodLanguageGrammarParser.MainBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodLanguageGrammarParser#mainBlock}.
	 * @param ctx the parse tree
	 */
	void exitMainBlock(GoodLanguageGrammarParser.MainBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodLanguageGrammarParser#codeBlock}.
	 * @param ctx the parse tree
	 */
	void enterCodeBlock(GoodLanguageGrammarParser.CodeBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodLanguageGrammarParser#codeBlock}.
	 * @param ctx the parse tree
	 */
	void exitCodeBlock(GoodLanguageGrammarParser.CodeBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodLanguageGrammarParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(GoodLanguageGrammarParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodLanguageGrammarParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(GoodLanguageGrammarParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodLanguageGrammarParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStatement(GoodLanguageGrammarParser.SimpleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodLanguageGrammarParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStatement(GoodLanguageGrammarParser.SimpleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodLanguageGrammarParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(GoodLanguageGrammarParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodLanguageGrammarParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(GoodLanguageGrammarParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodLanguageGrammarParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(GoodLanguageGrammarParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodLanguageGrammarParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(GoodLanguageGrammarParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodLanguageGrammarParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(GoodLanguageGrammarParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodLanguageGrammarParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(GoodLanguageGrammarParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodLanguageGrammarParser#variableDeclarationInsideCodeBlock}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationInsideCodeBlock(GoodLanguageGrammarParser.VariableDeclarationInsideCodeBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodLanguageGrammarParser#variableDeclarationInsideCodeBlock}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationInsideCodeBlock(GoodLanguageGrammarParser.VariableDeclarationInsideCodeBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodLanguageGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(GoodLanguageGrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodLanguageGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(GoodLanguageGrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodLanguageGrammarParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpression(GoodLanguageGrammarParser.SimpleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodLanguageGrammarParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpression(GoodLanguageGrammarParser.SimpleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodLanguageGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(GoodLanguageGrammarParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodLanguageGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(GoodLanguageGrammarParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodLanguageGrammarParser#signedFactor}.
	 * @param ctx the parse tree
	 */
	void enterSignedFactor(GoodLanguageGrammarParser.SignedFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodLanguageGrammarParser#signedFactor}.
	 * @param ctx the parse tree
	 */
	void exitSignedFactor(GoodLanguageGrammarParser.SignedFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodLanguageGrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(GoodLanguageGrammarParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodLanguageGrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(GoodLanguageGrammarParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberConst}
	 * labeled alternative in {@link GoodLanguageGrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void enterNumberConst(GoodLanguageGrammarParser.NumberConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberConst}
	 * labeled alternative in {@link GoodLanguageGrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void exitNumberConst(GoodLanguageGrammarParser.NumberConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalConst}
	 * labeled alternative in {@link GoodLanguageGrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void enterLiteralConst(GoodLanguageGrammarParser.LiteralConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalConst}
	 * labeled alternative in {@link GoodLanguageGrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void exitLiteralConst(GoodLanguageGrammarParser.LiteralConstContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodLanguageGrammarParser#varName}.
	 * @param ctx the parse tree
	 */
	void enterVarName(GoodLanguageGrammarParser.VarNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodLanguageGrammarParser#varName}.
	 * @param ctx the parse tree
	 */
	void exitVarName(GoodLanguageGrammarParser.VarNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodLanguageGrammarParser#complexStatement}.
	 * @param ctx the parse tree
	 */
	void enterComplexStatement(GoodLanguageGrammarParser.ComplexStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodLanguageGrammarParser#complexStatement}.
	 * @param ctx the parse tree
	 */
	void exitComplexStatement(GoodLanguageGrammarParser.ComplexStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodLanguageGrammarParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(GoodLanguageGrammarParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodLanguageGrammarParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(GoodLanguageGrammarParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodLanguageGrammarParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatement(GoodLanguageGrammarParser.LoopStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodLanguageGrammarParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatement(GoodLanguageGrammarParser.LoopStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodLanguageGrammarParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(GoodLanguageGrammarParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodLanguageGrammarParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(GoodLanguageGrammarParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodLanguageGrammarParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(GoodLanguageGrammarParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodLanguageGrammarParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(GoodLanguageGrammarParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodLanguageGrammarParser#maximumPriorityOperator}.
	 * @param ctx the parse tree
	 */
	void enterMaximumPriorityOperator(GoodLanguageGrammarParser.MaximumPriorityOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodLanguageGrammarParser#maximumPriorityOperator}.
	 * @param ctx the parse tree
	 */
	void exitMaximumPriorityOperator(GoodLanguageGrammarParser.MaximumPriorityOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodLanguageGrammarParser#middlePriorityOperator}.
	 * @param ctx the parse tree
	 */
	void enterMiddlePriorityOperator(GoodLanguageGrammarParser.MiddlePriorityOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodLanguageGrammarParser#middlePriorityOperator}.
	 * @param ctx the parse tree
	 */
	void exitMiddlePriorityOperator(GoodLanguageGrammarParser.MiddlePriorityOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodLanguageGrammarParser#minimalPriorityOperator}.
	 * @param ctx the parse tree
	 */
	void enterMinimalPriorityOperator(GoodLanguageGrammarParser.MinimalPriorityOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodLanguageGrammarParser#minimalPriorityOperator}.
	 * @param ctx the parse tree
	 */
	void exitMinimalPriorityOperator(GoodLanguageGrammarParser.MinimalPriorityOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodLanguageGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(GoodLanguageGrammarParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodLanguageGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(GoodLanguageGrammarParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodLanguageGrammarParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(GoodLanguageGrammarParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodLanguageGrammarParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(GoodLanguageGrammarParser.BoolContext ctx);
}