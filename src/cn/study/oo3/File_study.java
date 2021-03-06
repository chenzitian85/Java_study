/*
* 文件操作
* */
package cn.study.oo3;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Date;
import java.util.PrimitiveIterator;
import java.util.regex.Pattern;

public class File_study {
    public static void main(String[] args) throws IOException {
        File f = new File("d:/ff.txt"); //获取文件对象（不是创建文件！），对应文件目录的地址，返回的是路径，
        f.createNewFile(); //创建，上面不加路径默认在根目录下
        f.renameTo(new File("d:/gg.txt")); //改名字

        System.out.println(System.getProperty("user.dir")); //获取文件根目录
        System.out.println(f);
        System.out.println("File是否存在："+f.exists());
        System.out.println("File是否是目录："+f.isDirectory());
        System.out.println("File是否是文件："+f.isFile());
        System.out.println("File最后修改时间："+new Date(f.lastModified()));
        System.out.println("File的大小："+f.length());
        System.out.println("File的文件名："+f.getName());
        System.out.println("File的目录路径："+f.getPath());

        // 通过 list() 列出文件列表并过滤
        File fs = new File("C:\\Users\\Administrator\\Desktop\\untitled\\src\\cn\\study\\oo3");
        String[] list = fs.list();
        for (String string : list) {//迭代出来的都是文件名
            System.out.println(string);
        }
    }
}

/*
* 文件过滤器
* */
class DirFilter implements FilenameFilter{
    private Pattern pattern; //表示正则表达式
//https://www.iteye.com/blog/langgufu-2100857
    public DirFilter(String regex) {
        this.pattern = Pattern.compile(regex);
    }
    @Override
    public boolean accept(File dir, String name) {
        return pattern.matcher(name).matches();
    }


}

