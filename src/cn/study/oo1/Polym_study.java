// 多态
package cn.study.oo1;

public class Polym_study {

    public static void main(String[] args) {
        Animal a = new Animal();
        animalCry(a);
        Animal d = new dog(); //自动向上转型 ！！
        animalCry(d);
        // 传入了 dog 对象 父类引入到了子类。。这就是多态！自动转型 ！！
        // 如过要使用 dog 对象要重新转回来
    }
    static void animalCry(Animal b) {
        b.shout();
    } //一开始不明白为什么在equals_study中要强转对象但是这里不用，这里传进来的是 Animal 已经指明了类型所以不用强转
}

class Animal {
    public void shout() {
        System.out.println("叫");
    }
}

class dog extends Animal {
    public void shout() {
        System.out.println("www");
    }
}

class cat extends Animal {
    public void shout() {
        System.out.println("mmm");
    }
}