// 封装
package cn.study.oo1;

public class encasulation_study {
    private int id;
    private String name;
    private int age;
    private boolean man;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 封装可是先复杂功能的聚合
    public void setAge(int age) {
        if(age<=18 && age>=70){
            System.out.println("请输入正确的年龄");
        }else {
            this.age = age;
        }
    }

    public void setMan(boolean man) {
        this.man = man;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isMan() {
        return man;
    }
    public static void main (String[] args){
        encasulation_study e = new encasulation_study();
        e.setAge(90);
    }
}
