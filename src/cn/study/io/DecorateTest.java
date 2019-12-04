/*
* 装饰者设计模式（在原有的基础上new多个对象实现不同的功能）
* 1、抽象组件：需要装饰的抽象对象（接口或者抽象父类）
* 2、具体组件：需要装饰的对象
* 3、抽象装饰类：包含了对抽象组建的引用以及装饰者共有的方法
* 4、具体的装饰类：被装饰的对象
* */
package cn.study.io;

public class DecorateTest {
}
// 接口
interface Drink{
    double cost();//费用
    String info();//说明
}
// 具体组件
class Coffee implements Drink{
private String name = "cafe";
    @Override
    public double cost() {
        return 10;
    }
    @Override
    public String info() {
        return this.name;
    }
}
//抽象装饰类
class Decorate implements Drink{

    @Override
    public double cost() {
        return 0;
    }

    @Override
    public String info() {
        return null;
    }
}
