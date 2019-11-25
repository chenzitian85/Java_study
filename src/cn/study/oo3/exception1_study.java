/*
 * 异常处理
 * 使用 throws 声明异常
 *1、避免使用异常代替简单的测试
 * 2、异常不可代替简单测试
 * 3、不要进行小力度的异常处理（应该将整个任务包住）
 * 4、异常往往在高层处理，调用者处理
 * */
package cn.study.oo3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class exception1_study {
    public static void main(String[] args) throws IOException {//抛出异常，继续往上抛
        readMyFile();
    }

    public static void readMyFile() throws IOException { //抛出异常，谁调谁处理
        FileReader reader = null;
        reader = new FileReader("d:/aa.txt");
        char c1 = (char) reader.read();
        if (reader != null) {
            reader.close();
        }
        //上面是子类下面是父类，子类前父类后
    }
}
