/*
* 多线程
* 创建线程方式 1、继承 Thread 2、实现 Runnable 接口（推荐）3、实现 callable 接口
* 继承 Thread 实现
* */
package cn.study.thread;

import javax.imageio.stream.ImageInputStream;

public class StartThread extends Thread {
    /*
    * run 是线程入口在这执行异步的任务
    * */
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 20; i++) {
            System.out.println("111");
        }
    }

    public static void main(String[] args) {
       //创建线程
        StartThread st = new StartThread();
        //启动线程 //交给 cpu 运行，其实就是相当于异步。你并不知道里面的运行顺序 main 方法是主线程
        //注意是 start 方法
        st.start();
        for (int i = 0; i < 20; i++) {
            System.out.println("222");
        }
    }
}
