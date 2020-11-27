package com.company.Question2;

import com.company.LinkedList.LinkedList;
import com.company.LinkedList.LinkedListNode;

public class Question2 {
    public static int findKthElement(LinkedList<Integer> list, int k) throws Exception {
        LinkedListNode<Integer> currentNode = list.getHead();
        LinkedListNode<Integer> kthNode = currentNode;

        for (int i = 0; i < k; i++) {
            if (currentNode == null) {
                throw new Exception("Size of the linkedList is less than K");
            } else {
                currentNode = currentNode.getNext();
            }
        }
        while (currentNode != null) {
            currentNode = currentNode.getNext();
            kthNode = kthNode.getNext();
        }

        if (kthNode != null) {
            return kthNode.getValue();
        } else {
            throw new Exception("Unexpected k value");
        }
    }

    public static void main(String[] args) throws Exception {
        Integer[] elements1 = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        LinkedList<Integer> list1 = new LinkedList<>(elements1);
        System.out.println(findKthElement(list1, 4));

        Integer[] elements2 = new Integer[]{1, 2, 3, 4, 5};
        LinkedList<Integer> list2 = new LinkedList<>(elements2);
        System.out.println(findKthElement(list2, 1));

        Integer[] elements3 = new Integer[]{1, 2, 3, 4, 5, 6};
        LinkedList<Integer> list3 = new LinkedList<>(elements3);
        System.out.println(findKthElement(list3, 6));
    }
}
