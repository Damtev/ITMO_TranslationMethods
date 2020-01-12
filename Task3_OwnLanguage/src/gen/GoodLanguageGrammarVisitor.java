// Generated from /media/damtev/Storage/ITMO/ITMO_MT/Task3_OwnLanguage/GoodLanguageGrammar.g4 by ANTLR 4.7.2
package gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GoodLanguageGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GoodLanguageGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GoodLanguageGrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(GoodLanguageGrammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodLanguageGrammarParser#blocks}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlocks(GoodLanguageGrammarParser.BlocksContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodLanguageGrammarParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(GoodLanguageGrammarParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodLanguageGrammarParser#functionBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBlock(GoodLanguageGrammarParser.FunctionBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodLanguageGrammarParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(GoodLanguageGrammarParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodLanguageGrammarParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(GoodLanguageGrammarParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodLanguageGrammarParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(GoodLanguageGrammarParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodLanguageGrammarParser#mainBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainBlock(GoodLanguageGrammarParser.MainBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodLanguageGrammarParser#codeBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeBlock(GoodLanguageGrammarParser.CodeBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodLanguageGrammarParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(GoodLanguageGrammarParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodLanguageGrammarParser#simpleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleStatement(GoodLanguageGrammarParser.SimpleStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodLanguageGrammarParser#assignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(GoodLanguageGrammarParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodLanguageGrammarParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(GoodLanguageGrammarParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodLanguageGrammarParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(GoodLanguageGrammarParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodLanguageGrammarParser#variableDeclarationInsideCodeBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationInsideCodeBlock(GoodLanguageGrammarParser.VariableDeclarationInsideCodeBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodLanguageGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(GoodLanguageGrammarParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodLanguageGrammarParser#simpleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExpression(GoodLanguageGrammarParser.SimpleExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodLanguageGrammarParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(GoodLanguageGrammarParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodLanguageGrammarParser#signedFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignedFactor(GoodLanguageGrammarParser.SignedFactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodLanguageGrammarParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(GoodLanguageGrammarParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberConst}
	 * labeled alternative in {@link GoodLanguageGrammarParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberConst(GoodLanguageGrammarParser.NumberConstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalConst}
	 * labeled alternative in {@link GoodLanguageGrammarParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralConst(GoodLanguageGrammarParser.LiteralConstContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodLanguageGrammarParser#varName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarName(GoodLanguageGrammarParser.VarNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodLanguageGrammarParser#complexStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexStatement(GoodLanguageGrammarParser.ComplexStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodLanguageGrammarParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(GoodLanguageGrammarParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodLanguageGrammarParser#loopStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopStatement(GoodLanguageGrammarParser.LoopStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodLanguageGrammarParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(GoodLanguageGrammarParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodLanguageGrammarParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(GoodLanguageGrammarParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodLanguageGrammarParser#maximumPriorityOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaximumPriorityOperator(GoodLanguageGrammarParser.MaximumPriorityOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodLanguageGrammarParser#middlePriorityOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMiddlePriorityOperator(GoodLanguageGrammarParser.MiddlePriorityOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodLanguageGrammarParser#minimalPriorityOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinimalPriorityOperator(GoodLanguageGrammarParser.MinimalPriorityOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodLanguageGrammarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(GoodLanguageGrammarParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodLanguageGrammarParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(GoodLanguageGrammarParser.BoolContext ctx);
}