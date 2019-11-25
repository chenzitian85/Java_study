package cn.study.oo1;

public class override_study {
    public static void main(String[] args){
        house h = new house();
        h.run();
    }

}
class Vehicle {
    public void run (){
        System.out.println("跑");
    }
    public void stop(){
        System.out.println("停止！");
    }
}
 class house extends Vehicle {
    public void run (){
        System.out.println("重写Vehicle");
    }
    // 重写方法名要求一样
}