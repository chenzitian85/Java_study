/*
* 对象流
* 输出流（反序列化）
* 输出流（序列化）
* 必须实现 Serializable 接口才能写入到流中
* 读写保持一致
* 不仅支持数据还支持对象
* */
package cn.study.io;

import java.io.*;

public class ObjectTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //写出 -- 序列化
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream docs = new ObjectOutputStream(new BufferedOutputStream(baos));
        //操作数据类型 + 数据
        docs.writeUTF("数据流测试");
        docs.writeInt(18);
        docs.writeBoolean(false);
        docs.writeChar('a');
        docs.writeObject("1111");//String 一定是实现了 Serializable 接口
        Employee e = new Employee("czt",100);
        docs.writeObject(e);
        docs.flush();

        //读取 -- > 反序列化
        byte[] datas = baos.toByteArray();
        System.out.println(datas.length);
        java.io.ObjectInputStream dis = new java.io.ObjectInputStream(new BufferedInputStream(new ByteArrayInputStream(datas)));
        String msg = dis.readUTF();
        int age = dis.readInt();
        boolean flag = dis.readBoolean();
        char date = dis.readChar();
        Object ss = dis.readObject();
        Object em = dis.readObject();
        System.out.println(em);

        //数据还原,存入的时候并不会存数据类型
        // instanceof判断是否是 某个实例
        if(ss instanceof String){
            String ssObj = (String)ss;
        }
        if(em instanceof Employee){
            Employee emObj = (Employee)em;
        }
    }

}
class Employee implements Serializable{
    private transient String name; //transient 该数据不需要序列化
    private int salar;

    public Employee(String name, int salar) {
        this.name = name;
        this.salar = salar;
    }

    public String getName() {
        return name;
    }

    public double getSalar() {
        return salar;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalar(int salar) {
        this.salar = salar;
    }
}
