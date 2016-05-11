package io.eclair.jutils.tree;

import java.util.List;

public interface Node<T> {
    public void setValue(T value);
    public void addChild(Node<T> newChild);

    public T getValue();
    public List<Node<T>> getChildren();
}
