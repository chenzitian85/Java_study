/*
 * IO 字节流-》输入流
 * 1、创建源（这里的源头是文件）
 * 2、选择流
 * 3、操作
 * 4、释放资源
 * */
package cn.study.io;

import java.io.*;

public class IOtest2 {
    public static void main(String[] args) throws IOException {
        File src = new File("C:\\Users\\Administrator\\Desktop\\untitled\\src\\cn\\study\\io\\gg.txt");
        //创建流
        System.out.println(src.exists());//是否存在
        //选择流 (输入流)
        InputStream is = null;
        try {
            is = new FileInputStream(src);
         //操作（分段读取）
            byte[] flush = new byte[1024];
            int len; //这里赋值放在了里面是因为每次读取的都是一个字符
            while((len=is.read(flush))!=-1){
                //解码 字节->字符串
                String str = new String(flush,0,len);
                System.out.println(str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4、释放资源
            if (null != is) {
                is.close();
            }
        }
    }
}
