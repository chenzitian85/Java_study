/*
*文件转字节数组
* 为什么要图片（文件）存放到字节数组中，因为这里通过 FileInputStream 将文件读取出来，但是这是断断续续的读了之后并没有存起来，而且读取到 ByteArray 好处就是可以通过直接操作内存操作
* 实际上就是一个拷贝的操作
* */
package cn.study.io;

import java.io.*;

public class imgByteArray {
    public static void main(String[] args) {
       byte[] datas = fileToByteArray();
        System.out.println(datas.length);
    }
    /*
    * 1、图片读取到数组中
    * 图片到程序 FileInputStream
    * 程序到字节数组 ByteArrayOutputStream
    * */
    public static byte[] fileToByteArray(){
        //创建源
        File f = new File("src/cn/study/io/timg.jpg");
        //选择流
        InputStream is = null; //
        ByteArrayOutputStream baos = null; //源码中其实也是通过拷贝把 InputStream 的内容拷贝到 baos 中 ,实际上就是拷贝过去
        try{
           is = new FileInputStream(f);
           baos = new ByteArrayOutputStream();

           //操作
        byte[] flush = new byte[1024];
        int len;
        //读取
        while((len=is.read(flush))!=-1){
            //解码 字节->字符串
            baos.write(flush,0,len);
        }
        baos.flush();
        return baos.toByteArray();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    /*
    * 2、字节数组写出到图片
    *字节数组到程序 ByteArrayInputStream
    * 程序到文件 FileOutputStream
    * */
    public static void byteArrayToFile(){

    }
}
