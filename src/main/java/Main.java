package io.eclair.jutils;

import io.eclair.jutils.tree.SimpleBuilder;
import io.eclair.jutils.tree.Node;

import io.eclair.jutils.map.DoubleHashMap;
import io.eclair.jutils.map.BasicDoubleHashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        System.out.println("Building a random tree");

        Node newNode = SimpleBuilder.randomTree(5, 3);

        SimpleBuilder.printTree(newNode, 0);

        DoubleHashMap<Integer, String> someMap = new BasicDoubleHashMap<Integer, String>();

        someMap.put(1, "Hello");
        someMap.put(2, "Bye");

        System.out.println(someMap.get(1));
        System.out.println(someMap.getKey("Bye"));
        System.out.println(someMap.get(2));
        System.out.println(someMap.getKey("Moo"));
    }
}
