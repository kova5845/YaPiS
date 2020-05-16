package com.pingwin.compiler;

import com.pingwin.compiler.core.PingwinLanguageParserV1;
import com.pingwin.compiler.core.PingwinLanguageVisitorImplV1;
import com.pingwin.compiler.gen.PingwinLanguageLexer;
import com.pingwin.compiler.gen.PingwinLanguageVisitor;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.swing.*;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileWriter;

public class Main {

    public static void main(String[] args) {
        try {
            ANTLRInputStream input = new ANTLRInputStream(
                    new FileInputStream("src/main/resources/test.pingwin"));
            PingwinLanguageLexer lexer = new PingwinLanguageLexer(input);
            PingwinLanguageParserV1 parser = new PingwinLanguageParserV1(new CommonTokenStream(lexer));

            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ParseTree tree = parser.global_program();
            if (!byteArrayOutputStream.toString().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Lexer error: " + byteArrayOutputStream.toString());
                return;
            }
            PingwinLanguageVisitor<String> listVisitor = new PingwinLanguageVisitorImplV1(parser, "RunProgram");
            String output = listVisitor.visit(tree);
            FileWriter fileWriter = new FileWriter("RunProgram.java");
            fileWriter.write(output);
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
