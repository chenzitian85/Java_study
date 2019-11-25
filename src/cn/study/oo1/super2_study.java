// 当字类有继承父类时创建对象会默认调用父类构造器 （继承树追溯）
// 构造方法的第一句总是 super 所以是向上一直追溯，直至到当前子类为止
// 静态初始化块调用顺序和构造方法一样
package cn.study.oo1;

public class super2_study {
    public static void main(String[] args) {
        System.out.println("开始创建一个对象");
        new Child2();
    }
}

class Father2 {
    public Father2() {
        super();// 默认的可以写可以不写
        System.out.println("传键Father");
    }
}

class Child2 extends Father2 {
    public Child2() {
        super(); // 默认的可以写可以不写
        System.out.println("传键Father");
    }
}


// 1 、同个包不能有同名类