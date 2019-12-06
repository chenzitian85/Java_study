/*
 * 随机读取和写入流
 * https://www.jianshu.com/p/360e37539266
 * */
package cn.study.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class randomAccessFileTest {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\Administrator\\Desktop\\untitled\\src\\cn\\study\\io\\gg.txt");
        RandomAccessFile raf = new RandomAccessFile(f, "r");//r是模式
        //随机读取
        //读取2以后的内容（2以后的全部内容）
        raf.seek(2);//读取2以后的内容 // native加了这个的意思就是交给c来实现
        byte[] flsuh = new byte[1024];
        int len = -1;
        while ((len = raf.read(flsuh)) != -1) {
            System.out.println(new String(flsuh, 0, len));
        }
        raf.close();
    }

    //只读取其中一段内容
    public static void test1() throws IOException {
        File f = new File("C:\\Users\\Administrator\\Desktop\\untitled\\src\\cn\\study\\io\\gg.txt");
        RandomAccessFile raf = new RandomAccessFile(f, "r");//r是模式
        //起始位置
        int beginpos = 2;
        //实际长度
        int actualSize = 102;
        raf.seek(beginpos);
        //随机读取
        //读取2以后的内容 , 长度为 actualSize

        raf.seek(2);//读取2以后的内容 // native加了这个的意思就是交给c来实现
        byte[] flsuh = new byte[1024];
        int len = -1;
        //分段读取
        while ((len = raf.read(flsuh)) != -1) { //len 是实际的大小
            if (actualSize > len) {//如果要的长度大于len那就表示全部都要
                System.out.println(new String(flsuh, 0, len));
                actualSize -= len;
            } else {
                System.out.println(new String(flsuh,0,len));
                break;
            }
        }
        raf.close();
    }
}
