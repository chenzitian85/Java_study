// 封装中变量的属性
//private 本类可访问
//什么都不加 本类本包可用
//public 其他包也可以用
//protected //本类本包可用
package cn.study.oo1;

public class encapsulation_study {
   public static void main (String[] args){
       Humen h= new Humen();
//       h.a = 13; 私有的不能调
   }
}
class Humen {
    private int a = 1; // 子类、包括其他类不可以使用
//    default int b = 2;
    String name = "czt";
    void sayAge(){
        System.out.println(this.a);
    }
}

class Person1 extends Humen{
    void sayhHello(){
        sayAge();
//        System.out.println(a); // 私有不能调用
        System.out.println(name); // 不加 public 同个包可以用用，跨包需要加 public
    }
}