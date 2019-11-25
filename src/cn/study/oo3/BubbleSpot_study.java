/*
 * 冒泡排序
 * 1、大小比较、换位
 * */
package cn.study.oo3;

import jdk.nashorn.internal.ir.CallNode;

import java.util.Arrays;

public class BubbleSpot_study {
    public static void main(String[] args) {
        int[] value = {1, 10, 5, 5, 60, 10, 30, 45, 78, 65, 12, 30, 48, 12};
        int temp = 0;
        for(int i = 0;i<value.length-1;i++){
            boolean flag = true; //检测到排序完就没必要再循环啦
            for (int j = 0; j < value.length-1-i; j++) {

                // 比较大小，换顺序
                if(value[j]>value[j+1]){
                    temp = value[j];
                    value[j] = value[j+1];
                    value[j+1] = temp;
                    flag = false;//检测到排序
                }
            }
            if(flag) break;
        }
        System.out.println(Arrays.toString(value));
    }
}
