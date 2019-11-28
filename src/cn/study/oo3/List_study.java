/*
* 集合
* 1、Array 本质上还是数组的拷贝
* */
package cn.study.oo3;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class List_study {
    public static void main(String[] args) {
        test2();
        System.out.println("------------");
        test3();
    }
    public static void test1(){


    }
    public static void test2(){
        List<String> list01 = new ArrayList<>();
//        Collection<String> list01 = new ArrayList<>();
        list01.add("11");
        list01.add("22");
        list01.add("33");

        List<String> list02 = new ArrayList<>();
        list02.add("33");
        list02.add("11");
        list02.add("44");

        System.out.println("list01:"+list01);
        list01.addAll(list02); //合并集合
//        list01.remove(list02);//删除相同部分
//        list01.retainAll(list02)
        System.out.println("list01:"+list01);

    }
    public static void test3(){
        List<String> list01 = new ArrayList<>();
        list01.add("11");
        list01.add("22");
        list01.add("33");
        list01.add(2,"插入的数据");
        System.out.println("list01:"+list01);
        System.out.println(list01.indexOf("11")); //返回索引的位置
    }
}
