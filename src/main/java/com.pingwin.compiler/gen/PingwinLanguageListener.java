// Generated from D:/yapis\PingwinLanguage.g4 by ANTLR 4.8
package com.pingwin.compiler.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PingwinLanguageParser}.
 */
public interface PingwinLanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PingwinLanguageParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PingwinLanguageParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PingwinLanguageParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PingwinLanguageParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PingwinLanguageParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(PingwinLanguageParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PingwinLanguageParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(PingwinLanguageParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PingwinLanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PingwinLanguageParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PingwinLanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PingwinLanguageParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PingwinLanguageParser#digit_expression}.
	 * @param ctx the parse tree
	 */
	void enterDigit_expression(PingwinLanguageParser.Digit_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PingwinLanguageParser#digit_expression}.
	 * @param ctx the parse tree
	 */
	void exitDigit_expression(PingwinLanguageParser.Digit_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PingwinLanguageParser#intialize_set}.
	 * @param ctx the parse tree
	 */
	void enterIntialize_set(PingwinLanguageParser.Intialize_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link PingwinLanguageParser#intialize_set}.
	 * @param ctx the parse tree
	 */
	void exitIntialize_set(PingwinLanguageParser.Intialize_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link PingwinLanguageParser#intialize_element}.
	 * @param ctx the parse tree
	 */
	void enterIntialize_element(PingwinLanguageParser.Intialize_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PingwinLanguageParser#intialize_element}.
	 * @param ctx the parse tree
	 */
	void exitIntialize_element(PingwinLanguageParser.Intialize_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PingwinLanguageParser#assign_var_method_invocation}.
	 * @param ctx the parse tree
	 */
	void enterAssign_var_method_invocation(PingwinLanguageParser.Assign_var_method_invocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PingwinLanguageParser#assign_var_method_invocation}.
	 * @param ctx the parse tree
	 */
	void exitAssign_var_method_invocation(PingwinLanguageParser.Assign_var_method_invocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PingwinLanguageParser#assign_set}.
	 * @param ctx the parse tree
	 */
	void enterAssign_set(PingwinLanguageParser.Assign_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link PingwinLanguageParser#assign_set}.
	 * @param ctx the parse tree
	 */
	void exitAssign_set(PingwinLanguageParser.Assign_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link PingwinLanguageParser#assign_var}.
	 * @param ctx the parse tree
	 */
	void enterAssign_var(PingwinLanguageParser.Assign_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link PingwinLanguageParser#assign_var}.
	 * @param ctx the parse tree
	 */
	void exitAssign_var(PingwinLanguageParser.Assign_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link PingwinLanguageParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(PingwinLanguageParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link PingwinLanguageParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(PingwinLanguageParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link PingwinLanguageParser#operations}.
	 * @param ctx the parse tree
	 */
	void enterOperations(PingwinLanguageParser.OperationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PingwinLanguageParser#operations}.
	 * @param ctx the parse tree
	 */
	void exitOperations(PingwinLanguageParser.OperationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PingwinLanguageParser#operarions_with_set}.
	 * @param ctx the parse tree
	 */
	void enterOperarions_with_set(PingwinLanguageParser.Operarions_with_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link PingwinLanguageParser#operarions_with_set}.
	 * @param ctx the parse tree
	 */
	void exitOperarions_with_set(PingwinLanguageParser.Operarions_with_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link PingwinLanguageParser#simple_compare}.
	 * @param ctx the parse tree
	 */
	void enterSimple_compare(PingwinLanguageParser.Simple_compareContext ctx);
	/**
	 * Exit a parse tree produced by {@link PingwinLanguageParser#simple_compare}.
	 * @param ctx the parse tree
	 */
	void exitSimple_compare(PingwinLanguageParser.Simple_compareContext ctx);
	/**
	 * Enter a parse tree produced by {@link PingwinLanguageParser#hard_compare}.
	 * @param ctx the parse tree
	 */
	void enterHard_compare(PingwinLanguageParser.Hard_compareContext ctx);
	/**
	 * Exit a parse tree produced by {@link PingwinLanguageParser#hard_compare}.
	 * @param ctx the parse tree
	 */
	void exitHard_compare(PingwinLanguageParser.Hard_compareContext ctx);
	/**
	 * Enter a parse tree produced by {@link PingwinLanguageParser#while_cicle}.
	 * @param ctx the parse tree
	 */
	void enterWhile_cicle(PingwinLanguageParser.While_cicleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PingwinLanguageParser#while_cicle}.
	 * @param ctx the parse tree
	 */
	void exitWhile_cicle(PingwinLanguageParser.While_cicleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PingwinLanguageParser#if_then}.
	 * @param ctx the parse tree
	 */
	void enterIf_then(PingwinLanguageParser.If_thenContext ctx);
	/**
	 * Exit a parse tree produced by {@link PingwinLanguageParser#if_then}.
	 * @param ctx the parse tree
	 */
	void exitIf_then(PingwinLanguageParser.If_thenContext ctx);
	/**
	 * Enter a parse tree produced by {@link PingwinLanguageParser#for_each}.
	 * @param ctx the parse tree
	 */
	void enterFor_each(PingwinLanguageParser.For_eachContext ctx);
	/**
	 * Exit a parse tree produced by {@link PingwinLanguageParser#for_each}.
	 * @param ctx the parse tree
	 */
	void exitFor_each(PingwinLanguageParser.For_eachContext ctx);
	/**
	 * Enter a parse tree produced by {@link PingwinLanguageParser#global_assign_set}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_assign_set(PingwinLanguageParser.Global_assign_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link PingwinLanguageParser#global_assign_set}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_assign_set(PingwinLanguageParser.Global_assign_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link PingwinLanguageParser#global_assign_var}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_assign_var(PingwinLanguageParser.Global_assign_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link PingwinLanguageParser#global_assign_var}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_assign_var(PingwinLanguageParser.Global_assign_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link PingwinLanguageParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(PingwinLanguageParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PingwinLanguageParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(PingwinLanguageParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PingwinLanguageParser#type_1}.
	 * @param ctx the parse tree
	 */
	void enterType_1(PingwinLanguageParser.Type_1Context ctx);
	/**
	 * Exit a parse tree produced by {@link PingwinLanguageParser#type_1}.
	 * @param ctx the parse tree
	 */
	void exitType_1(PingwinLanguageParser.Type_1Context ctx);
	/**
	 * Enter a parse tree produced by {@link PingwinLanguageParser#signature}.
	 * @param ctx the parse tree
	 */
	void enterSignature(PingwinLanguageParser.SignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link PingwinLanguageParser#signature}.
	 * @param ctx the parse tree
	 */
	void exitSignature(PingwinLanguageParser.SignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link PingwinLanguageParser#subprogram_return}.
	 * @param ctx the parse tree
	 */
	void enterSubprogram_return(PingwinLanguageParser.Subprogram_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PingwinLanguageParser#subprogram_return}.
	 * @param ctx the parse tree
	 */
	void exitSubprogram_return(PingwinLanguageParser.Subprogram_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link PingwinLanguageParser#subprogram_non_return}.
	 * @param ctx the parse tree
	 */
	void enterSubprogram_non_return(PingwinLanguageParser.Subprogram_non_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PingwinLanguageParser#subprogram_non_return}.
	 * @param ctx the parse tree
	 */
	void exitSubprogram_non_return(PingwinLanguageParser.Subprogram_non_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link PingwinLanguageParser#block_return}.
	 * @param ctx the parse tree
	 */
	void enterBlock_return(PingwinLanguageParser.Block_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PingwinLanguageParser#block_return}.
	 * @param ctx the parse tree
	 */
	void exitBlock_return(PingwinLanguageParser.Block_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link PingwinLanguageParser#block_non_return}.
	 * @param ctx the parse tree
	 */
	void enterBlock_non_return(PingwinLanguageParser.Block_non_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PingwinLanguageParser#block_non_return}.
	 * @param ctx the parse tree
	 */
	void exitBlock_non_return(PingwinLanguageParser.Block_non_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link PingwinLanguageParser#signature_method_invokation}.
	 * @param ctx the parse tree
	 */
	void enterSignature_method_invokation(PingwinLanguageParser.Signature_method_invokationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PingwinLanguageParser#signature_method_invokation}.
	 * @param ctx the parse tree
	 */
	void exitSignature_method_invokation(PingwinLanguageParser.Signature_method_invokationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PingwinLanguageParser#method_invokation}.
	 * @param ctx the parse tree
	 */
	void enterMethod_invokation(PingwinLanguageParser.Method_invokationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PingwinLanguageParser#method_invokation}.
	 * @param ctx the parse tree
	 */
	void exitMethod_invokation(PingwinLanguageParser.Method_invokationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PingwinLanguageParser#global_program}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_program(PingwinLanguageParser.Global_programContext ctx);
	/**
	 * Exit a parse tree produced by {@link PingwinLanguageParser#global_program}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_program(PingwinLanguageParser.Global_programContext ctx);
}