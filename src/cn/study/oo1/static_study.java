package cn.study.oo1;

public class static_study {
    int id;
    String name;
    String pwd;
    static String company = "你好你好";

    public static_study(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void login() {
        System.out.println("登陆" + this.name);
    }

    public static void printCompany() {
        System.out.println(company);
    }

    public static void main(String[] args) {
//        cn.study.oo1.static_study u = new cn.study.oo1.static_study(101, "chen");
        static_study.printCompany();
        static_study.company = "他好他好";
        static_study.printCompany();
//        u.login();
    }
}

// 结合内存分析，有类不一定有对象，但是类被初始化了就一定加载了静态变量。
