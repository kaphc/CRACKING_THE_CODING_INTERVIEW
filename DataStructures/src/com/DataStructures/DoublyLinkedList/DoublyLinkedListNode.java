package com.DataStructures.DoublyLinkedList;

public class DoublyLinkedListNode<K> {
    private final K value;

    public K getValue() {
        return value;
    }

    private DoublyLinkedListNode<K> next;

    public DoublyLinkedListNode<K> getNext() {
        return next;
    }

    public void setNext(DoublyLinkedListNode<K> nextNode) {
        this.next = nextNode;
    }

    private DoublyLinkedListNode<K> previous;

    public DoublyLinkedListNode<K> getPrevious() {
        return previous;
    }

    public void setPrevious(DoublyLinkedListNode<K> previousNode) {
        this.previous = previousNode;
    }

    public DoublyLinkedListNode(K value) {
        this.value = value;
    }
}
