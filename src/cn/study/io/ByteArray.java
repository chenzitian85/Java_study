/*
* 数组字节流（区别在于字节流和字符流是通过虚拟机调用系统操作文件，而数组字节流是虚拟机里面的地址，所以不用关闭流，会自动回收）
 * 1、创建源（这里的源头是数组字节流）
 * 2、选择流
 * 3、操作
 * 4、释放资源
* */
package cn.study.io;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ByteArray {
    public static void main(String[] args) throws IOException {
        byte[] src = "talk is cheap show me the code".getBytes();
        InputStream is = null;
            is = new ByteArrayInputStream(src);
        //操作（分段读取）
        byte[] flush = new byte[1024];
        int len; //这里赋值放在了里面是因为每次读取的都是一个字符
        while((len=is.read(flush))!=-1){
            //解码 字节->字符串
            String str = new String(flush,0,len);
            System.out.println(str);
        }


    }
}
