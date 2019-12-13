/*
 * 简化线程的使用，（用一次的时候可以使用）其实跟js的箭头函数差不多，只不过这个用到了 类的创建和实例化的简化
 * */
package cn.study.thread;

public class LambdaTest {
    public static void main(String[] args) {
//        jdk 8 lambda 表达式 代表 new一个匿名内部类 等同于 new 类(){}
        new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                System.out.println("111");
            }
        }).start();

        for (int i = 0; i < 20; i++) {
            System.out.println("333");
        }
        System.out.println("--------------------");
//        III i = new Inter();
        // lambda 实现类的简化，这里等同于上面的创建类然后再实例化，这里接口只有一个实现才能匹配，必须存在类型才能匹配
       III i = (a,b)->{
            System.out.println("实现接口");
        };
        i.lambda(1,3);

    }
}

interface III {
    void lambda(int a, int b);
//    void lambda1(int a, int b); 这里接口只能有一个实现
}

class Inter implements III {

    @Override
    public void lambda(int a, int b) {
        System.out.println("jdk 8 lambda 表达式 代表 new一个匿名内部类 等同于 new 类(){}");
    }
}
