package com.ohmin839.jybuben.api;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.stream.Stream;

import org.apache.commons.math3.util.Pair;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import com.google.common.collect.Lists;

public class JybubenApiTests {
    @TestFactory
    Stream<DynamicTest> toAybubenTests() {
        return Stream.of(
            Pair.create("", ""),
            Pair.create("A", "Ա"),
            Pair.create("B", "Բ"),
            Pair.create("G", "Գ"),
            Pair.create("D", "Դ"),
            Pair.create("E", "Ե"),
            Pair.create("Z", "Զ"),
            Pair.create("E'", "Է"),
            Pair.create("Y'", "Ը"),
            Pair.create("T'", "Թ"),
            Pair.create("Zh", "Ժ"),
            Pair.create("I", "Ի"),
            Pair.create("L", "Լ"),
            Pair.create("X", "Խ"),
            Pair.create("C'", "Ծ"),
            Pair.create("K", "Կ"),
            Pair.create("H", "Հ"),
            Pair.create("Dz", "Ձ"),
            Pair.create("Gh", "Ղ"),
            Pair.create("Tw", "Ճ"),
            Pair.create("M", "Մ"),
            Pair.create("Y", "Յ"),
            Pair.create("N", "Ն"),
            Pair.create("Sh", "Շ"),
            Pair.create("Vo", "Ո"),
            Pair.create("Ch", "Չ"),
            Pair.create("P", "Պ"),
            Pair.create("J", "Ջ"),
            Pair.create("Rr", "Ռ"),
            Pair.create("S", "Ս"),
            Pair.create("V", "Վ"),
            Pair.create("T", "Տ"),
            Pair.create("R", "Ր"),
            Pair.create("C", "Ց"),
            Pair.create("W", "Ւ"),
            Pair.create("P'", "Փ"),
            Pair.create("Q", "Ք"),
            Pair.create("O", "Օ"),
            Pair.create("F", "Ֆ"),
            Pair.create("U", "Ու"),
            Pair.create("a", "ա"),
            Pair.create("b", "բ"),
            Pair.create("g", "գ"),
            Pair.create("d", "դ"),
            Pair.create("e", "ե"),
            Pair.create("z", "զ"),
            Pair.create("e'", "է"),
            Pair.create("y'", "ը"),
            Pair.create("t'", "թ"),
            Pair.create("zh", "ժ"),
            Pair.create("i", "ի"),
            Pair.create("l", "լ"),
            Pair.create("x", "խ"),
            Pair.create("c'", "ծ"),
            Pair.create("k", "կ"),
            Pair.create("h", "հ"),
            Pair.create("dz", "ձ"),
            Pair.create("gh", "ղ"),
            Pair.create("tw", "ճ"),
            Pair.create("m", "մ"),
            Pair.create("y", "յ"),
            Pair.create("n", "ն"),
            Pair.create("sh", "շ"),
            Pair.create("vo", "ո"),
            Pair.create("ch", "չ"),
            Pair.create("p", "պ"),
            Pair.create("j", "ջ"),
            Pair.create("rr", "ռ"),
            Pair.create("s", "ս"),
            Pair.create("v", "վ"),
            Pair.create("t", "տ"),
            Pair.create("r", "ր"),
            Pair.create("c", "ց"),
            Pair.create("w", "ւ"),
            Pair.create("p'", "փ"),
            Pair.create("q", "ք"),
            Pair.create("o", "օ"),
            Pair.create("f", "ֆ"),
            Pair.create("u", "ու"),
            Pair.create("ev", "և"),
            Pair.create("$", "֏"),
            Pair.create("0123456789", "0123456789"),
            Pair.create(",", ","),
            Pair.create(".", "."),
            Pair.create("`", "՝"),
            Pair.create(":", "։"),
            Pair.create("-", "-"),
            Pair.create("(", "("),
            Pair.create(")", ")"),
            Pair.create("<<", "«"),
            Pair.create(">>", "»"),
            Pair.create("?", "՞"),
            Pair.create("!", "՛"),
            Pair.create("!~", "՜"),
            Pair.create(" ", " "),
            Pair.create("\t", "\t"),
            Pair.create("\n", "\n"),
            Pair.create("\r\n", "\r\n"),
            Pair.create("Barev!", "Բարև՛")
        ).map(
            pair -> dynamicTest(
                String.format("\"%s\" -> \"%s\"", pair.getFirst(), pair.getSecond()),
                () -> assertEquals(pair.getSecond(), JybubenApi.toAybuben(pair.getFirst()))
            )
        );
    }

    @TestFactory
    Stream<DynamicTest> toHayerenWordsTests() {
        return Stream.of(
            Pair.create("", Lists.<String>newArrayList()),
            Pair.create("Barev Dzez:", Lists.<String>newArrayList()),
            Pair.create("Բարև Ձեզ։", Lists.<String>newArrayList("Բարև", "Ձեզ"))
        ).map(
            pair -> dynamicTest(
                String.format("\"%s\" -> \"%s\"", pair.getFirst(), pair.getSecond()),
                () -> assertEquals(pair.getSecond(), JybubenApi.toHayerenWords(pair.getFirst()))
            )
        );
    }
}
