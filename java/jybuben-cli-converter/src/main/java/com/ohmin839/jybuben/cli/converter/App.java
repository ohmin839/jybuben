package com.ohmin839.jybuben.cli.converter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.ohmin839.jybuben.api.JybubenApi;

public class App {
    public static void main(String[] args) throws IOException {
        new App().doMain(args);
    }

    public void doMain(String... args) throws IOException {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            reader.lines().forEach(line -> System.out.println(JybubenApi.toAybuben(line)));
        }
    }
}
