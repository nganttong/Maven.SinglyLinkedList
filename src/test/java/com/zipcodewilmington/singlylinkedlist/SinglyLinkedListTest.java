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
        SinglyLinkedList<Integer> testNode = new SinglyLinkedList<Integer>();
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

    @Test
    public void testContains() {
        //given
        SinglyLinkedList<String> list = new SinglyLinkedList<String>();
        list.addNode("Yes");
        list.addNode("No");
        list.addNode("Maybe");
        //when
        boolean actual = list.containsNode("Yes");
        //then
        Assert.assertTrue(actual);
    }

    @Test
    public void testFind(){
        //given
        SinglyLinkedList<String> list = new SinglyLinkedList<String>();
        list.addNode("Banana");
        list.addNode("Kiwi");
        list.addNode("Apple");
        list.addNode("Orange");
        list.addNode("Golden Kiwi");
        //when
        Integer expected = 4;
        Integer actual = list.find("Golden Kiwi");
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sizeTest () {
        //given
        SinglyLinkedList<String> testList = new SinglyLinkedList<String>();
        testList.addNode("Hi");
        testList.addNode("Hello");
        testList.addNode("Howdy");
        Integer expected = 3;
        //when
        Integer actual = testList.sizeOfList();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGet(){
        SinglyLinkedList<Integer> testList = new SinglyLinkedList<Integer>();
        testList.addNode(11);
        testList.addNode(45);
        testList.addNode(775);
        testList.addNode(1253);

        Integer expected = 11;
        Integer actual = testList.get(0);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCopy(){
        //given
        SinglyLinkedList<Integer> testList = new SinglyLinkedList<Integer>();
        testList.addNode(11);
        testList.addNode(45);
        testList.addNode(775);
        testList.addNode(1253);
        int expected = 4;
        //when
        int actual = testList.copy().sizeOfList();
        //then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testSort(){
        //given
        SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
        list.addNode(21);
        list.addNode(11);
        list.addNode(31);
        list.addNode(1);
        list.addNode(41);
        list.addNode(51);
        Integer expected = 1;
        //when
        list.sort();
        Integer actual = list.get(0);
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testReverse() {
        //given
        SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
        list.addNode(12);
        list.addNode(21);
        list.addNode(33);
        list.addNode(4);
        Integer expected = 33;
        //when
        list.reverse();
        Integer actual = list.get(1);
        //then
        Assert.assertEquals(expected, actual);
    }
}
