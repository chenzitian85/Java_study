/*
 * 二分查找（折半检索）
 * 1、先排序 2、将要查找的值和数组中间值对比，大于的话取右边小于取左边
 * */
package cn.study.oo3;

import java.util.Arrays;

public class BinarySearch_study {
    public static void main(String[] args) {
        int[] arr = {1, 10, 5, 5, 60, 10, 30, 45, 78, 65, 12, 30, 48, 12};
        Arrays.sort(arr); //排序
        System.out.println(Arrays.toString(arr));
        System.out.println(myBinarySearch(arr,45));
    }
// arr 操作的数组 value 想要查找的数值，返回的是该数值的索引
    public static int myBinarySearch(int[] arr, int value) {
        int low = 0; //开始检索的位置
        int high = arr.length - 1; //
        while (low <= high) {
            int mid = (low + high) / 2; //保留的是整数
            //这里一直不是很懂为什么是 low + high/2 ,
            if (value == arr[mid]) {
                return mid;
            }
            if (value > arr[mid]) {  //大于中间值
                low = mid + 1;
            }
            if (value < arr[mid]) {
                high = mid - 1;
            }
        }
        return -1;//找不到
    }
}
