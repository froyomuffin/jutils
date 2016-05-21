package io.eclair.jutils.map;

import java.util.Set;
import java.util.Collection;
import java.util.Map;

public interface DoubleHashMap<K, V> extends Map<K, V> {
    public K getKey(Object value);
    public void trim();
}
