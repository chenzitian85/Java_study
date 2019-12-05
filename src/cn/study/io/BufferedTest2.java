/*
 * 使用缓冲流的方法
 * */
package cn.study.io;

import java.io.*;

public class BufferedTest2 {
    public static void main(String[] args) throws IOException {
        test();
    }
    /*
     * 缓冲流更好的封装
     * */
    public static void test() throws IOException {
        //创建流
        File src = new File("C:\\Users\\Administrator\\Desktop\\untitled\\src\\cn\\study\\io\\gg.txt");
        //选择流 (输入流)
        //不使用 Reader 多态无法使用子类的方法
        try(BufferedReader reader = new BufferedReader(new FileReader(src));
            BufferedWriter writer = new BufferedWriter(new FileWriter(src))) { //JDK 括号后面这样写的会自动释放资源，后面不用close
            //操作（分段读取）
         String str = null;
         while((str = reader.readLine())!=null){
             System.out.println(str);
         }
         writer.append("测试BuffereWriter");
         writer.newLine();
         writer.append("换行了");
         writer.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }
    }
}
