/*
* sleep 阻塞进程
* 模拟网络延时、定时器
* */
package cn.study.thread;

public class BlookSleep implements Runnable {
    // 票数
    private int ticketNums = 99;
    @Override
    public void run() {
        while(true){
            if(ticketNums<0){
                break;
            }
            try {
                Thread.sleep(2000); //模拟延时、毫秒 这里是静态方法，哪个线程 sleep 哪个线程就阻塞
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //拿到当前线程的名字
            System.out.println(Thread.currentThread().getName()+"-->"+ticketNums-- );
        }
    }

    public static void main(String[] args) {
        Web12360 web = new Web12360();
        //同一份资源多个代理，构造器是可以有名称的
        new Thread(web,"1").start();
        new Thread(web,"2").start();
        new Thread(web,"3").start();
    }
}
