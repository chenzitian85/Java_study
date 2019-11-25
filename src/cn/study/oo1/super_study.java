/*
* 继承
* */
package cn.study.oo1;

public class super_study {
    public static void main(String[] args) {
        new Child().f();
    }
}

class Father {
    public int value;
    public void f() {
        value = 100;
        System.out.println(value);
    }
}

class Child extends Father {
    public void f() {
        super.f(); //调用父类未重写前的方法
        value = 200; //是可以修改父类的变量的，这个还得看父类变量定义的类型是什么
        System.out.println("ChildVaule" + value);
        System.out.println(value);
        System.out.println(super.value);
    }
}
