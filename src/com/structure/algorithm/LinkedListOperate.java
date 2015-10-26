package com.structure.algorithm;

/**
 * Created by sucre on 2015/10/26.
 */
public class LinkedListOperate {
    //链表反转
    private Node reverse(Node current){
        if (current == null || current.next == null) return current;
        Node nextNode = current.next;
        current.next = null;
        Node reverseRest = reverse(nextNode);
        nextNode.next = current;
        return reverseRest;
    }
}
class Node{
    String value;
    Node next;
}