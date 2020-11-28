package com.company.Question5;

import com.company.LinkedList.LinkedList;
import com.company.LinkedList.LinkedListNode;

public class Question5A {
    public static Integer sumLists(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        LinkedListNode<Integer> currentNodeInList1 = list1.getHead();
        int sum1 = 0;
        int placeHolder = 1;

        while (currentNodeInList1 != null) {
            sum1 = sum1 + currentNodeInList1.getValue() * placeHolder;
            placeHolder = placeHolder*10;
            currentNodeInList1 = currentNodeInList1.getNext();
        }

        LinkedListNode<Integer> currentNodeInList2 = list2.getHead();
        int sum2 = 0;
        placeHolder = 1;

        while (currentNodeInList2 != null) {
            sum2 = sum2 + currentNodeInList2.getValue() * placeHolder;
            placeHolder = placeHolder*10;
            currentNodeInList2 = currentNodeInList2.getNext();
        }

        return sum1 + sum2;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>(new Integer[]{7, 1, 6});
        LinkedList<Integer> list2 = new LinkedList<>(new Integer[]{5, 9, 2});
        System.out.println(sumLists(list1, list2));

        list1 = new LinkedList<>(new Integer[]{3, 7});
        list2 = new LinkedList<>(new Integer[]{9, 0, 3});
        System.out.println(sumLists(list1, list2));
    }
}
