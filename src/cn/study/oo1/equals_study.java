package cn.study.oo1;

import java.util.Objects;

public class equals_study {
    public static void main(String[] args) {
        Object obj;
        String str;
        User u1 = new User(1000,"cz", "11");
        User u2 = new User(1000,"cz", "11");
        System.out.println(u1==u2);
        System.out.println(u1.equals(u2)); //重写了 equals 判断了 id 相同就行
    }
}

class User {
    int id;
    String name;
    String pwd;
    public User(int id, String name, String pwd) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o; // ！！ 这里要强转传进来的对象，因为传进来的是 Object o 你不知道传进来的是什么对象，所以要转换
        return id == user.id &&
                Objects.equals(name, user.name) &&
                Objects.equals(pwd, user.pwd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, pwd);
    }
}
