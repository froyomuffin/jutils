package io.eclair.jutils.tree;

import io.eclair.jutils.tree.Node;
import io.eclair.jutils.tree.SimpleNode;

import java.util.Random;
import java.lang.Integer;

public class SimpleBuilder {
    public static Node<Integer> randomTree(int maxChildren, int maxDepth) {
        Node<Integer> root = randomNode();
        randomPopulate(root, maxChildren, maxDepth);

        return root;
    }

    public static void printTree(Node<Integer> root, int depth) {
        for (Node<Integer> child : root.getChildren()) {
            printTree(child, depth + 1);
            System.out.println(depth + ":" + child.getValue());
        }
    }

    public static void randomPopulate(Node<Integer> node, int maxChildren, int depthLeft) {
        int childrenCount = randomInt(maxChildren);

        for (int i = 0; i < childrenCount; i++) {
            Node<Integer> child = randomNode();
            node.addChild(child);
        }

        if (depthLeft > 0) {
            for (Node<Integer> child : node.getChildren()) {
                randomPopulate(child, maxChildren, depthLeft - 1);
            }
        }
    }

    public static Node<Integer> randomNode() {
        return new SimpleNode<Integer>(randomInt(Integer.MAX_VALUE - 1));
    }

    private static int randomInt(int max) {
        Random rand = new Random();

        return rand.nextInt(max + 1);
    }
}
