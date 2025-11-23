/*
 * 反弹动画：使用Swing和线程实现图标在窗体中做反弹运动。
 * */

package chapter20.practice;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Motion extends JFrame
{ // 创建“运动”类继承窗体
    private JPanel contentPane; // 内容面板

    public static void main(String[] args)
    {
        Motion motion=new Motion(); // 创建“运动”窗体对象
        motion.setVisible(true); // 使“运动”窗体可视
    }

    public Motion()
    { // “运动”窗体的构造方法
        setTitle("反弹运动");// 设置窗体标题
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 设置关闭窗体的方式
        setBounds(100,100,376,350); // 设置窗体的横、纵坐标，宽高
        // 内容面板
        contentPane=new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);
        // 充当运动区域的面板
        JPanel panel=new JPanel();
        panel.setBorder(new LineBorder(Color.BLACK,1,true));
        panel.setBounds(10,10,350,270);
        contentPane.add(panel);
        panel.setLayout(null);
        // 显示“圆点”的标签
        JLabel circleLbl=new JLabel("●");
        circleLbl.setBounds(27,53,15,15);
        panel.add(circleLbl);
        // 显示“五角星”的标签
        JLabel starLbl=new JLabel("★");
        starLbl.setBounds(330,189,15,15);
        panel.add(starLbl);
        // 创建以标签、面板为参数的线程对象
        MyThread circle=new MyThread(circleLbl,panel);
        MyThread star=new MyThread(starLbl,panel);
        // “开始”按钮
        JButton startBtn=new JButton("开始");
        startBtn.setBounds(267,290,93,23);
        contentPane.add(startBtn);
        startBtn.addActionListener(new ActionListener()
        { // 为“开始”按钮添加动作事件的监听
            @Override
            public void actionPerformed(ActionEvent arg0)
            { // 单击“开始”按钮时发生操作
                if(startBtn.getText().equals("开始"))
                { // 点击“开始”按钮时
                    circle.start(); // 启用“圆点”线程
                    star.start(); // 启用“五角星”线程
                    startBtn.setText("暂停"); // 按钮中的字体内容替换为“暂停”
                }else if(startBtn.getText().equals("暂停"))
                { // 点击“暂停”按钮时
                    circle.stopRun(); // 停止“圆点”线程
                    star.stopRun(); // 停止“五角星”线程
                    startBtn.setText("继续"); // 按钮中的字体内容替换为“继续”
                }else if(startBtn.getText().equals("继续"))
                { // 点击“继续”按钮时
                    circle.goRun(); // 启用“圆点”线程
                    star.goRun(); // 启用“五角星”线程
                    startBtn.setText("暂停"); // 按钮中的字体内容替换为“暂停”
                }
            }
        });
    }
}

class MyThread extends Thread
{ // 创建“我的线程”继承Thread类
    boolean interrupt=false; // 挂起线程的标志
    JLabel label; // 标签
    JPanel panel; // 面板

    public MyThread(JLabel l,JPanel p)
    { // 以标签、面板为参数的构造方法，利用构造方法初始化变量
        label=l;
        panel=p;
    }

    synchronized void goRun()
    { // 继续运行
        interrupt=false; // 终止“挂起区”循环
        notify(); // 唤醒等待（wait()）的线程
    }

    synchronized void stopRun()
    { // 暂停运行
        interrupt=true; // 开启“挂起区”循环
    }

    @Override
    public void interrupt()
    {
        int px=panel.getWidth()-label.getWidth(); // 横向最大边界
        int py=panel.getHeight()-label.getHeight(); // 纵向最大边界
        int xadd=1, yadd=1; // 坐标偏移量
        while(true)
        {
            synchronized(this)
            {// 挂起区
                while(interrupt)
                {
                    System.out.println(interrupt);
                    try
                    {
                        wait(); // 挂起
                    }catch(InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
            }
            int x=label.getX(); // 获取横坐标
            int y=label.getY(); // 获取纵坐标
            if(x<=0 || x>=px)
            {// 判断是否到达边界
                xadd*=-1;// 换方向
            }
            if(y<=0 || y>=py)
            {
                yadd*=-1;
            }
            label.setBounds(x+xadd,y+yadd,label.getWidth(),label.getHeight());// 重新设置位置
            try
            {
                Thread.sleep(8); // 利用线程的休眠控制图标的运行速度
            }catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
