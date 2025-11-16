/*
* 在一个窗体中并排显示两张照片
* */

package chapter19.training;

import java.awt.*;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.*;

public class DrawImage2 extends JFrame
{
    Image img1, img2;// 展示的图片

    public DrawImage2()
    {
        try
        {
            img1=ImageIO.read(new File("src/chapter19/assets/img.jpg"));// 读取图片文件
            img2=ImageIO.read(new File("src/chapter19/assets/cow.jpg"));// 读取图片文件
        }catch(IOException e)
        {
            e.printStackTrace();
        }
        setSize(800,300); // 设置窗体大小
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 设置窗体关闭模式
        add(new CanvasPanel()); // 设置窗体面板为绘图面板对象
        setTitle("绘制图片"); // 设置窗体标题
    }

    class CanvasPanel extends JPanel
    {
        public void paint(Graphics g)
        {
            Graphics2D g2=(Graphics2D)g;
            g2.drawImage(img1,0,0,this); // 显示图片
            g2.drawImage(img2,450,0,this); // 显示图片
        }
    }

    public static void main(String[] args)
    {
        new DrawImage2().setVisible(true);
    }
}
