package com.ohmin839.jybuben.cli.collector;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.Set;

import com.ohmin839.jybuben.api.JybubenApi;

public class App {
    public static void main(String[] args) throws IOException {
        new App().doMain(args);
    }

    public void doMain(String... args) throws IOException {
        Set<String> wordSet = new LinkedHashSet<>();
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            reader.lines()
                .map(line -> JybubenApi.toHayerenWords(line))
                .forEach(words -> wordSet.addAll(words));
        }
        wordSet.forEach(word -> System.out.println(word));
    }
}
