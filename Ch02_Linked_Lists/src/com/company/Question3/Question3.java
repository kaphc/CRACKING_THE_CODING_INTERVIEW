package com.company.Question3;

import com.company.LinkedList.LinkedList;
import com.company.LinkedList.LinkedListNode;

public class Question3 {
    public static void deleteMiddleNode(LinkedList<Integer> list) throws Exception {
        LinkedListNode<Integer> previousNode = list.getHead();

        if(list.getHead().getNext() == null || list.getHead().getNext().getNext() == null) {
            throw new Exception("There is only one element in the LinkedList");
        }
        LinkedListNode<Integer> firstPointer = list.getHead().getNext();
        LinkedListNode<Integer> secondPointer = list.getHead().getNext().getNext();

        while(secondPointer.getNext() != null && secondPointer.getNext().getNext() != null) {
            previousNode = previousNode.getNext();
            firstPointer = firstPointer.getNext();
            secondPointer = secondPointer.getNext().getNext();
        }

        previousNode.setNext(firstPointer.getNext());
    }

    public static void main(String[] args) throws Exception {
        Integer[] elements1 = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        LinkedList<Integer> list1 = new LinkedList<>(elements1);
        list1.displayLinkedList();
        deleteMiddleNode(list1);
        list1.displayLinkedList();

        Integer[] elements2 = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        LinkedList<Integer> list2 = new LinkedList<>(elements2);
        list2.displayLinkedList();
        deleteMiddleNode(list2);
        list2.displayLinkedList();

        Integer[] elements3 = new Integer[]{1, 2, 3};
        LinkedList<Integer> list3 = new LinkedList<>(elements3);
        list3.displayLinkedList();
        deleteMiddleNode(list3);
        list3.displayLinkedList();
    }
}
