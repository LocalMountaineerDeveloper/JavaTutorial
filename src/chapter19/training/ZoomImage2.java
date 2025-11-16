/*
* 使用按钮缩放图片
* */

package chapter19.training;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ZoomImage2 extends JFrame
{
    private int imgWidth, imgHeight;                        // 定义图像的宽和高
    private double num;                                    // 图片变化增量
    private JPanel jPanImg=null;                        // 显示图像的面板
    private JPanel jPanBtn=null;                        // 显示控制按钮的面板
    private JButton jBtnBig=null;                        // 放大按钮
    private JButton jBtnSmall=null;                        // 缩小按钮
    private CanvasTest canvas=null;                        // 绘图面板

    public ZoomImage2()
    {
        initialize();                                    // 调用初始化方法
    }

    private void initialize()
    {                            // 界面初始化方法
        this.setBounds(100,100,500,420);                // 设置窗体大小和位置
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // 设置窗体关闭模式
        this.setTitle("图像缩放");                            // 设置窗体标题
        jPanImg=new JPanel();                            // 主容器面板
        canvas=new CanvasTest();                        // 获取画布
        jPanImg.setLayout(new BorderLayout());                // 主容器面板
        jPanImg.add(canvas,BorderLayout.CENTER);            // 将画布放到面板中央
        setContentPane(jPanImg);                            // 将主容器面板作为窗体容器
        jBtnBig=new JButton("放大(+)");                    // 放大按钮
        jBtnBig.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent e)
            {
                num+=20;                        // 设置正整数增量，每次点击图片宽高加20
                canvas.repaint();                // 重绘放大的图像
            }
        });
        jBtnSmall=new JButton("缩小(-)");        // 缩小按钮
        jBtnSmall.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent e)
            {
                num-=20;                        // 设置负整数增量，每次点击图片宽高减20
                canvas.repaint();                // 重绘缩小的图像
            }
        });
        jPanBtn=new JPanel();                    // 按钮面板
        jPanBtn.setLayout(new FlowLayout());        // 采用刘布局
        jPanBtn.add(jBtnBig);                        // 添加按钮
        jPanBtn.add(jBtnSmall);                    // 添加按钮
        jPanImg.add(jPanBtn,BorderLayout.SOUTH);    // 放到容器底部
    }

    public static void main(String[] args)
    {        // 主方法
        new ZoomImage2().setVisible(true);            // 创建主类对象并显示窗体
    }

    class CanvasTest extends Canvas
    {                // 创建画布
        public void paint(Graphics g)
        {            // 重写paint方法，用来重绘图像
            Image img=null;

            try
            {
                img=ImageIO.read(new File("src/chapter19/assets/img.jpg"));// 读取图片文件
            }catch(IOException e)
            {
                e.printStackTrace();
            }
            imgWidth=img.getWidth(this);        // 获取图像宽度
            imgHeight=img.getHeight(this);        // 获取图像高度
            int newW=(int)(imgWidth+num);    // 计算图像放大后的宽度
            int newH=(int)(imgHeight+num);    // 计算图像放大后的高度
            g.drawImage(img,0,0,newW,newH,this);                // 绘制指定大小的图像
        }
    }
}
