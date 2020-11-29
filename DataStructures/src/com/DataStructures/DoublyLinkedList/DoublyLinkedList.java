package com.DataStructures.DoublyLinkedList;

public class DoublyLinkedList<K> {
    private DoublyLinkedListNode<K> head;
    public DoublyLinkedListNode<K> getHead() {
        return head;
    }

    private DoublyLinkedListNode<K> tail;
    public DoublyLinkedListNode<K> getTail() {
        DoublyLinkedListNode<K> currentNode = head;
        while(currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
        }
        this.tail = currentNode;
        return tail;
    }

    public DoublyLinkedList() {
    }

    public DoublyLinkedList(K[] elements) {
        DoublyLinkedListNode<K> previousNode = null;
        for(K element: elements) {
            DoublyLinkedListNode<K> node = new DoublyLinkedListNode<>(element);
            if(previousNode == null) {
                this.head = node;
            } else {
                previousNode.setNext(node);
                node.setPrevious(previousNode);
            }
            previousNode = node;
        }
        this.tail = previousNode;
    }

    public void addHead(DoublyLinkedListNode<K> newHead) {
        DoublyLinkedListNode<K> previousHead = head;
        head = newHead;
        newHead.setNext(previousHead);
        newHead.setPrevious(null);
        previousHead.setPrevious(newHead);
    }

    public DoublyLinkedListNode<K> removeHead() {
        DoublyLinkedListNode<K> previousHead = head;
        head = head.getNext();
        head.setPrevious(null);
        return previousHead;
    }

    public void addTail(DoublyLinkedListNode<K> newTail) {
        DoublyLinkedListNode<K> previousTail = tail;
        tail = newTail;
        tail.setPrevious(previousTail);
        tail.setNext(null);
        previousTail.setNext(tail);
    }

    public DoublyLinkedListNode<K> removeTail() {
        DoublyLinkedListNode<K> previousTail = tail;
        tail = tail.getPrevious();
        tail.setNext(null);
        return previousTail;
    }

    public void displayLinkedList() {
        DoublyLinkedListNode<K> currentNode = head;
        while(currentNode != null) {
            System.out.print(currentNode.getValue() + " ");
            currentNode = currentNode.getNext();
        }
        System.out.println("\n");
    }
}
