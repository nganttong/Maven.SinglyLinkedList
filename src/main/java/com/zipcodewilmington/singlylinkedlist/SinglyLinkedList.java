package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T> implements Comparable {
    public int compareTo(Object o) {
        return 0;
    }

    class Node{
        T info;
        Node next;

        public Node(T info) {
            this.info = info;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;

}
