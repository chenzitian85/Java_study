/*
* 线程的优先级1 - 10  没置默认都是5
* 注意！！！优先级不代表先后顺序，优先级低的也会执行只不过执行的比较少
* 1、NORM_PRIOTY
* 2、MIN_PRIORITY
* 3、MAX_PRIORITY
* */
package cn.study.thread;

public class PriorityTest {
    public static void main(String[] args) {
        //主线程优先级
        System.out.println(Thread.currentThread().getPriority());
        Mypriority my= new Mypriority();

        Thread t1 = new Thread(my);
        Thread t2 = new Thread(my);
        Thread t3 = new Thread(my);
        Thread t4 = new Thread(my);
        Thread t5 = new Thread(my);
        Thread t6 = new Thread(my);
        //
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(3);
        t3.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
    }
}
class Mypriority implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getPriority());
    }
}
