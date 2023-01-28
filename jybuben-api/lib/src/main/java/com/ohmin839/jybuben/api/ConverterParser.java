package com.ohmin839.jybuben.api;

import java.util.LinkedList;
import java.util.List;

import org.parboiled.BaseParser;
import org.parboiled.Rule;
import org.parboiled.annotations.BuildParseTree;
import org.parboiled.support.ValueStack;

@BuildParseTree
public class ConverterParser extends BaseParser<String> {

    Rule InputLine() {
        return Sequence(Letters(), EOI);
    }
    Rule Letters() {
        return OneOrMore(Letter(), push(joinLetters(getContext().getValueStack())));
    }
    Rule Letter() {
        return FirstOf(
            LargeA(),
            LargeB()
        );
    }
    Rule LargeA() {
        return Sequence(String("A"), push(convertLargeA(match())));
    }
    Rule LargeB() {
        return Sequence(String("B"), push(convertLargeB(match())));
    }
    Rule Anychar() {
        return Sequence(ANY, push(match()));
    }

    String joinLetters(ValueStack<String> stack) {
        List<String> chanks = new LinkedList<>();
        while (!stack.isEmpty()) {
            chanks.add(0, stack.pop());
        }
        return String.join("", chanks);
    }
    String convertLargeA(String text) {
        return "\u0531";
    }
    String convertLargeB(String text) {
        return "\u0532";
    }
    String convertLargeC(String text) {
        if (text.contains("h")) {
            return "\u0549";
        } else if (text.contains("'")) {
            return "\u053E";
        }
        return "\u0551";
    }
}
