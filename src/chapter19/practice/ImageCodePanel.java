/*
 * 绘制验证码：使用AWT相关技术，实现一个含有带背景图片的验证码的登录界面。
 * */

package chapter19.practice;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

//验证码面板
public class ImageCodePanel extends JPanel
{
    public static final int WIDTH=120;
    public static final int HEIGHT=35;
    private String num=""; //验证码
    Random random=new Random(); //实例化Random

    public ImageCodePanel()
    {
        this.setVisible(true); //显示面板
        setLayout(null); //绝对布局
    }

    public void paint(Graphics g)
    {
        BufferedImage image=new BufferedImage(WIDTH,HEIGHT,BufferedImage.TYPE_INT_RGB); //实例化BufferedImage
        Graphics gs=image.getGraphics(); //获取Graphics类对象
        if(!num.isEmpty())
        {
            num=""; //清空验证码
        }
        Font font=new Font("黑体",Font.BOLD,20); //通过Font构造字体
        gs.setFont(font); //设置字体
        gs.fillRect(0,0,WIDTH,HEIGHT); //填充一个矩形

        Image img=null;
        try
        {
            img=ImageIO.read(new File("src/chapter19/assets/image2.jpg")); //创建图像对象
        }catch(IOException e)
        {
            e.printStackTrace();
        }
        image.getGraphics().drawImage(img,0,0,WIDTH,HEIGHT,null); //在缓冲图像对象上绘制图像

        for(int i=0;i<4;++i)
        { //输出随机的验证文字
            char ctmp=(char)(random.nextInt(26)+65); //生成A~Z的字母
            num+=ctmp; //更新验证码
            //生成随机颜色
            Color color=new Color(20+random.nextInt(120),20+random.nextInt(120),20+random.nextInt(120));
            gs.setColor(color);
            Graphics2D gs2d=(Graphics2D)gs;
            AffineTransform trans=new AffineTransform(); //实例化AffineTransform
            trans.rotate(random.nextInt(45)*Math.PI/180,22*i+8,7); //将文字旋转角度
            float scaleSize=random.nextFloat()+0.8f; //缩放文字
            if(scaleSize>1f)
            { //若缩放尺寸大于1，则令其等于1
                scaleSize=1f;
            }
            trans.scale(scaleSize,scaleSize); //进行缩放
            gs2d.setTransform(trans);
            gs.drawString(String.valueOf(ctmp),WIDTH/6*i+28,HEIGHT/2); //画出验证码
        }
        g.drawImage(image,0,0,null); //在画板中画出验证码
    }

    public void draw()
    { //生成验证码的方法
        repaint(); //重绘调用paint()方法
    }

    public String getNum()
    {
        return num; //返回验证码
    }
}
