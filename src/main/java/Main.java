package io.eclair.jutils;

import io.eclair.jutils.tree.SimpleBuilder;
import io.eclair.jutils.tree.Node;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        System.out.println("Building a random tree");

        Node newNode = SimpleBuilder.randomTree(5, 3);

        SimpleBuilder.printTree(newNode, 0);
    }
}
