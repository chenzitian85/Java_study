/*
 * 字节流和字符流的相互转换
 * 转换流 InputStreamReader OutputStreamWriter
 * 1、以字符流的形式操作字节流（纯文本）
 * 2、需要指定字符集
 * */
package cn.study.io;

import java.io.*;

public class TransformStream {
    public static void main(String[] args) {
        // 操作System.in 和 System.out
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //System.in 键盘输入 System.out 键盘输出
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) { // 这里分别代表输入和输出，不懂得可以看下前面的代码，输入流和输出流
            String msg = "";
            while(!msg.equals("exit")){
                //获取键盘的输入 ，输入此内容
                msg = reader.readLine();//循环读取
                writer.write(msg);//循环写出
                writer.newLine();
                writer.flush();// 强制刷新
            }
        } catch (IOException e) {
            System.out.println("操作异常");
        }
    }
}
