/*
* 数据流
* 1、先写出后读取
* 2、读取的顺序与写出一致
* DataOutStream
* DataInputStream
* */
package cn.study.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.*;
import java.io.IOException;


public class DataInputStream {
    public static void main(String[] args) throws IOException {
        //写出
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        DataOutputStream docs = new DataOutputStream(baos);
        //操作数据类型 + 数据
        docs.writeUTF("数据流测试");
        docs.writeInt(18);
        docs.writeBoolean(false);
        docs.writeChar('a');
        docs.flush();
        //读取
        byte[] datas = baos.toByteArray();
        System.out.println(datas.length);
        java.io.DataInputStream dis = new java.io.DataInputStream(new ByteArrayInputStream(datas));
        String msg = dis.readUTF();
        int age = dis.readInt();
        boolean flag = dis.readBoolean();
        char date = dis.readChar();
        System.out.println(date);
    }
}
