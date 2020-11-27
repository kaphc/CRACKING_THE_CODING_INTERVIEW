package com.company.LinkedList;

public class LinkedListNode<K> {
    private final K value;

    public K getValue() {
        return value;
    }

    private LinkedListNode<K> next;

    public LinkedListNode<K> getNext() {
        return next;
    }

    public void setNext(LinkedListNode<K> nextNode) {
        this.next = nextNode;
    }

    public LinkedListNode(K value) {
        this.value = value;
    }
}
