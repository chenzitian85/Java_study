package cn.study.oo1;

public class extends_study {
    public static void main(String[] orgs) {
        Student stu = new Student();
    }
}

class Person {
    String name;
    int height;

    public void rest() {
        System.out.println("休息一会");
    }
}

class Student extends Person {
    public Student() { //如果你创造了构造器那么你需要手动定义空构造器
    }

    public Student(String name, int height, String major) {
        this.name = name;
        this.height = height;
        this.major = major;
    }

    String name;
    int height;
    String major;

    public void study() {
        System.out.println("学习两小时");
    }
}