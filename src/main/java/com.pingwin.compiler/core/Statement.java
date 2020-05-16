package com.pingwin.compiler.core;

import com.pingwin.compiler.gen.PingwinLanguageParser;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

import javax.annotation.Nullable;

public enum Statement {

    ASSIGN(PingwinLanguageParser.Assign_varContext.class, (ctx, visitor) -> {
        return ctx.assign_var().accept(visitor);
    }),
    ASSIGN_SET(PingwinLanguageParser.Assign_setContext.class, (ctx, visitor) -> {
        return ctx.assign_set().accept(visitor);
    }),
    PRINT(PingwinLanguageParser.PrintContext.class, (ctx, visitor) -> {
        return ctx.print().accept(visitor);
    }),
    OPERATION_INT(PingwinLanguageParser.OperationsContext.class, (ctx, visitor) -> {
        return ctx.operations().accept(visitor);
    }),
    WHILE_CICLE(PingwinLanguageParser.While_cicleContext.class, (ctx, visitor) -> {
        return ctx.while_cicle().accept(visitor);
    }),
    IF_THEN(PingwinLanguageParser.If_thenContext.class, (ctx, visitor) -> {
        return ctx.if_then().accept(visitor);
    }),
    METHOD_INVOCATION(PingwinLanguageParser.Method_invokationContext.class, (ctx, visitor) -> {
        return ctx.method_invokation().accept(visitor);
    }),
    METHOD_INVOCATION_AND_ASSIGN(PingwinLanguageParser.Assign_var_method_invocationContext.class, (ctx, visitor) -> {
        return ctx.assign_var_method_invocation().accept(visitor);
    }),
    SET_OPERATIONS(PingwinLanguageParser.Operarions_with_setContext.class, (ctx, visitor) -> {
        return ctx.operarions_with_set().accept(visitor);
    }),
    FOR_EACH(PingwinLanguageParser.For_eachContext.class, (ctx, visitor) -> {
        return ctx.for_each().accept(visitor);
    });

    private final Class clazz;
    private final InvocationAction<String> action;

    Statement(Class clazz, InvocationAction<String> action) {
        this.clazz = clazz;
        this.action = action;
    }

    @Nullable
    public static Statement findStatement(ParserRuleContext ctx) {
        for (Statement statement : Statement.values()) {
            if (ctx.getRuleContext(statement.clazz, 0) != null) {
                return statement;
            }
        }
        return null;
    }

    public String invoke(PingwinLanguageParser.StatementContext ctx, ParseTreeVisitor<String> visitor) {
        return action.invoke(ctx, visitor);
    }

    private interface InvocationAction<T> {

        T invoke(PingwinLanguageParser.StatementContext ctx, ParseTreeVisitor<T> visitor);

    }

}
