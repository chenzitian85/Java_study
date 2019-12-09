package cn.study.commonsIO;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.EmptyFileFilter;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

//引入commins.io 方式 https://blog.csdn.net/xxtnt/article/details/82992276
public class Test {
    public static void main(String[] args) throws IOException {
        long len = FileUtils.sizeOf(new File("C:\\Users\\Administrator\\Desktop\\untitled\\src\\cn\\study\\commonsIO\\Test.java"));
        System.out.println(len);
        System.out.println("------------------");
        Collection<File> file = FileUtils.listFiles(new File("C:\\Users\\Administrator\\Desktop\\untitled\\src\\cn\\study\\io"), EmptyFileFilter.NOT_EMPTY, null);
        //目录 + 非空过滤器
        for (File files : file
        ) {
            System.out.println(files.getAbsolutePath());
        }
        System.out.println("------------------");
        String msg = FileUtils.readFileToString(new File("C:\\Users\\Administrator\\Desktop\\untitled\\Test.txt"),"UTF-8");
        System.out.println(msg);
        //转成字节数组
        byte[] datas = FileUtils.readFileToByteArray(new File("C:\\Users\\Administrator\\Desktop\\untitled\\Test.txt"));
        System.out.println(datas.length);
    }
}
