/*
*路径分隔符
* */
package cn.study.io;

import java.io.File;
import java.io.IOException;

public class PathDemo {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Administrator\\Desktop\\untitled\\src\\images\\2.jpg";
        System.out.println(File.separatorChar); //分隔符 1、建议用/
        // 构建 file 对象
        File src = new File(path); //文件不一定要存在
        System.getProperty("user.dir"); //相对项目路径
        System.out.println("----------------------");
        System.out.println(src.getName());
        System.out.println(src.getPath());
        System.out.println(src.getAbsolutePath()); //绝对路径
        System.out.println(src.getParentFile()); // 父路径
        System.out.println(src.exists());//是否存在
        System.out.println(src.isFile()); //是否文件
        System.out.println(src.isDirectory()); // 是否文件夹
        System.out.println(src.length());//字节 10kb 没有就是0
        System.out.println("----------------------");
        src = new File("C:\\Users\\Administrator\\Desktop\\untitled\\src\\images\\com");
        src.createNewFile(); // 创建文件
        src.delete();
    }
}
