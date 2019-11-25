package cn.study.oo3;

import com.sun.xml.internal.fastinfoset.algorithm.FloatEncodingAlgorithm;

import java.io.File;
import java.util.Arrays;

public class FileTree {
    public static void main(String[] args) {
        File f = new File("d:/aida64");
//        File f = new File("oo3"); 这里默认的话会指向文件
        printFile(f);
    }
    static void printFile(File file){
        System.out.println(file.getName());
        if(file.isDirectory()){ //检查一个对象是否是文件夹
            File[] files = file.listFiles(); //返回下面所以子目录和文件
            for(File temp:files){
                printFile(temp); //递归把所有文件打印出来
            }
        }
    }
}
