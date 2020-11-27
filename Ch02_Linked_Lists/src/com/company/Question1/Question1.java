package com.company.Question1;

import com.company.LinkedList.*;

import java.util.ArrayList;
import java.util.HashSet;

public class Question1 {

    public static void removeDuplicates(LinkedList<Integer> list) {
        HashSet<Integer> elementSet = new HashSet<>();
        LinkedListNode<Integer> previousNode = list.getHead();
        LinkedListNode<Integer> currentNode = previousNode.getNext();

        while (currentNode != null) {
            elementSet.add(previousNode.getValue());

            if(elementSet.contains(currentNode.getValue())) {
                while(elementSet.contains(currentNode.getValue())) {
                    if(currentNode.getNext() == null) {
                        previousNode.setNext(null);
                        return;
                    } else {
                        currentNode = currentNode.getNext();
                    }
                }
                previousNode.setNext(currentNode);
            }

            currentNode = currentNode.getNext();
            previousNode = previousNode.getNext();
        }
    }

    public static void main(String[] args) {
        Integer[] elements1 = new Integer[]{6, 6, 3, 2, 1, 9, 9, 2, 8, 2};
        LinkedList<Integer> list1 = new LinkedList<>(elements1);
        list1.displayLinkedList();
        removeDuplicates(list1);
        list1.displayLinkedList();

        Integer[] elements2 = new Integer[]{6, 6, 3, 3, 3, 3, 3};
        LinkedList<Integer> list2 = new LinkedList<>(elements2);
        list2.displayLinkedList();
        removeDuplicates(list2);
        list2.displayLinkedList();
    }
}
