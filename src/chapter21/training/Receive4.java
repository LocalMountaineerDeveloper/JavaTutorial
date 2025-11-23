/*
* 自定义广播——接收端：发送端使用UPD协议向接收端发送自定义内容的广播。
* */

package chapter21.training;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.*;
import javax.swing.*;

public class Receive4 extends JFrame implements Runnable, ActionListener
{
    int port; // 端口
    InetAddress group=null; // 广播组地址
    MulticastSocket multicastSocket=null; // 多点广播套接字对象
    JButton startBtn=new JButton("开始接收");
    JButton stopBtn=new JButton("停止接收");
    JTextArea curTextArea=new JTextArea(10,10); // 显示接收广播的文本域
    JTextArea allTextArea=new JTextArea(10,10);
    Thread thread;
    boolean stop=false; // 停止接受信息状态

    public Receive4()
    {
        setTitle("广播数据报");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        thread=new Thread(this);
        startBtn.addActionListener(this); // 绑定按钮ince的单击事件
        stopBtn.addActionListener(this); // 绑定按钮stop的单击事件
        curTextArea.setForeground(Color.blue); // 指定文本域中文字的颜色
        JPanel north=new JPanel(); // 创建Jpanel对象
        north.add(startBtn); // 将按钮添加到面板north上
        north.add(stopBtn);
        add(north,BorderLayout.NORTH); // 将north放置在窗体的上部
        JPanel center=new JPanel(); // 创建面板对象center
        center.setLayout(new GridLayout(1,2)); // 设置面板布局
        center.add(curTextArea); // 将文本域添加到面板上
        center.add(allTextArea);
        add(center,BorderLayout.CENTER); // 设置面板布局
        validate(); // 刷新
        port=9898; // 设置端口号
        try
        {
            group=InetAddress.getByName("224.255.10.0"); // 指定接收地址
            multicastSocket=new MulticastSocket(port); // 绑定多点广播套接字
            multicastSocket.joinGroup(group); // 加入广播组
        }catch(IOException e)
        {
            e.printStackTrace(); // 输出异常信息
        }
        setBounds(100,50,360,380); // 设置布局
        setVisible(true); // 将窗体设置为显示状态
    }

    public void run()
    { // run()方法
        while(!stop)
        {
            byte data[]=new byte[1024]; // 创建缓存字节数组
            DatagramPacket packet=null;
            packet=new DatagramPacket(data,data.length,group,port); // 待接收的数据包
            try
            {
                multicastSocket.receive(packet); // 接收数据包
                String message=new String(packet.getData(),0,packet.getLength()); // 获取数据包中的内容
                curTextArea.setText("正在接收的内容：\n"+message); // 将接收内容显示在文本域中
                allTextArea.append(message+"\n"); // 每条信息为一行
            }catch(IOException e)
            {
                e.printStackTrace(); // 输出异常信息
            }
        }
    }

    public void actionPerformed(ActionEvent e)
    { // 单击事件
        if(e.getSource()==startBtn)
        { // 单击按钮ince触发的事件
            startBtn.setBackground(Color.red); // 设置按钮颜色
            stopBtn.setBackground(Color.yellow);
            if(!(thread.isAlive()))
            { // 如线程不处于“新建状态”
                thread=new Thread(this); // 实例化Thread对象
            }
            thread.start(); // 启动线程
            stop=false; // 开始接受信息
        }
        if(e.getSource()==stopBtn)
        { // 单击按钮stop触发的事件
            startBtn.setBackground(Color.yellow); // 设置按钮颜色
            stopBtn.setBackground(Color.red);
            stop=true; // 停止接受信息
        }
    }

    public static void main(String[] args)
    {
        Receive4 rec=new Receive4();
        rec.setSize(460,200);
    }
}
