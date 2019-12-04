package cn.study.io;

import java.io.*;


/*
* 对接输入流 输出流
* */
public class FileUtils {
    public static void main(String[] args) throws FileNotFoundException {
        // 内部都会实例 File 对象
        //文件到文件
        InputStream is = new FileInputStream("C:\\Users\\Administrator\\Desktop\\untitled\\src\\cn\\study\\io\\timg.jpg");
        OutputStream os =  new FileOutputStream("aaa.jpg");
        copy(is,os);
        // 文件到字节数组
        InputStream is1 = new FileInputStream("C:\\Users\\Administrator\\Desktop\\untitled\\src\\cn\\study\\io\\timg.jpg");
        OutputStream os2 = new ByteArrayOutputStream();
        copy(is1,os2);
        byte[] datas = ( (ByteArrayOutputStream)os2).toByteArray();
        System.out.println(datas.length);
        //字节数组到文件

    }
    public static void copy(InputStream is, OutputStream os){
        try{
            byte[] flush = new byte[1024]; // 缓冲容器
            int len = -1;
            while((len=is.read(flush))!=-1){
                os.write(flush,0,len); // 分段写出
            }
            os.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
