/*
 * 多线程电影院
 * */
package cn.study.thread;

public class MovieTicket {
    public static void main(String[] args) {
        Cinema c = new Cinema(20, "影院");
        new Thread(new Customer(c, 2), "customer1").start();
        new Thread(new Customer(c, 1), "customer2").start();
    }
}

class Cinema {
    int available;// 可用位置
    String name; //名称

    public Cinema(int available, String name) {
        this.available = available;
        this.name = name;
    }

    /*
     * 购票
     * seats 票数
     * */
    public boolean bookTickets(int seats) {
        System.out.println("可用位置:" + available);
        if (seats > available) {
            return false;
        }
        return true;
    }
}

class Customer implements Runnable {
    Cinema cinema;
    int seats;
    public Customer(Cinema cinema, int seats) {
        this.cinema = cinema;
        this.seats = seats;
    }
    @Override
    public void run() {
        synchronized (cinema) {
            boolean flag = cinema.bookTickets(seats);
            if (flag) {
                System.out.println("出票成功" + Thread.currentThread().getName() + "位置：" + seats);
            } else {
                System.out.println("位置不够");
            }
        }
    }
}
