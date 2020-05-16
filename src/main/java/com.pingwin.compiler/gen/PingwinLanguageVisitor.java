// Generated from D:/yapis\PingwinLanguage.g4 by ANTLR 4.8
package com.pingwin.compiler.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PingwinLanguageParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PingwinLanguageVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PingwinLanguageParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(PingwinLanguageParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PingwinLanguageParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(PingwinLanguageParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PingwinLanguageParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(PingwinLanguageParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PingwinLanguageParser#digit_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigit_expression(PingwinLanguageParser.Digit_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PingwinLanguageParser#intialize_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntialize_set(PingwinLanguageParser.Intialize_setContext ctx);
	/**
	 * Visit a parse tree produced by {@link PingwinLanguageParser#intialize_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntialize_element(PingwinLanguageParser.Intialize_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PingwinLanguageParser#assign_var_method_invocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_var_method_invocation(PingwinLanguageParser.Assign_var_method_invocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PingwinLanguageParser#assign_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_set(PingwinLanguageParser.Assign_setContext ctx);
	/**
	 * Visit a parse tree produced by {@link PingwinLanguageParser#assign_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_var(PingwinLanguageParser.Assign_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link PingwinLanguageParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(PingwinLanguageParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link PingwinLanguageParser#operations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperations(PingwinLanguageParser.OperationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PingwinLanguageParser#operarions_with_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperarions_with_set(PingwinLanguageParser.Operarions_with_setContext ctx);
	/**
	 * Visit a parse tree produced by {@link PingwinLanguageParser#simple_compare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_compare(PingwinLanguageParser.Simple_compareContext ctx);
	/**
	 * Visit a parse tree produced by {@link PingwinLanguageParser#hard_compare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHard_compare(PingwinLanguageParser.Hard_compareContext ctx);
	/**
	 * Visit a parse tree produced by {@link PingwinLanguageParser#while_cicle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_cicle(PingwinLanguageParser.While_cicleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PingwinLanguageParser#if_then}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_then(PingwinLanguageParser.If_thenContext ctx);
	/**
	 * Visit a parse tree produced by {@link PingwinLanguageParser#for_each}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_each(PingwinLanguageParser.For_eachContext ctx);
	/**
	 * Visit a parse tree produced by {@link PingwinLanguageParser#global_assign_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_assign_set(PingwinLanguageParser.Global_assign_setContext ctx);
	/**
	 * Visit a parse tree produced by {@link PingwinLanguageParser#global_assign_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_assign_var(PingwinLanguageParser.Global_assign_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link PingwinLanguageParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(PingwinLanguageParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PingwinLanguageParser#type_1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_1(PingwinLanguageParser.Type_1Context ctx);
	/**
	 * Visit a parse tree produced by {@link PingwinLanguageParser#signature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignature(PingwinLanguageParser.SignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link PingwinLanguageParser#subprogram_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubprogram_return(PingwinLanguageParser.Subprogram_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link PingwinLanguageParser#subprogram_non_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubprogram_non_return(PingwinLanguageParser.Subprogram_non_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link PingwinLanguageParser#block_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_return(PingwinLanguageParser.Block_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link PingwinLanguageParser#block_non_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_non_return(PingwinLanguageParser.Block_non_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link PingwinLanguageParser#signature_method_invokation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignature_method_invokation(PingwinLanguageParser.Signature_method_invokationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PingwinLanguageParser#method_invokation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_invokation(PingwinLanguageParser.Method_invokationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PingwinLanguageParser#global_program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_program(PingwinLanguageParser.Global_programContext ctx);
}