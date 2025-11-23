/*
* 模拟红绿灯变化：红灯亮8秒，黄灯亮2秒，绿灯亮5秒。
* */

package chapter20.training;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.FlowLayout;

public class TraficLights extends JFrame
{ // 创建一个“交通灯”类，并继承JFrame
    private JPanel contentPane; // 内容面板
    private JLabel imageLbl; // 图片标签

    public static void main(String[] args)
    {
        TraficLights frame=new TraficLights(); // 创建“交通灯”窗体对象
        frame.setVisible(true); // 使“交通灯”窗体对象可视
    }

    /**
     * 创建窗体
     */
    public TraficLights()
    { // “交通灯”的构造方法
        setResizable(false); // 不可改变窗体的大小
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 设置窗体关闭的方式
        setBounds(100,100,125,278); // 设置窗体大小，位置
        // 内容面板
        contentPane=new JPanel();
        contentPane.setBackground(Color.WHITE);
        contentPane.setBorder(new EmptyBorder(5,5,5,5));
        contentPane.setLayout(new FlowLayout(FlowLayout.CENTER,5,5));
        setContentPane(contentPane);
        // 图片面板
        JPanel imagePane=new JPanel();
        imagePane.setBackground(Color.WHITE);
        imagePane.setBorder(new TitledBorder(null,"交通灯",TitledBorder.LEADING,TitledBorder.TOP,null,null));
        contentPane.add(imagePane);
        imagePane.setLayout(new BorderLayout(0,0));
        // 标签
        imageLbl=new JLabel("");
        imageLbl.setBackground(Color.WHITE);
        imageLbl.setIcon(new ImageIcon("src/chapter20/assets/Green.png"));
        imagePane.add(imageLbl,BorderLayout.CENTER);

        Thread thread=new TurnColor(imageLbl); // 创建线程类的子类之“改变颜色”的对象
        thread.start(); // 启用线程
    }
}

class TurnColor extends Thread
{ // 创建“改变颜色”类继承线程类
    private JLabel imageLbl; // 图像标签

    public TurnColor(JLabel imageLbl)
    { // 以图像标签为参数的构造方法，利用构造方法初始化变量
        this.imageLbl=imageLbl;
    }

    @Override
    public void run()
    { // 线程执行的任务
        while(true)
        { // 线程始终处于被启用状态
            try
            {
                Thread.sleep(5000); // 线程休眠5秒
            }catch(InterruptedException e)
            {
                e.printStackTrace();
            }
            imageLbl.setIcon(new ImageIcon("src/chapter20/assets/Yellow.png")); // 黄灯
            try
            {
                Thread.sleep(2000); // 线程休眠2秒
            }catch(InterruptedException e)
            {
                e.printStackTrace();
            }
            imageLbl.setIcon(new ImageIcon("src/chapter20/assets/Red.png")); // 红灯
            try
            {
                Thread.sleep(8000); // 线程休眠8秒
            }catch(InterruptedException e)
            {
                e.printStackTrace();
            }
            imageLbl.setIcon(new ImageIcon("src/chapter20/assets/Green.png")); // 绿灯
        }
    }
}