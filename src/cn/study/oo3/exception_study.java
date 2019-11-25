/*
 * 异常处理
 * 使用 try-catch 捕获异常
 * 1、空指针
 * */
package cn.study.oo3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StreamCorruptedException;

public class exception_study {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader reader =null;
        try {
            reader = new FileReader("d:/aa.txt");
            char c1 = (char)reader.read();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println(e);
        } catch (IOException e){
            System.out.println(e);
        }finally{ //reader 需要关闭
            try{ //因为声明是在 try 声明的；
                if(reader!=null){
                    reader.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        //上面是子类下面是父类，子类前父类后
    }
}
