/*
* 包装类
* */
package cn.study.oo3;

public class WrappedClasss_study {
    public static void main(String[] args) {
        //基本数据类型转包装类对象
        Integer i = new Integer(10);
        Integer b = Integer.valueOf(30);
        //包装类转换成基本数据类型
        int c = i.intValue();
        double d = b.doubleValue();

        //字符串转包装类
        Integer e = new Integer("99999");
        Integer f = Integer.parseInt("88888");

        //包装类转字符串
        String str = f.toString();

        //常见的常量
        System.out.println("Int类型最大"+Integer.MAX_VALUE);

        //自动装箱
        Integer x = 234;
        //自动拆箱
        int y = x;
    }
}
