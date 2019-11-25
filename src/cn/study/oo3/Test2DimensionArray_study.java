/*
* 测试二维数组
* */
package cn.study.oo3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test2DimensionArray_study {
    public static void main(String[] args) {
        int[] a = new int[3]; // 一维数组
        int[][]  a1 = new int[3][10];
        int[][] a2 = {{12},{12},{12},};
        System.out.println(Arrays.toString(a2));
    }
}
