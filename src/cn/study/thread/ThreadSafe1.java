/*
* 线程不安全：模拟取款
* */
package cn.study.thread;

public class ThreadSafe1 {
    public static void main(String[] args) {
      acount acount = new acount(100,"存");
      Drawing d1 = new Drawing(acount,80,"取1");
      Drawing d2 = new Drawing(acount,80,"取2");
      d1.start();
      d2.start();
    }
    public void a(){
    }
}
class acount{
    int money;
    String name;
    public acount(int money, String name) {
        this.money = money;
        this.name = name;
    }
}
//模拟取款
class  Drawing extends Thread{
    acount acount;//取钱的账户
    int drawingMoey;//取钱的钱数
    int drawingTotal;//总数
    public Drawing(cn.study.thread.acount acount, int drawingMoey,String name) {
        this.acount = acount;//这里其实已经传入了实例化的 acount 了，所以下面可以直接用 acount 里面的成员属性
        this.drawingMoey = drawingMoey;
    }

    @Override
    public void run(){
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
