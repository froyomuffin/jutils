package io.eclair.jutils.map;

import io.eclair.jutils.map.DoubleHashMap;

import java.util.Set;
import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import java.io.Serializable;

// TODO: Java 8
public class BasicDoubleHashMap<K, V> implements DoubleHashMap<K, V>, Serializable {
    private Map<V, K> reverseMap;
    private Map<K, V> forwardMap;

    public BasicDoubleHashMap() {
        reverseMap = new HashMap<V, K>();
        forwardMap = new HashMap<K, V>();
    }

    @Override
    public void trim() {
        // TODO
    }

    @Override
    public void clear() {
        reverseMap.clear();
        forwardMap.clear();
    }

    @Override
    public boolean containsKey(Object key) {
        return forwardMap.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return reverseMap.containsKey(value);
    }

    @Override
    public Set<Map.Entry<K,V>> entrySet() {
        return forwardMap.entrySet();
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof BasicDoubleHashMap) {
            BasicDoubleHashMap tmp = (BasicDoubleHashMap) o;

            return reverseMap.equals(tmp.reverseMap) && forwardMap.equals(tmp.forwardMap);
        } else {
            return false;
        }
    }

    @Override
    public V get(Object key) {
        return forwardMap.get(key);
    }

    @Override
    public K getKey(Object value) {
        return reverseMap.get(value);
    }

    @Override
    public int hashCode() {
        return reverseMap.hashCode() + forwardMap.hashCode();
    }

    @Override
    public boolean isEmpty() {
        return forwardMap.isEmpty();
    }

    @Override
    public Set<K> keySet() {
        return forwardMap.keySet();
    }

    @Override
    public V put(K key, V value) {
        reverseMap.put(value, key);

        return forwardMap.put(key, value);
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> elem : map.entrySet()) {
            put(elem.getKey(), elem.getValue());
        }
    }

    @Override
    public V remove(Object key) {
        V value = forwardMap.get(key);
        reverseMap.remove(value);

        return forwardMap.remove(key);
    }

    @Override
    public int size() {
        return forwardMap.size();
    }

    @Override
    public Collection<V> values() {
        return forwardMap.values();
    }
}
