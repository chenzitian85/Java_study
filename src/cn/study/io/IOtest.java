/*
 * IO 字节流
 * 1、创建源（这里的源头是文件）
 * 2、选择流
 * 3、操作
 * 4、释放资源
 * */
package cn.study.io;

import java.io.*;

public class IOtest {
    public static void main(String[] args) throws IOException {
        File src = new File("C:\\Users\\Administrator\\Desktop\\untitled\\src\\cn\\study\\io\\gg.txt");
        //创建流
        System.out.println(src.exists());//是否存在
        //选择流
        InputStream is = null;
        try {
            is = new FileInputStream(src);
            //操作、读取
//            int data1 = is.read();
//            int data2 = is.read();
//            int data3 = is.read();
//            System.out.println((char) data1);
//            System.out.println((char) data2);
//            System.out.println((char) data3);

            int temp; //这里赋值放在了里面是因为每次读取的都是一个字节
            while ((temp = is.read()) != -1) {
                //因为输出的是字节 ，所以需要转换成字符
                System.out.println((char) temp);
            }
            // 没数据返回的是-1
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //4、释放资源 java无权操作文件需要需要虚拟机调用系统，所以要释放
            if(null!=is){
                is.close();
            }
        }
    }
}
