package cn.study.oo2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Array_study {
    public static void main(String[] args) {
        // 数组拷贝
        String[] a = {"aa", "b", "vv", "dd"};
        String[] b = new String[10];
        // a 数组的第二个拷贝到 b 数组的第五个，拷贝 1  个。如果被拷贝的数组不是空数组那么将会覆盖内容
        System.arraycopy(a, 2, b, 5, 1);
//        delArry(a, 1);
        extendRange(a, 15);
    }


    /*
     * 删除数组中指定索引的位置，并将原数组返回
     * s 操作的数组
     * index 删除元素的索引
     * */
    public static String[] delArry(String[] s, int index) {
        System.arraycopy(s, index, s, index - 1, s.length - index);
        s[s.length - 1] = null; // 最后一个值设置为空
        System.out.println(Arrays.toString(s));
        return s;
    }

    /*
     * 数组扩容（本质上是：先定义一个更大的数组，然后将原数组原封不动拷贝到新数组中）
     * s 操作的数组
     * length 扩展的长度
     * */
    public static String[] extendRange(String[] s, int length) {
        String[] s2 = new String[s.length+length];
        System.arraycopy(s, 0, s2, 0, s.length);
        System.out.println(Arrays.toString(s2));
        return s2;
    }
}
