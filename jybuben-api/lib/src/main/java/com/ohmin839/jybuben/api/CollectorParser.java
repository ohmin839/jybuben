package com.ohmin839.jybuben.api;

import java.util.LinkedList;
import java.util.List;

import org.parboiled.BaseParser;
import org.parboiled.Rule;
import org.parboiled.annotations.BuildParseTree;
import org.parboiled.support.ValueStack;

@BuildParseTree
class CollectorParser extends BaseParser<List<String>> {
    Rule InputLine() {
        return Sequence(OneOrMore(FirstOf(Word(), ANY)), EOI);
    }
    Rule Word() {
        return Sequence(OneOrMore(Alphabet()), pushList());
    }
    Rule Alphabet() {
        return AnyOf("ԱԲԳԴԵԶԷԸԹԺԻԼԽԾԿՀՁՂՃՄՅՆՇՈՉՊՋՌՍՎՏՐՑՒՓՔՕՖաբգդեզէըթժիլխծկհձղճմյնշոչպջռսվտրցւփքօֆև");
    }

    boolean pushList() {
        ValueStack<List<String>> stack = getContext().getValueStack();
        if (stack.isEmpty()) {
            List<String> list = new LinkedList<>();
            list.add(match());
            stack.push(list);
        } else {
            List<String> list = stack.peek();
            list.add(match());
        }
        return true;
    }
}