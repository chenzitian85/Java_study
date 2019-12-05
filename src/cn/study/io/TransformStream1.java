/*
 * 网络爬虫
 * */
/*
 * 字节流和字符流的相互转换
 * 转换流 InputStreamReader(字节流到字符流) OutputStreamWriter(字符流到字节流)
 * 1、以字符流的形式操作字节流（纯文本）
 * 2、需要指定字符集
 * */
package cn.study.io;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class TransformStream1 {
    public static void main(String[] args) throws MalformedURLException {
        // 直接返回字符串
        //URL返回了InputStream new URL("http://www.baidu.com").openStream()) 这个流是字节流
        try (BufferedReader is = new BufferedReader(new InputStreamReader(new URL("http://www.baidu.com").openStream(), "UTF-8"));
             // 字节流到字符流
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("baidu.html"),"UTF-8"))) {
            // 操作、读取
           String msg;
            while((msg=is.readLine())!=null){
//                System.out.println(msg);
                writer.write(msg); //这里出现乱码可能是字符集不统一
                writer.newLine();
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
