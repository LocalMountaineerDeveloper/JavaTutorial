/*
* 照片浏览器
* */

package chapter19.training;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.*;

public class DrawImage extends JFrame
{
    BufferedImage img;// 展示的图片

    public DrawImage()
    {
        try
        {
            img=ImageIO.read(new File("src/chapter19/assets/image.jpg"));// 读取你的照片
        }catch(IOException e)
        {
            e.printStackTrace();
        }
        setSize(img.getWidth()+20,img.getHeight()+40); // 设置窗体大小
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 设置窗体关闭模式
        add(new CanvasPanel()); // 设置窗体面板为绘图面板对象
        setTitle("绘制图片"); // 设置窗体标题
    }

    class CanvasPanel extends JPanel
    {
        public void paint(Graphics g)
        {
            Graphics2D g2=(Graphics2D)g;
            g2.drawImage(img,0,0,this); // 显示图片
        }
    }

    public static void main(String[] args)
    {
        new DrawImage().setVisible(true);
    }
}
