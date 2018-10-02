// Generated from C:/Users/Christian/IdeaProjects/CompilerAlf1/src/main/java\simpleCalc.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link simpleCalcParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface simpleCalcVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link simpleCalcParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(simpleCalcParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleCalcParser#statseq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatseq(simpleCalcParser.StatseqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link simpleCalcParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(simpleCalcParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifelse}
	 * labeled alternative in {@link simpleCalcParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfelse(simpleCalcParser.IfelseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if}
	 * labeled alternative in {@link simpleCalcParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(simpleCalcParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code loop}
	 * labeled alternative in {@link simpleCalcParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(simpleCalcParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(simpleCalcParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesis(simpleCalcParser.ParenthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(simpleCalcParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(simpleCalcParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BigSmall}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBigSmall(simpleCalcParser.BigSmallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(simpleCalcParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(simpleCalcParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Constant}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(simpleCalcParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code And}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(simpleCalcParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqualNot}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualNot(simpleCalcParser.EqualNotContext ctx);
}