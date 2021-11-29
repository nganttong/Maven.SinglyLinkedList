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

    public Integer find(T valueToFind) {
        Node currentNode = this.head;
        Integer index = 0;
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

    public Integer sizeOfList() {
        Integer count = 0;
        Node currentNode = this.head;
        while (currentNode != null) {
            count++;
            currentNode = currentNode.next;
        }
        return count;
    }

    public T get(Integer index) {
        Node currentNode = this.head;

        if(index >= sizeOfList()) {
            return null;
        }
        if(index == sizeOfList()) {
            return tail.info;
        }
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode.info;
    }

    public SinglyLinkedList<T> copy() {
        SinglyLinkedList<T> listToCopy = new SinglyLinkedList<T>();
        Node currentNode = this.head;
        while(currentNode !=null) {
            listToCopy.addNode(currentNode.info);
            currentNode = currentNode.next;
        }
        return listToCopy;
    }

    public void sort() {
        Node currentNode = this.head;
        for (int i = 0; i < sizeOfList(); i++) {
            currentNode = this.head;
            while (currentNode.next != null) {
                Node next = currentNode.next;
                if ((Integer) currentNode.info > (Integer) next.info) {
                    T holder = currentNode.info;
                    currentNode.info = next.info;
                    next.info = holder;
                }
                currentNode = currentNode.next;
            } //sorts form least ot greatest, reverse it if you want greatest to least
        }
    }

    //optional

    public void reverse() {
        SinglyLinkedList<T> reversedList = new SinglyLinkedList<T>();
        Integer i = sizeOfList() - 1;
        while (1 >= 0) {
            reversedList.addNode(get(i));
            i--;
        }
    }
}
