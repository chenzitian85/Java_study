package cn.Game.game_v1;
/*
 *飞机游戏的窗口
 * @author czt
 * */

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyGameFrame extends JFrame {
    Image plane = GameUtil.getImage("images/2.jpg");
    Image bg = GameUtil.getImage("images/1.jpg");
    @Override
    public void paint(Graphics g) { //这个函数自动调用 g相当于画笔
        super.paint(g);
//        Color c = g.getColor();
//        g.setColor(Color.CYAN);
//        g.drawLine(100,100,300,300); //线
//        g.drawRect(100,100,300,300);//矩形
//        g.setColor(c); //还原原来的颜色
        g.drawImage(bg,0,0,null);
        g.drawImage(plane,250,250,null);
    }

    /*
     * 初始化窗口
     * */
    public void launchFranme() {
        this.setTitle("czt--game");
        this.setVisible(true); //默认不可见
        this.setSize(500, 500);
        this.setLocation(300, 300);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        MyGameFrame f = new MyGameFrame();
        f.launchFranme();
    }
}
