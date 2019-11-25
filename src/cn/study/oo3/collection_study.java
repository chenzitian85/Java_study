/*
 *
 * */
package cn.study.oo3;

import java.util.List;

public class collection_study {
    public static void main(String[] args) {
        MyCollection mc = new MyCollection();
        mc.set("czt", 0);
        mc.set(8880, 1);
        Integer a = (Integer) mc.get(1);
        String b = (String) mc.get(0);
        //使用泛型
        MyCollection2<String,Integer> mc1 = new MyCollection2<String,Integer>();  //传入了String 类型，这里能传多个参数
        List list;
    }
}

class MyCollection {
    Object[] objs = new Object[5];

    public void set(Object obj, int index) {
        objs[index] = obj;
    }

    public Object get(int index) {
        return objs[index];
    }
}
class MyCollection2 <E,V> { //泛型
    Object[] objs = new Object[5];

    public void set(E obj, int index) {
        objs[index] = obj;
    }

    public E get(int index) {
        return (E)objs[index];
    }
}