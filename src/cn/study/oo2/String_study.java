/*
 * 字符串
 * 1、常量池
 * */
package cn.study.oo2;

public class String_study {
    public static void main(String[] args) {
        String a = "111";
        String a1 = new String("der");
        String a3 = "18" + 19; //字符串
        String a10 = "111";
        String a11 = "111";
        String a12 = new String("111");
        System.out.println(a10 == a11); //true;同一个对象，因为是同一个常量池
        System.out.println((a10 == a12)); // false;重新 new 了一个对象

        //通常比较字符串时，使用 equals
        System.out.println(a10.equals(a12)); //true


        //StringBuilder 线程不安全，效率高（一般使用它）
        StringBuilder sb = new StringBuilder("qweqwe");
        //StringBuffer 则相反
    }
}
