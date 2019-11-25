package cn.study.oo1;

public class toString_study {
    public static void main(String[] args){
        toString_study to = new toString_study();
        System.out.println(to.toString());
    }
    // 重写toString
    public String toString(){
        return "重写tostring";
    }
}
