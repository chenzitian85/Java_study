// 数组、数组也是对象
// 1、长度是确定的不可改变
// 2、类型必须是相同的，可以是任意类型
package cn.study.oo1;

public class array_study {
    public static void main(String[] args) {
        int[] arr_name;
        String arr02[];
        arr_name = new int[10];
        arr02 = new String[5];
        // 赋值
        for (int i = 0; i < 10; i++) {
            arr_name[i] = i;
        }
        // 先是在内存中初始化,然后重新赋值
        // arr_name[10] //会报数组越界
    }
}

class User3 {
    public static void main(String[] args) {
        //静态初始化
        int[] a = {2, 3, 4};
        //默认初始化
        int[] c = new int[3];
        //动态初始化
        int[] a1 = new int[2];
        a1[0] = 1;
        a1[2] = 2;

        // foreach 只能读取不能修改数组里面的数值
        for (int temp : a) {

        }
    }
}