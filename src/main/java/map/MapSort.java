package io.eclair.jutils.map;

import java.util.Map;
import java.util.TreeMap;
import java.util.LinkedHashMap;

public class MapSort {
    public static <T, E> Map<T, E> sortByValue(Map<T, E> input) {
        TreeMap<E, T> reverseMap = new TreeMap<E, T>();

        for (Map.Entry<T, E> elem : input.entrySet()) {
            reverseMap.put(elem.getValue(), elem.getKey());
        }

        Map<T, E> sortedMap = new LinkedHashMap<T, E>();
        for (Map.Entry<E, T> elem : reverseMap.descendingMap().entrySet()) {
            sortedMap.put(elem.getValue(), elem.getKey());
        }

        return sortedMap;
    }
}
