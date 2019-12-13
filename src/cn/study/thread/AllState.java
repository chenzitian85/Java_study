/*
* 监控 jvm 状态
* */
package cn.study.thread;

public class AllState {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(()->{
            System.out.println("111");
        });
        t.start();
        //获取当前的状态
        Thread.State state = t.getState();
        System.out.println(state);
        t.sleep(10000);
        state = t.getState();
        System.out.println(state);
    }
}
