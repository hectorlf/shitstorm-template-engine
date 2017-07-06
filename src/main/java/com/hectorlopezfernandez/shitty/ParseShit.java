package com.hectorlopezfernandez.shitty;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class ParseShit {

    public static void main(String[] args) {
        CharStream input = CharStreams.fromString("hello {{ shitty }} world");
        ShittyTemplateLexer lexer = new ShittyTemplateLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ShittyTemplateParser parser = new ShittyTemplateParser(tokens);
        ParseTree tree = parser.template();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new ShittyTemplateSystemOutWriterListener(), tree);
    }

}
