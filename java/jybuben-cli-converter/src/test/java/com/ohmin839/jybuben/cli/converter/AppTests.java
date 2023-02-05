package com.ohmin839.jybuben.cli.converter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class AppTests {
    static private final String UTF8 = "UTF-8";
    static private final String EOL = System.getProperty("line.separator");

    static InputStream bkSysin = System.in;
    static PrintStream bkSysout = System.out;

    @Test
    void testDoMain() throws Exception {
        InputStream inputStream = new ByteArrayInputStream("Barev Dzez:".getBytes(UTF8));
        System.setIn(inputStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        App app = new App();
        app.doMain();

        String result = new String(outputStream.toByteArray(), UTF8);
        assertEquals("Բարև Ձեզ։" + EOL, result);

        inputStream.close();
        printStream.close();
    }

    @AfterEach
    void tearDown() {
        System.setIn(bkSysin);
        System.setOut(bkSysout);
    }
}
