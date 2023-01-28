package com.ohmin839.jybuben.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.parboiled.Parboiled;
import org.parboiled.parserunners.RecoveringParseRunner;
import org.parboiled.support.ParsingResult;

public class JybubenApi {

    static private final ConverterParser converterParser = Parboiled.createParser(ConverterParser.class);

    static public String toAybuben(String text) {
        if (text.isEmpty()) {
            return text;
        } else {
            ParsingResult<String> result = new RecoveringParseRunner<String>(converterParser.InputLine()).run(text);
            return result.resultValue;
        }
    }

    static public List<String> toHayerenWordList(String text) {
        // TODO
        return new ArrayList<>();
    }

    static public Set<String> toHayerenWordSet(String text) {
        // TODO
        return new HashSet<>();
    }

    static public Map<String, Integer> toHayerenWordMap(String text) {
        // TODO
        return new HashMap<>();
    }
}