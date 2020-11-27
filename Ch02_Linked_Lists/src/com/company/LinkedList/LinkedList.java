package com.company.LinkedList;

public class LinkedList<K> {
    private LinkedListNode<K> head;
    public LinkedListNode<K> getHead() {
        return head;
    }

    public LinkedList() {
    }

    public LinkedList(K[] elements) {
        LinkedListNode<K> previousNode = null;
        for(K element: elements) {
            LinkedListNode<K> node = new LinkedListNode<>(element);
            if(previousNode == null) {
                this.head = node;
            } else {
                previousNode.setNext(node);
            }
            previousNode = node;
        }
    }

    public void displayLinkedList() {
        LinkedListNode<K> currentNode = head;
        while(currentNode != null) {
            System.out.print(currentNode.getValue() + " ");
            currentNode = currentNode.getNext();
        }
        System.out.println("\n");
    }
}
