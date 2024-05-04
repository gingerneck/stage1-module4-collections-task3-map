package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        var res = new HashMap<String, Integer>();
        var temp = new TreeMap<>(sourceMap);
        for (Map.Entry<Integer, String> entry : temp.entrySet()) {
            if (res.containsKey(entry.getValue())) {
                continue;
            }
            res.put(entry.getValue(), entry.getKey());
        }
        return res;
    }
}
