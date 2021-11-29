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

    public void addNode(T info) {
        Node nodeToAdd = new Node(info);

        if (this.head == null) {
            this.head = nodeToAdd;
        } else {
            tail.next = nodeToAdd;
        }
        tail = nodeToAdd;
    }

    public void removeNode(T itemToRemove) {
        Node currentNode = this.head;
        Node lastNode = this.head;

        while(currentNode != null) {
            if(currentNode.info.equals(itemToRemove)) {
                if(currentNode.next == null) {
                    lastNode.next = null;
                } else if (currentNode == lastNode) {
                    head = currentNode.next;
                } else {
                    lastNode.next = currentNode.next;
                }
            }
            lastNode = currentNode;
            currentNode = currentNode.next;
        }
    }

    public boolean containsNode(T valueToContain) {
        return this.find(valueToContain) >= 0;
    }

    private Integer find(T valueToFind) {
        Node currentNode = this.head;
        int index = 0;
//        if(this.head == null){
//            what do I do if the list is empty
//        }
        while(currentNode != null) {
            if (currentNode.info == valueToFind) {
                return index;
            }
            index++;
            currentNode = currentNode.next;
        }
        return -1;
    }



}
