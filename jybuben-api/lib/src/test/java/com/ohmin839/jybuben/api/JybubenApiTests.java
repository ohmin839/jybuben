package com.ohmin839.jybuben.api;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.stream.Stream;

import org.apache.commons.math3.util.Pair;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

public class JybubenApiTests {
    @TestFactory
    Stream<DynamicTest> toAybubenTests() {
        return Stream.of(
            Pair.create("", "")
        ).map(
            pair -> dynamicTest(
                String.format("\"%s\" -> \"%s\"", pair.getFirst(), pair.getSecond()),
                () -> assertEquals(pair.getSecond(), JybubenApi.toAybuben(pair.getFirst()))
            )
        );
    }

    @TestFactory
    Stream<DynamicTest> toHayerenWordListTests() {
        return Stream.of(
            Pair.create("", Lists.<String>newArrayList())
        ).map(
            pair -> dynamicTest(
                String.format("\"%s\" -> \"%s\"", pair.getFirst(), pair.getSecond()),
                () -> assertEquals(pair.getSecond(), JybubenApi.toHayerenWordList(pair.getFirst()))
            )
        );
    }

    @TestFactory
    Stream<DynamicTest> toHayerenWordSetTests() {
        return Stream.of(
            Pair.create("", Sets.<String>newHashSet())
        ).map(
            pair -> dynamicTest(
                String.format("\"%s\" -> \"%s\"", pair.getFirst(), pair.getSecond()),
                () -> assertEquals(pair.getSecond(), JybubenApi.toHayerenWordSet(pair.getFirst()))
            )
        );
    }

    @TestFactory
    Stream<DynamicTest> toHayerenWordMapTests() {
        return Stream.of(
            Pair.create("", Maps.<String, Integer>newHashMap())
        ).map(
            pair -> dynamicTest(
                String.format("\"%s\" -> \"%s\"", pair.getFirst(), pair.getSecond()),
                () -> assertEquals(pair.getSecond(), JybubenApi.toHayerenWordMap(pair.getFirst()))
            )
        );
    }
}
