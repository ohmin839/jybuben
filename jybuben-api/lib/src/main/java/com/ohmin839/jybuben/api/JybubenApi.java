package com.ohmin839.jybuben.api;

import java.util.ArrayList;
import java.util.List;
import org.parboiled.Parboiled;
import org.parboiled.parserunners.RecoveringParseRunner;
import org.parboiled.support.ParsingResult;

public class JybubenApi {

    static private final ConverterParser converterParser = Parboiled.createParser(ConverterParser.class);
    static private final CollectorParser collectorParser = Parboiled.createParser(CollectorParser.class);

    static public String toAybuben(String text) {
        if (text.isEmpty()) {
            return text;
        } else {
            ParsingResult<String> result = new RecoveringParseRunner<String>(converterParser.InputLine()).run(text);
            return result.resultValue;
        }
    }

    static public List<String> toHayerenWords(String text) {
        if (text.isEmpty()) {
            return new ArrayList<>();
        } else {
            ParsingResult<List<String>> result = new RecoveringParseRunner<List<String>>(collectorParser.InputLine()).run(text);
            return result.resultValue;
        }
    }
}