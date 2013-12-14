package org.yinwang.pysonar.ast;

import org.jetbrains.annotations.NotNull;
import org.yinwang.pysonar.Analyzer;
import org.yinwang.pysonar.State;
import org.yinwang.pysonar.types.Type;


public class Regexp extends Node {
    public String pattern;
    public String end;


    public Regexp(String pattern, String regexpEnd, int start, int end) {
        super(start, end);
        this.pattern = pattern;
        this.end = regexpEnd;
    }


    @NotNull
    @Override
    protected Type transform(State s) {
        return Analyzer.self.builtins.BaseStr;
    }


    @Override
    public void visit(NodeVisitor visitor) {

    }
}