package io.eclair.jutils.tree;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class SimpleNode<T> implements Node<T> {
    private T value;
    private List<Node<T>> children;

    // Constructors
    public SimpleNode() {
        this.value = null;
        this.children = new ArrayList<Node<T>>();
    }

    public SimpleNode(T value) {
        this();
        setValue(value);
    }

    public SimpleNode(T value, List<Node<T>> newChildren) {
        this(value);
        this.children.addAll(newChildren);
    }

    public SimpleNode(T value, Node<T>...newChildren) {
        this(value, Arrays.asList(newChildren));
    }

    // Mutators
    @Override
    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public void addChild(Node<T> child) {
        children.add(child);
    }

    // Accessors
    @Override
    public T getValue() {
        return value;
    }

    @Override
    public List<Node<T>> getChildren() {
        return children;
    }
}
