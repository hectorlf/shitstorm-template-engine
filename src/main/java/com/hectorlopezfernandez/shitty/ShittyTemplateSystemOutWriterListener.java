package com.hectorlopezfernandez.shitty;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import com.hectorlopezfernandez.shitty.ShittyTemplateParser.ContentContext;
import com.hectorlopezfernandez.shitty.ShittyTemplateParser.TemplateContext;
import com.hectorlopezfernandez.shitty.ShittyTemplateParser.WriterContext;

public class ShittyTemplateSystemOutWriterListener implements ShittyTemplateListener {

    @Override
    public void visitTerminal(TerminalNode node) {
        System.out.println(node.getText());
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        System.out.println(node.getText());
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
    }

    @Override
    public void enterTemplate(TemplateContext ctx) {
        System.out.println("entering template");
    }

    @Override
    public void exitTemplate(TemplateContext ctx) {
        System.out.println("exiting template");
    }

    @Override
    public void enterContent(ContentContext ctx) {
        System.out.println("entering content");
    }

    @Override
    public void exitContent(ContentContext ctx) {
        System.out.println("exiting content");
    }

    @Override
    public void enterWriter(WriterContext ctx) {
        System.out.println("entering writer");
    }

    @Override
    public void exitWriter(WriterContext ctx) {
        System.out.println("exiting writer");
    }

}
