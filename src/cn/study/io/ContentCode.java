/*
* 字符->子节 编码
* 字集->子节 解码
* */
package cn.study.io;

import java.io.UnsupportedEncodingException;

public class ContentCode {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String msg = "1若符合法规和对方1啊啊啊";
        //编码：字节数组 字符->子节
        byte [] datas = msg.getBytes(); //转成字节数组 //默认是使用项目创建时字符集
        System.out.println(datas.length);

        datas = msg.getBytes("UTF-16LE");
        System.out.println(datas.length);

        //解码： 字集->子节
        msg = new String(datas,0,datas.length-1, "utf8");
        System.out.println(msg);
    }
}
