/*
 * 线程锁 --》》如何锁对正确的线程
 * 同过同步块锁定正确的对象，这里锁定 acount2 这个对象
 *
 * */
package cn.study.thread;

import java.util.ArrayList;
import java.util.List;

public class synchronizedTest2 {
    public static void main(String[] args) {
        acount2 acount = new acount2(100,"存");
        Drawing2 d1 = new Drawing2(acount,80,"取1");
        Drawing2 d2 = new Drawing2(acount,80,"取2");
        d1.start();
        d2.start();
    }
    public void a(){
    }
}
class synchronizedTest3{
    // 这里的线程安全问题是 容器没存满 1000 个
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < 1000; i++) {
            new Thread(()->{
                synchronized (list){
                    list.add(Thread.currentThread().getName());
                }
            }).start();
        }
        System.out.println(list.size());
    }
}
class acount2{
    int money;
    String name;
    public acount2(int money, String name) {
        this.money = money;
        this.name = name;
    }
}
//模拟取款
class  Drawing2 extends Thread{
    acount2 acount;//取钱的账户
    int drawingMoey;//取钱的钱数
    int drawingTotal;//总数
    public Drawing2(cn.study.thread.acount2 acount, int drawingMoey,String name) {
        this.acount = acount;//这里其实已经传入了实例化的 acount 了，所以下面可以直接用 acount 里面的成员属性
        this.drawingMoey = drawingMoey;
    }
    @Override
    public void run(){
        test();
    }
    //存在多线程，synchronized 就是判断 acount 有没有被锁，代码块会执行完才释放这个锁，会影响性能（执行会慢了一些）
    public synchronized void test(){
        //提高性能，既然已经无资源了那么没必要继续执行下去了
        if(acount.money<=0){
            return;
        }
        //同步块
        synchronized (acount){
            if(acount.money-drawingMoey<0){
                System.out.println("余额不足");
                return; //直接跳出
            }
            // 这里模拟了网络延时就会出现 余额为负数的情况（线程不安全），正常上面已经做了负数的判断是不会出现的。
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            acount.money-=drawingMoey;
            drawingMoey+=drawingMoey;
            System.out.println(this.getName()+"--->账户余额"+acount.money);
            System.out.println(this.getName()+"--->总余额"+acount.money);
        }
    }
}
