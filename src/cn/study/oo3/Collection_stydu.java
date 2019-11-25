package cn.study.oo3;

import java.util.ArrayList;
import java.util.Collection;

public class Collection_stydu {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();

        c.add("aaa");
        c.add("vvv");
        System.out.println(c.size());
        System.out.println(c.isEmpty());
        System.out.println(c.contains("111"));

        Object[] objs = c.toArray();
        System.out.println(objs);
        c.remove("111");
        System.out.println(c);
        c.clear();
        System.out.println(c.size());
    }
}
