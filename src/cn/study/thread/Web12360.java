/*
* 对同一份资源进行代理（并发）
* */
package cn.study.thread;
public class Web12360 implements Runnable {
// 票数
    private int ticketNums = 99;
    @Override
    public void run() {
        while(true){
            if(ticketNums<0){
                break;
            }
            try {
                Thread.sleep(2000); //模拟延时
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
