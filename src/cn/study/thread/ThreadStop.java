/*
* 终止线程
* 1、线程正常执行完毕 --> 次数
* 2、外部干涉 --> 加入标识
* 3、stop() 不推荐使用
* */
package cn.study.thread;

public class ThreadStop implements Runnable {
    //加入标识 标记线程是否可以运行
    private boolean flag = true;
    public static void main(String[] args) {
//        new Thread(()->{ System.out.println("1111"); }).start();
        ThreadStop ts = new ThreadStop();
        new Thread(ts).start();
        for (int i = 0; i <20 ; i++) {
            if (i == 10){
                ts.terminate();
                System.out.println("thread is stop");
            }
            System.out.println("11");
        }
    }

    @Override
    public void run() {
        int i = 0;
        //关联标识，true 运行 false 停止
        while(flag){
            System.out.println("111");
        }
    }
    //对外提供标识的改变
    public void terminate(){
        this.flag = false;
    }
}
