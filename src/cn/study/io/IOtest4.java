/*
 * IO 字节流-》输出流
 * 1、创建源（这里的源头是文件）
 * 2、选择流
 * 3、操作
 * 4、释放资源
 * */
package cn.study.io;

import java.io.*;

public class IOtest4 {
    public static void main(String[] args) throws IOException {
        File src = new File("C:\\Users\\Administrator\\Desktop\\untitled\\src\\cn\\study\\io\\input.txt");
        OutputStream os = null;
        try{
            os = new FileOutputStream(src); //不存在会创建、 源码构造函数会自动创建
            // 操作（写出）
            String msg = "IO test";
            byte[] datas = msg.getBytes();//编码
            os.write(datas,0,datas.length);
            os.flush();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4、释放资源
            if (null != os) {
                os.close();
            }
        }
    }
}
