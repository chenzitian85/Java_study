package cn.study.oo1;

public class yinyong_study {
    int id;
    String name;
    String pwd;
    static String company = "你好你好";

    public yinyong_study(int id,String name){
        this.id = id;
        this.name = name;
    }
    public void testParameterTransfer01(yinyong_study u){
        u.name = "搞笑吧";
    }
    public static void main(String[] args) {
        yinyong_study u1 = new yinyong_study(100,"gfo");
        u1.testParameterTransfer01(u1);
        System.out.println(u1.name);
    }
}
// java 对象传递的本质
