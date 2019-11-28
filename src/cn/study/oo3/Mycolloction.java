/*
 * 自定义容器实现
 * */
package cn.study.oo3;

import javax.xml.soap.Node;
import java.util.Arrays;

public class Mycolloction<E> {
    private Object[] elementData;
    private int size;
    private static final int DEFALT_CAPACITY = 10;
    private Node first;
    private Node last;

    public Mycolloction() { //设置长度
        elementData = new Object[DEFALT_CAPACITY];
    }

    public Mycolloction(int Capacity) {  //设置长度
        elementData = new Object[Capacity];
    }

    /*
     * 返回对应索引的值
     * */
    public E get(int index) {
        // 索引的合法判断[0,size)
        if (index < 0 || index >= elementData.length) {
            // 不合法
            throw new RuntimeException("索引不合法" + index);//手动抛出异常
        }
        return (E) elementData[index];
    }

    /*
     * 设置数值
     * */
    public void set(E element, int index) {
        // 索引的合法判断[0,size)
        if (index < 0 || index >= elementData.length) {
            // 不合法
            throw new RuntimeException("索引不合法" + index);//手动抛出异常
        }
        elementData[index] = element;
    }

    /*
     * 删除
     * */
    public void remove(E element) {
        //元素比较后删除
        for (int i = 0; i < elementData.length; i++) {
            if (element.equals(get(i))) {
                // 移除
            }
        }

    }

    /*
     * 删除操作
     * */
    public void remove(int index) {
        int numMoved = elementData.length-index-1; //移动的长度
        if(numMoved>0){
            System.arraycopy(elementData,index+1,elementData,index,numMoved);
            elementData[size-1] = null;
        }else{
            elementData[size-1] = null;
        }

    }

    //    public Node getNode(int index){
//        Node temp = null;
//        if(index<=(size>>1)){ //size >> 1相当于处于2
//            temp = first;
//        }
//    }
    /*
     * 数组扩容
     * */
    public void add(E obj) {
        if (size == elementData.length) {
            Object[] newArray = new Object[elementData.length + (elementData.length >> 1)]; //10+10/2  这里注意优先级问题
            System.arraycopy(elementData, 0, newArray, 0, elementData.length); //拷贝
            elementData = newArray;
        }
        elementData[size++] = obj;
    }


    @Override
    public String toString() {// 读取方便重写
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Object obj : elementData) {
            sb.append(obj + ",");
        }
        sb.setCharAt(sb.length() - 1, ']'); //替换最后一个符号
        return sb.toString();
    }

    public static void main(String[] args) {
        Mycolloction s1 = new Mycolloction(20);
        s1.add("111");
        s1.toString();
        s1.set("333", 50);
        System.out.println(s1); // 这里相当于输出 s1.toString (因为 println 里面的输出被重构了 return (obj == null) ? "null" : obj.toString(); //默认输出对象的 toString)
        for (int i = 0; i < 40; i++) {
            s1.add("111");
        }
        System.out.println(s1);
        System.out.println(s1.get(10));
    }
}


