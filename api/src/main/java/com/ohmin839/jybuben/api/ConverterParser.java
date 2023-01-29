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
        return Sequence(OneOrMore(Letter()), push(joinLetters(getContext().getValueStack())));
    }
    Rule Letter() {
        return FirstOf(
            LargeA(),
            LargeB(),
            LargeC(),
            LargeD(),
            LargeE(),
            LargeF(),
            LargeG(),
            LargeH(),
            LargeI(),
            LargeJ(),
            LargeK(),
            LargeL(),
            LargeM(),
            LargeN(),
            LargeO(),
            LargeP(),
            LargeQ(),
            LargeR(),
            LargeS(),
            LargeT(),
            LargeU(),
            LargeV(),
            LargeW(),
            LargeX(),
            LargeY(),
            LargeZ(),
            SmallA(),
            SmallB(),
            SmallC(),
            SmallD(),
            SmallE(),
            SmallF(),
            SmallG(),
            SmallH(),
            SmallI(),
            SmallJ(),
            SmallK(),
            SmallL(),
            SmallM(),
            SmallN(),
            SmallO(),
            SmallP(),
            SmallQ(),
            SmallR(),
            SmallS(),
            SmallT(),
            SmallU(),
            SmallV(),
            SmallW(),
            SmallX(),
            SmallY(),
            SmallZ(),
            Dollar(),
            Backquote(),
            Colon(),
            LeftGuillemet(),
            RightGuillemet(),
            Question(),
            Exclamation(),
            AnyChar()
        );
    }
    Rule LargeA() {
        return Sequence(String("A"), push(convertLargeA(match())));
    }
    Rule LargeB() {
        return Sequence(String("B"), push(convertLargeB(match())));
    }
    Rule LargeC() {
        return Sequence(
            String("C"),
            Optional(FirstOf(String("h"), String("'"))),
            push(convertLargeC(match())));
    }
    Rule LargeD() {
        return Sequence(
            String("D"),
            Optional(String("z")),
            push(convertLargeD(match())));
    }
    Rule LargeE() {
        return Sequence(
            String("E"),
            Optional(String("'")),
            push(convertLargeE(match())));
    }
    Rule LargeF() {
        return Sequence(String("F"), push(convertLargeF(match())));
    }
    Rule LargeG() {
        return Sequence(
            String("G"),
            Optional(String("h")),
            push(convertLargeG(match())));
    }
    Rule LargeH() {
        return Sequence(String("H"), push(convertLargeH(match())));
    }
    Rule LargeI() {
        return Sequence(String("I"), push(convertLargeI(match())));
    }
    Rule LargeJ() {
        return Sequence(String("J"), push(convertLargeJ(match())));
    }
    Rule LargeK() {
        return Sequence(String("K"), push(convertLargeK(match())));
    }
    Rule LargeL() {
        return Sequence(String("L"), push(convertLargeL(match())));
    }
    Rule LargeM() {
        return Sequence(String("M"), push(convertLargeM(match())));
    }
    Rule LargeN() {
        return Sequence(String("N"), push(convertLargeN(match())));
    }
    Rule LargeO() {
        return Sequence(String("O"), push(convertLargeO(match())));
    }
    Rule LargeP() {
        return Sequence(
            String("P"),
            Optional(String("'")),
            push(convertLargeP(match())));
    }
    Rule LargeQ() {
        return Sequence(String("Q"), push(convertLargeQ(match())));
    }
    Rule LargeR() {
        return Sequence(
            String("R"),
            Optional(String("r")),
            push(convertLargeR(match())));
    }
    Rule LargeS() {
        return Sequence(
            String("S"),
            Optional(String("h")),
            push(convertLargeS(match())));
    }
    Rule LargeT() {
        return Sequence(
            String("T"),
            Optional(FirstOf(String("w"), String("'"))),
            push(convertLargeT(match())));
    }
    Rule LargeU() {
        return Sequence(String("U"), push(convertLargeU(match())));
    }
    Rule LargeV() {
        return Sequence(
            String("V"),
            Optional(String("o")),
            push(convertLargeV(match())));
    }
    Rule LargeW() {
        return Sequence(String("W"), push(convertLargeW(match())));
    }
    Rule LargeX() {
        return Sequence(String("X"), push(convertLargeX(match())));
    }
    Rule LargeY() {
        return Sequence(
            String("Y"),
            Optional(String("'")),
            push(convertLargeY(match())));
    }
    Rule LargeZ() {
        return Sequence(
            String("Z"),
            Optional(String("h")),
            push(convertLargeZ(match())));
    }
    Rule SmallA() {
        return Sequence(String("a"), push(convertSmallA(match())));
    }
    Rule SmallB() {
        return Sequence(String("b"), push(convertSmallB(match())));
    }
    Rule SmallC() {
        return Sequence(
            String("c"),
            Optional(FirstOf(String("h"), String("'"))),
            push(convertSmallC(match())));
    }
    Rule SmallD() {
        return Sequence(
            String("d"),
            Optional(String("z")),
            push(convertSmallD(match())));
    }
    Rule SmallE() {
        return Sequence(
            String("e"),
            Optional(FirstOf(String("v"), String("'"))),
            push(convertSmallE(match())));
    }
    Rule SmallF() {
        return Sequence(String("f"), push(convertSmallF(match())));
    }
    Rule SmallG() {
        return Sequence(
            String("g"),
            Optional(String("h")),
            push(convertSmallG(match())));
    }
    Rule SmallH() {
        return Sequence(String("h"), push(convertSmallH(match())));
    }
    Rule SmallI() {
        return Sequence(String("i"), push(convertSmallI(match())));
    }
    Rule SmallJ() {
        return Sequence(String("j"), push(convertSmallJ(match())));
    }
    Rule SmallK() {
        return Sequence(String("k"), push(convertSmallK(match())));
    }
    Rule SmallL() {
        return Sequence(String("l"), push(convertSmallL(match())));
    }
    Rule SmallM() {
        return Sequence(String("m"), push(convertSmallM(match())));
    }
    Rule SmallN() {
        return Sequence(String("n"), push(convertSmallN(match())));
    }
    Rule SmallO() {
        return Sequence(String("o"), push(convertSmallO(match())));
    }
    Rule SmallP() {
        return Sequence(
            String("p"),
            Optional(String("'")),
            push(convertSmallP(match())));
    }
    Rule SmallQ() {
        return Sequence(String("q"), push(convertSmallQ(match())));
    }
    Rule SmallR() {
        return Sequence(
            String("r"),
            Optional(String("r")),
            push(convertSmallR(match())));
    }
    Rule SmallS() {
        return Sequence(
            String("s"),
            Optional(String("h")),
            push(convertSmallS(match())));
    }
    Rule SmallT() {
        return Sequence(
            String("t"),
            Optional(FirstOf(String("w"), String("'"))),
            push(convertSmallT(match())));
    }
    Rule SmallU() {
        return Sequence(String("u"), push(convertSmallU(match())));
    }
    Rule SmallV() {
        return Sequence(
            String("v"),
            Optional(String("o")),
            push(convertSmallV(match())));
    }
    Rule SmallW() {
        return Sequence(String("w"), push(convertSmallW(match())));
    }
    Rule SmallX() {
        return Sequence(String("x"), push(convertSmallX(match())));
    }
    Rule SmallY() {
        return Sequence(
            String("y"),
            Optional(String("'")),
            push(convertSmallY(match())));
    }
    Rule SmallZ() {
        return Sequence(
            String("z"),
            Optional(String("h")),
            push(convertSmallZ(match())));
    }
    Rule Dollar() {
        return Sequence(String("$"), push(convertDollar(match())));
    }
    Rule Backquote() {
        return Sequence(String("`"), push(convertBackquote(match())));
    }
    Rule Colon() {
        return Sequence(String(":"), push(convertColon(match())));
    }
    Rule LeftGuillemet() {
        return Sequence(String("<<"), push(convertLeftGuillemet(match())));
    }
    Rule RightGuillemet() {
        return Sequence(String(">>"), push(convertRightGuillemet(match())));
    }
    Rule Question() {
        return Sequence(String("?"), push(convertQuestion(match())));
    }
    Rule Exclamation() {
        return Sequence(
            String("!"),
            Optional(String("~")),
            push(convertExclamation(match())));
    }
    Rule AnyChar() {
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
    String convertLargeD(String text) {
        if (text.contains("z")) {
            return "\u0541";
        }
        return "\u0534";
    }
    String convertLargeE(String text) {
        if (text.contains("'")) {
            return "\u0537";
        }
        return "\u0535";
    }
    String convertLargeF(String text) {
        return "\u0556";
    }
    String convertLargeG(String text) {
        if (text.contains("h")) {
            return "\u0542";
        }
        return "\u0533";
    }
    String convertLargeH(String text) {
        return "\u0540";
    }
    String convertLargeI(String text) {
        return "\u053B";
    }
    String convertLargeJ(String text) {
        return "\u054B";
    }
    String convertLargeK(String text) {
        return "\u053F";
    }
    String convertLargeL(String text) {
        return "\u053C";
    }
    String convertLargeM(String text) {
        return "\u0544";
    }
    String convertLargeN(String text) {
        return "\u0546";
    }
    String convertLargeO(String text) {
        return "\u0555";
    }
    String convertLargeP(String text) {
        if (text.contains("'")) {
            return "\u0553";
        }
        return "\u054A";
    }
    String convertLargeQ(String text) {
        return "\u0554";
    }
    String convertLargeR(String text) {
        if (text.contains("r")) {
            return "\u054C";
        }
        return "\u0550";
    }
    String convertLargeS(String text) {
        if (text.contains("h")) {
            return "\u0547";
        }
        return "\u054D";
    }
    String convertLargeT(String text) {
        if (text.contains("w")) {
            return "\u0543";
        } else if (text.contains("'")) {
            return "\u0539";
        }
        return "\u054F";
    }
    String convertLargeU(String text) {
        return "\u0548\u0582";
    }
    String convertLargeV(String text) {
        if (text.contains("o")) {
            return "\u0548";
        }
        return "\u054E";
    }
    String convertLargeW(String text) {
        return "\u0552";
    }
    String convertLargeX(String text) {
        return "\u053D";
    }
    String convertLargeY(String text) {
        if (text.contains("'")) {
            return "\u0538";
        }
        return "\u0545";
    }
    String convertLargeZ(String text) {
        if (text.contains("h")) {
            return "\u053A";
        }
        return "\u0536";
    }
    String convertSmallA(String text) {
        return "\u0561";
    }
    String convertSmallB(String text) {
        return "\u0562";
    }
    String convertSmallC(String text) {
        if (text.contains("h")) {
            return "\u0579";
        } else if (text.contains("'")) {
            return "\u056E";
        }
        return "\u0581";
    }
    String convertSmallD(String text) {
        if (text.contains("z")) {
            return "\u0571";
        }
        return "\u0564";
    }
    String convertSmallE(String text) {
        if (text.contains("v")) {
            return "\u0587";
        } else if (text.contains("'")) {
            return "\u0567";
        }
        return "\u0565";
    }
    String convertSmallF(String text) {
        return "\u0586";
    }
    String convertSmallG(String text) {
        if (text.contains("h")) {
            return "\u0572";
        }
        return "\u0563";
    }
    String convertSmallH(String text) {
        return "\u0570";
    }
    String convertSmallI(String text) {
        return "\u056B";
    }
    String convertSmallJ(String text) {
        return "\u057B";
    }
    String convertSmallK(String text) {
        return "\u056F";
    }
    String convertSmallL(String text) {
        return "\u056C";
    }
    String convertSmallM(String text) {
        return "\u0574";
    }
    String convertSmallN(String text) {
        return "\u0576";
    }
    String convertSmallO(String text) {
        return "\u0585";
    }
    String convertSmallP(String text) {
        if (text.contains("'")) {
            return "\u0583";
        }
        return "\u057A";
    }
    String convertSmallQ(String text) {
        return "\u0584";
    }
    String convertSmallR(String text) {
        if (text.contains("r")) {
            return "\u057C";
        }
        return "\u0580";
    }
    String convertSmallS(String text) {
        if (text.contains("h")) {
            return "\u0577";
        }
        return "\u057D";
    }
    String convertSmallT(String text) {
        if (text.contains("w")) {
            return "\u0573";
        } else if (text.contains("'")) {
            return "\u0569";
        }
        return "\u057F";
    }
    String convertSmallU(String text) {
        return "\u0578\u0582";
    }
    String convertSmallV(String text) {
        if (text.contains("o")) {
            return "\u0578";
        }
        return "\u057E";
    }
    String convertSmallW(String text) {
        return "\u0582";
    }
    String convertSmallX(String text) {
        return "\u056D";
    }
    String convertSmallY(String text) {
        if (text.contains("'")) {
            return "\u0568";
        }
        return "\u0575";
    }
    String convertSmallZ(String text) {
        if (text.contains("h")) {
            return "\u056A";
        }
        return "\u0566";
    }
    String convertDollar(String text) {
        return "\u058F";
    }
    String convertBackquote(String text) {
        return "\u055D";
    }
    String convertColon(String text) {
        return "\u0589";
    }
    String convertLeftGuillemet(String text) {
        return "\u00AB";
    }
    String convertRightGuillemet(String text) {
        return "\u00BB";
    }
    String convertQuestion(String text) {
        return "\u055E";
    }
    String convertExclamation(String text) {
        if (text.contains("~")) {
            return "\u055C";
        } else {
            return "\u055B";
        }
    }
}
