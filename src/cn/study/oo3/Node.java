/*
 * 链表中的节点
 * */
package cn.study.oo3;

import javax.management.RuntimeErrorException;

public class Node {
    Node previous; //上一个节点
    Node next;    //下一个节点
    Object element; // 元素本身
    private int size;

    public Node(Node previous, Node next, Object element) {
        this.previous = previous;
        this.next = next;
        this.element = element;
    }

    public Node(Object element) {
        this.element = element;
    }
}
