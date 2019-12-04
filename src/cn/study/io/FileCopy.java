/*
 * 文件字节输出流
 * 1、创建源
 * 2、选择流
 * 3、操作
 * 4、释放资源
 * */
package cn.study.io;

import java.io.*;
public class FileCopy {
    public static void main(String[] args)  throws IOException {
        copy("C:\\Users\\Administrator\\Desktop\\untitled\\src\\cn\\study\\io\\gg.txt","C:\\Users\\Administrator\\Desktop\\untitled\\src\\cn\\study\\io\\input.txt");
    }

    /*
     * 文件拷贝
     * @srcPath 复制源
     * @destPath 输出源
     * */
    public static void copy(String srcPath,String destPath) throws IOException {
        File src1 = new File(srcPath);
        File src2 = new File(destPath);
        OutputStream os = null;
        InputStream is = null;
        try{
            os = new FileOutputStream(src2);
            is = new FileInputStream(src1);
            //操作（分段读取）
            byte[] flush = new byte[1024];
            int len; //这里赋值放在了里面是因为每次读取的都是一个字符
            while((len=is.read(flush))!=-1){
               os.write(flush,0,len); //直接将读取到的写入
            }
            os.flush();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4、释放资源 //先打开的后关闭
            if (null != os) {
                os.close();
            }
            if (null != is) {
                is.close();
            }
        }
    }
   }
