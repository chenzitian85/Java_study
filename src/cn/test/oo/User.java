package cn.test.oo; // 域名倒着写，非注释性语句的第一句
import  cn.tes.too.*; // 通配符号可引入所有的类但是会降低编译速度
import static java.lang.Math.*; // 导入所有静态属性
// import  cn.tes.too.User1;
public class User {
    public static void main(String[] args){
        User1 user = new User1();
        user.name="asdasd";
        user.testout();
        System.out.println(PI);
    }
}
// 跨包之间的引用