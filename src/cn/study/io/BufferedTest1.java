/*
* 缓冲流性能测试
* */
package cn.study.io;

import java.io.*;

public class BufferedTest1 {
    public static void main(String[] args) {

    }
    /*
     * 缓冲流更好的封装
     * */
    public static void test() throws IOException {
        File src = new File("C:\\Users\\Administrator\\Desktop\\untitled\\src\\cn\\study\\io\\gg.txt");
        //创建流
        System.out.println(src.exists());//是否存在
        //选择流 (输入流)
        try(InputStream is = new BufferedInputStream(new FileInputStream(src))) { //JDK 括号后面这样写的会自动释放资源，后面不用close
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
        }
    }
}
