/*
 * 动态时钟：绘制一个时钟，秒针、分针和时针都会随着时间发生位置变化。
 * */

package chapter19.practice;

import javax.swing.*;
import java.awt.*;
import java.util.Calendar;

import static java.util.Calendar.*;

public class ClockPanel extends JPanel
{
    //3个指针的粗细
    private static final BasicStroke HOURS_POINT_WIDTH=new BasicStroke(4);
    private static final BasicStroke MINUTES_POINT_WIDTH=new BasicStroke(3);
    private static final BasicStroke SECONDS_POINT_WIDTH=new BasicStroke(2);
    ImageIcon background; //背景图片对象
    private int centerX; //中心坐标
    private int centerY;
    private final static int secondsLen=60; //秒指针长度
    private final static int minutesLen=55;
    private final static int hoursLen=36;

    public ClockPanel()
    {
        setToolTipText("小键盘+、-调整透明度，Ctrl+Shift+X退出"); //提示信息
        setOpaque(false);

        background=new ImageIcon("src/chapter19/assets/clock.jpg"); //加载背景图片
        int iconWidth=background.getIconWidth(); //获取图片宽
        centerX=iconWidth/2; //获取图片中间的水平坐标
        int iconHeight=background.getIconHeight();
        centerY=iconHeight/2;
        setPreferredSize(new Dimension(iconWidth,iconHeight));
    }

    @Override
    public void paint(Graphics g)
    {
        Graphics2D g2=(Graphics2D) g;
        g2.drawImage(background.getImage(),0,0,this); //绘制背景图片
        Calendar calendar=Calendar.getInstance(); //获取日历对象
        int millisecond=calendar.get(MILLISECOND); //获取毫秒值
        int seconds=calendar.get(SECOND);
        int minutes=calendar.get(MINUTE);
        int hours=calendar.get(HOUR);

        double secondsAngle=(60-seconds)*6-(millisecond/150); //秒针角度
        int minutesAngle=(60-minutes)*6;
        int hoursAngle=(12-hours)*360/12-(minutes/2);

        //计算秒针、分针、时针指向的坐标
        int secondsX=(int)(secondsLen*Math.sin(Math.toRadians(secondsAngle))); //秒针指向的X坐标
        int secondsY=(int)(secondsLen*Math.cos(Math.toRadians(secondsAngle)));
        int minutesX=(int)(minutesLen*Math.sin(Math.toRadians(minutesAngle)));
        int minutesY=(int)(minutesLen*Math.cos(Math.toRadians(minutesAngle)));
        int hoursX=(int)(hoursLen*Math.sin(Math.toRadians(hoursAngle)));
        int hoursY=(int)(hoursLen*Math.cos(Math.toRadians(hoursAngle)));

        g2.setStroke(HOURS_POINT_WIDTH); //设置时针的宽度
        g2.setColor(Color.BLACK); //设置指针的颜色
        g2.drawLine(centerX,centerY,centerX-hoursX,centerY-hoursY); //绘制时针
        g2.setStroke(MINUTES_POINT_WIDTH); //设置分针的宽度
        if(minutesAngle!=hoursAngle)
        { //分针、时针未重叠时颜色
            g2.setColor(new Color(0x2F2F2F));
        }else
        {
            g2.setColor(Color.GREEN);
        }
        g2.drawLine(centerX,centerY,centerX-minutesX,centerY-minutesY); //绘制分针
        g2.setStroke(SECONDS_POINT_WIDTH); //设置秒针的宽度
        if(secondsAngle!=hoursAngle && secondsAngle!=minutesAngle)
        { //秒针、分针、时针未重叠时颜色
            g2.setColor(Color.GREEN);
        }else
        {
            g2.setColor(Color.GREEN);
        }
        g2.drawLine(centerX,centerY,centerX-secondsX,centerY-secondsY);
        g2.drawLine(centerX+1,centerY+1,centerX-secondsX+1,centerY-secondsY+1);

        //绘制3个指针的中心圆
        g2.fillOval(centerX-5,centerY-5,10,10); //绘制中心圆
    }
}
