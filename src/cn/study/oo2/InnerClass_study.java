/*
* 非静态内部类
* 1、内部类可以用外部
* 2、外部类不可以用内部类
* 3、不能加 static 属性（定义成静态内部类就行）
* */
package cn.study.oo2;

public class InnerClass_study {
    //创建内部类对象
    public static void main(String[] args) {
        // 要先创建外部类对象
        Outer.Inner inner = new Outer().new Inner();
    }

}
class Outer{
    private int age = 10;
    public void testOuter(){
    }
    class Inner{
        public void show(){
            System.out.println("外部类成员变量age："+Outer.this.age);
        }
    }

}