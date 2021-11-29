package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest<T> {

    @Test
    public void addNodeTest () {
        //given
        SinglyLinkedList testNode = new SinglyLinkedList();
        Integer expected = 1;
        //when
        testNode.addNode(7);
        Integer actual = testNode.sizeOfList();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTest() {
        //given
        SinglyLinkedList<Integer> testList = new SinglyLinkedList<Integer>();
        testList.addNode(2);
        testList.addNode(6);
        testList.addNode(5);
        testList.addNode(2);
        int expected = 3;
        //when
        testList.removeNode(5);
        int actual = testList.sizeOfList();

        Assert.assertEquals(expected, actual);
    }

}
