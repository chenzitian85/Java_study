/*
* 礼让线程
* */
package cn.study.thread;

public class YuieldTest {
    public static void main(String[] args) {
        MyYield myYield = new MyYield();
        new Thread(myYield).start();
    }
}
class MyYield implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"start");
        Thread.yield();
        System.out.println(Thread.currentThread().getName()+"end");
    }
}
