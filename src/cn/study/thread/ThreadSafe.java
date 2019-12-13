/*
* 线程不安全、同一份数据（同个对象，多个线程争夺资源）可能会出现负数或者相同的数
* 不是所有情况都要去处理线程不安全。改数据或者插数据的时候可能需要，查询一般不用
* */
package cn.study.thread;

public class ThreadSafe implements Runnable{
    // 票数
    private int ticketNums = 10;
    @Override
    public void run() {
        while(true){
            if(ticketNums<0){
                break;
            }
            try {
                Thread.sleep(2000); //模拟延时 , 这里是因为出现了延时才会到之后不安全
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
