/*
* 窗体抖动
* */

package chapter18.practice;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ZoomFrameContent extends JFrame
{
    private JPanel contentPane;

    //Launch the application.
    public static void main(String[] args)
    {
        ZoomFrameContent frame=new ZoomFrameContent();
        frame.setVisible(true);
    }

    //Create the frame.
    public ZoomFrameContent()
    {
        setTitle("窗口抖动");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,450,300);
        contentPane=new JPanel();
        contentPane.setBorder(new EmptyBorder(5,5,5,5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton button=new JButton("窗口抖动");
        button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                do_button_actionPerformed(e);
            }
        });
        button.setBounds(168,107,90,30);
        contentPane.add(button);
    }

    protected void do_button_actionPerformed(ActionEvent e)
    {
        int num=15;
        Point point=getLocation(); //窗体位置
        for(int i=30;i>0;--i)
        { //抖动剧烈程度
            for(int j=num;j>0;--j)
            { //抖动次数
                point.y+=i;
                setLocation(point); //窗体向下移动
                point.x+=i;
                setLocation(point); //窗体向右移动
                point.y-=i;
                setLocation(point);
                point.x-=i;
                setLocation(point);
            }
        }
    }
}
