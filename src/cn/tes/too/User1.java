package cn.tes.too;

public class User1 {
    public String name = "nihao";
    public void testout(){
        System.out.println("引用了User1");
        System.out.println(this.name);
    }
    public static void main(String[] args) {
        System.out.println("引入了User1");
    }
}


// 跨包之间的引用