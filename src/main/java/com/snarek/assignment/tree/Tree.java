package com.snarek.assignment.tree;

/**
 * @author Narek Sarkisyan : mail-to snarek@gmail.com
 */
public interface Tree<T extends Comparable<T>> {

    boolean add(T element);

    int height(Node<T> node);

    Node<T> getRoot();
}
