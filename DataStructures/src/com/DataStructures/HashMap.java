package com.DataStructures;

import java.util.ArrayList;

public class HashMap<K, V> {

    ArrayList<HashNode<K, V>> buckets = new ArrayList<>();
    private final int numberOfBuckets;
    private int size;

    public HashMap(int numberOfBuckets) {
        this.numberOfBuckets = numberOfBuckets;
        for (int i = 0; i < numberOfBuckets; i++) {
            buckets.add(null);
        }
    }

    private int getBucketIndex(K key) {
        int hashCode = key.hashCode();
        return Math.abs(hashCode) % numberOfBuckets;
    }

    public void add(K key, V value) {
        int bucketIndex = getBucketIndex(key);

        HashNode<K, V> head = buckets.get(bucketIndex);
        HashNode<K, V> newHashNode = new HashNode<>(key, value);

        if (head == null) {
            buckets.set(bucketIndex, newHashNode);
        } else {
            while (head.next != null) {
                head = head.next;
            }
            head.next = newHashNode;
        }
    }

    public V get(K key) {
        int bucketIndex = getBucketIndex(key);
        HashNode<K, V> head = buckets.get(bucketIndex);

        if(head != null) {
            while(head != null) {
                if(head.key == key) {
                    return head.value;
                }
                head = head.next;
            }
        }
        return null;
    }

    public void remove(K key) {
        int bucketIndex = getBucketIndex(key);
        HashNode<K, V> head = buckets.get(bucketIndex);

        if(head.key == key) {
            if(head.next == null) {
                buckets.set(bucketIndex, null);
            } else {
                buckets.set(bucketIndex, head.next);
            }
        } else {
            HashNode<K, V> previousHead = new HashNode<>(head.key, head.value);

            while(head != null) {
                if(head.key == key) {
                    if(head.next == null) {
                        previousHead.next = null;
                    } else {
                        previousHead.next = head.next;
                    }
                }
                previousHead = head;
                head = head.next;
            }
        }
    }

    public void displayHashMap() {
        for (int i = 0; i < buckets.size(); i++) {
            System.out.println(i);
            HashNode<K, V> hashNode = buckets.get(i);
            if (hashNode == null) {
                System.out.println("null");
            } else {
                while (hashNode != null) {
                    System.out.println(hashNode.key + "->" + hashNode.value);
                    hashNode = hashNode.next;
                }
            }
        }
    }

    public static void main(String[] args) {
        HashMap<String, String> newHashMap = new HashMap<>(5);

        newHashMap.add("First Name", "Kavin");
        newHashMap.add("Middle Name", " ");
        newHashMap.add("Last Name", "Kumar");
        newHashMap.add("Preferred Name", "Kavin");
        newHashMap.add("Gender", "Male");
        newHashMap.add("Highest Degree", "Master");
        newHashMap.add("Age", "99");
        newHashMap.add("Number of Friends", "1000");
        newHashMap.add("Marital Status", "N");

        newHashMap.displayHashMap();

        System.out.println("************************************");
        System.out.println("Find value for First Name: " + newHashMap.get("First Name"));
        System.out.println("Find value for Address: " + newHashMap.get("Address"));

        System.out.println("************************************");
        newHashMap.remove("Highest Degree");
        newHashMap.displayHashMap();

        System.out.println("************************************");
        newHashMap.remove("First Name");
        newHashMap.displayHashMap();

        System.out.println("************************************");
        newHashMap.remove("Gender");
        newHashMap.displayHashMap();

        System.out.println("************************************");
        newHashMap.remove("Middle Name");
        newHashMap.displayHashMap();
    }
}
