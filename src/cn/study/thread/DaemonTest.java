/*
 * 守护线程：是为用户线程守护的；JVM 不用等到守护线程执行完毕才结束
 * 默认 jvm 是要等待用户线程执行完毕的
 * */
package cn.study.thread;

public class DaemonTest {
    public static void main(String[] args) {
        Thread G = new God();
        G.setDaemon(true);// 将线程设
        G.start();
        new You().start();
    }
}

class You extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 365 * 10; i++) {
            System.out.println("用户线程 ");
        }
    }
}

class God extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("守护线程");
        }
    }
}
