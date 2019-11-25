/*
接口 1、接口里边只能定义常量、抽象，默认会加上
     2、接口可以实现多个父接口
     3、接口不能 new 但是可以做引用类型，如interface_study m = new MyClass();
     */
package cn.study.oo2;

public class interface_study {
   /*public static final*/ int MAX_AGE = 100;

    /*public abstract*/ void test01() {

    }
}
class MyClass extends interface_study {
    // 接口必须要重写父类
    @Override
     void test01() {
        MAX_AGE = 200;
        System.out.println(MAX_AGE);
        super.test01();
    }

    public static void main(String[] args) {
        interface_study m = new MyClass();
        m.test01();
    }
}
