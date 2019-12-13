/*
* Callable 实现多线程
* */
package cn.study.thread;

import java.util.concurrent.Callable;

public class CallableTest {
        public static void main(String[] args) {
            //创建实现类对象
            StartThread st = new StartThread();
            //创建代理类对象 通过代理类对象实现多线程
            Thread t =new Thread(st);
            //启动线程 //交给 cpu 运行，其实就是相当于异步。你并不知道里面的运行顺序 main 方法是主线程
            //注意是 start 方法
            t.start();

            //只用一次匿名整合实现,上面的使用
//        new Thread(new StartThread()).start();
            for (int i = 0; i < 20; i++) {
                System.out.println("222");
            }
        }

}
