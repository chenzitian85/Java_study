/*
 * 多线程
 * 创建线程方式 1、继承 Thread 2、实现 Runnable 接口（推荐）
 * 2、实现 Runnable 接口（推荐） 创建代理对象实现多线程，比较推荐这种实现是因为对象是能单继承，而接口能够多继承。
 * */
package cn.study.thread;

public class RunnableTest implements Runnable {
    /*
     * run 是线程入口在这执行异步的任务
     * */
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("111");
        }
    }

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
