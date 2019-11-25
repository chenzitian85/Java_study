/*
* 静态内部类
* 1、相当于外部类的一个静态成员
* */
package cn.study.oo2;

public class StaticInnerClass {
    public static void main(String[] args) {
        Outer1.Inner = new Outer1.Inner();
    }
}

class Outer1{
    public static Object Inner;
    private int age = 10;
    public void testOuter(){
    }
    static class Inner{
        public void show(){
            System.out.println("外部类成员变量age：");
        }
    }

}