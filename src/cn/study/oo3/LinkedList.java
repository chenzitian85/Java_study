/*
 * 自定义链表
 * @author czr
 * */
package cn.study.oo3;

public class LinkedList {
    private Node first;
    private Node last;
    private int size;

    //添加链表内容
//    ['a','b']
    public void add(Object obj) {
        Node node = new Node(obj);
        if (first == null) {
            // 第一次放数据
            first = node;
            last = node;
        } else {
            //新节点
            node.previous = last; // 当时存在的最后一个
            node.next = null;
            last.next = node;
            last = node;
        }
        size++;
    }

    /*
     * 获取元素 , 链表的查询是比较麻烦 ,需要不断的指向
     * */
//    ['1','2','3']
    public Object get(int index) {
        if (index < 0 || index > size - 1) {
            throw new RuntimeException("索引数字不合法" + index);
        }
        Node temp = first;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.element;
    }

    public static void main(String[] args) {
        LinkedList i = new LinkedList();
        i.add("33333");
        i.add("a");
        i.add("b");
        i.add("c");
        System.out.println(i);
        System.out.println(i.get(0));
    }
}
