package com.company.Question4;

import com.company.DoublyLinkedList.DoublyLinkedList;
import com.company.DoublyLinkedList.DoublyLinkedListNode;

public class Question4 {

    public static void partition(DoublyLinkedList<Integer> list, int partition) {
        DoublyLinkedListNode<Integer> currentNode = list.getHead();
        DoublyLinkedListNode<Integer> initialTail = list.getTail();
        DoublyLinkedListNode<Integer> nextNode;
        DoublyLinkedListNode<Integer> tail;

        while (currentNode.getNext() != initialTail) {
            nextNode = currentNode.getNext();

            if (currentNode.getValue() > partition) {
                if (currentNode.getPrevious() != null) {
                    currentNode.getPrevious().setNext(currentNode.getNext());
                    currentNode.getNext().setPrevious(currentNode.getPrevious());
                } else {
                    currentNode.getNext().setPrevious(null);
                }

                tail = list.getTail();
                currentNode.setPrevious(tail);
                tail.setNext(currentNode);
                currentNode.setNext(null);
            }
            currentNode = nextNode;
        }
    }

    public static void main(String[] args) {
//        Integer[] elements1 = new Integer[]{3, 5, 8, 5, 10, 2, 1};
//        DoublyLinkedList<Integer> list1 = new DoublyLinkedList<>(elements1);
//        list1.displayLinkedList();
//        partition(list1, 4);
//        list1.displayLinkedList();
//
        Integer[] elements2 = new Integer[]{10, 7, 6, 3, 10, 6, 2};
        DoublyLinkedList<Integer> list2 = new DoublyLinkedList<>(elements2);
        list2.displayLinkedList();
        partition(list2, 8);
        list2.displayLinkedList();

//        Integer[] elements3 = new Integer[]{3, 2, 3};
//        DoublyLinkedList<Integer> list3 = new DoublyLinkedList<>(elements3);
//        list3.displayLinkedList();
//        partition(list3, 2);
//        list3.displayLinkedList();
    }
}
