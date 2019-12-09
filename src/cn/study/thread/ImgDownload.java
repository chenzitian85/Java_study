/*
 * 多线程 图片下载
 * 创建线程方式 1、继承 Thread
 * 继承 Thread
 * */
package cn.study.thread;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class ImgDownload {

    public static void main(String[] args) {
        TDownloader td1 = new TDownloader("http://b.hiphotos.baidu.com/image/pic/item/908fa0ec08fa513db777cf78376d55fbb3fbd9b3.jpg","1.jpg");
        TDownloader td2 = new TDownloader("http://b.hiphotos.baidu.com/image/pic/item/908fa0ec08fa513db777cf78376d55fbb3fbd9b3.jpg","2.jpg");
        TDownloader td3 = new TDownloader("http://a.hiphotos.baidu.com/image/pic/item/f603918fa0ec08fa3139e00153ee3d6d55fbda5f.jpg","3.jpg");
        //这里不是 run
        td1.start();
        td2.start();
        td3.start();
    }

    public void download(String url,String name){
        try{
            FileUtils.copyURLToFile(new URL(url),new File(name));
        }catch (MalformedURLException e) {
            e.printStackTrace();
            System.out.println("不合法URL");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
/*
* 线程
* */
class TDownloader extends Thread {
    private String url;//远程路径
    private String name;//存储名字

    public TDownloader(String url, String name) {
        this.url = url;
        this.name = name;
    }

    @Override
    public void run(){
        ImgDownload im = new ImgDownload();
        im.download(url,name);
        System.out.println(name);
    }
}
