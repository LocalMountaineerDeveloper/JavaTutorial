/*
* 动态时钟：绘制一个时钟，秒针、分针和时针都会随着时间发生位置变化。
* */

package chapter19.practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ClockFrame extends JDialog
{
    private float opqua=0.7f;
    private ClockPanel clockPanel;
    private Point fp; //拖曳窗体之前的鼠标位置

    public ClockFrame()
    {
        super();
        setUndecorated(true); //取消窗体修饰
        setAlwaysOnTop(true); //窗体置顶
        setTitle("石英钟");
        getContentPane().setLayout(new BorderLayout());
        setBounds(100,30,217,257);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        clockPanel=new ClockPanel(); //创建时钟面板
        getContentPane().add(clockPanel);

        clockPanel.addMouseListener(new MouseAdapter()
        { //为时钟面板添加鼠标按键事件监听器
            public void mousePressed(final MouseEvent e)
            {
                fp=e.getPoint();
                if(e.getButton()==MouseEvent.BUTTON3)
                { //鼠标右键退出
                    System.exit(0);
                }
            }
        });

        clockPanel.addMouseMotionListener(new MouseMotionAdapter()
        { //在时钟面板的鼠标拖曳事件中移动窗体
            public void mouseDragged(final MouseEvent e)
            {
                JDialog frame=(JDialog) getRootPane().getParent();
                Point point=e.getLocationOnScreen();
                frame.setLocation(point.x-fp.x,point.y-fp.y);
            }
        });
        pack();

        addKeyListener(new KeyAdapter()
        { //为窗体添加键盘事件监听器
            public void keyPressed(final KeyEvent e)
            {
                int code=e.getKeyCode();
                switch(code)
                { //判断按键编码
                    case KeyEvent.VK_ADD: //+符号按键会降低透明度
                        opqua+=0.05;
                        opqua=opqua>0.95f ? 1f : opqua;
                        break;
                    case KeyEvent.VK_SUBTRACT: //-符号按键会提升透明度
                        opqua-=0.05;
                        opqua=opqua<0.1f ? 1f : opqua;
                        break;
                }
                if(code==KeyEvent.VK_X && e.getModifiersEx()==(KeyEvent.CTRL_DOWN_MASK | KeyEvent.SHIFT_DOWN_MASK))
                { //如果按Ctrl+Shift+X组合键，将退出程序
                    System.exit(0);
                }
            }
        });

        Dimension screenSize=getToolkit().getScreenSize();
        double width=screenSize.getWidth();
        int x=(int)(width-getWidth()-30);
        setLocation(x,30);

        new Thread()
        { //创建线程对象，更新时钟面板界面
            @Override
            public void run()
            {
                try
                {
                    while(true)
                    {
                        sleep(100);
                        clockPanel.repaint();
                    }
                }catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        }.start();
    }

    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                try
                {
                    ClockFrame frame=new ClockFrame();
                    frame.setVisible(true);
                }catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
        });
    }
}
