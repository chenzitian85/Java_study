//  抽象类 1、 包含抽象方法必须是抽象类 2、类似设计规范
package cn.study.oo2;

// 1、没有实现。 2、子类必须实现
public abstract class abstract_study {
    abstract public void shot();
     void run(){
        System.out.println("rrr");
    }
}

class aa extends abstract_study{
// 子类必须实现
    @Override
    public void shot() {

    }
}