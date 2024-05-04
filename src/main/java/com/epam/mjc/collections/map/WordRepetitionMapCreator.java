package com.epam.mjc.collections.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        var words = sentence.split(" ");
        var truWords = Arrays.stream(words)
                .filter(w -> !w.isBlank())
                .map(w -> w.replaceAll("\\W", "")
                        .strip().toLowerCase())
                .collect(Collectors.toList());
        var res = new HashMap<String, Integer>();
        for (String w : truWords) {
            var v = res.get(w);
            if (v != null) {
                v = v + 1;
            } else {
                v = 1;
            }
            res.put(w, v);
        }
        return res;
    }
}
