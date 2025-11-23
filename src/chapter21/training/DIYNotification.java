/*
 * 自定义广播——发送端：发送端使用UPD协议向接收端发送自定义内容的广播。
 * */

package chapter21.training;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DIYNotification extends JFrame implements Runnable
{
    InetAddress inetAddress=null;
    MulticastSocket multicastSocket=null; // 多点广播套接字
    int port=9898;
    JLabel label, msgLabel;
    JTextField text;
    JButton btn;

    public DIYNotification()
    {
        try
        {
            inetAddress=InetAddress.getByName("224.255.10.0"); // 实例化InetAddress，指定地址
            multicastSocket=new MulticastSocket(port); // 实例化多点广播套接字
            multicastSocket.setTimeToLive(1); // 指定发送范围是本地网络
            multicastSocket.joinGroup(inetAddress); // 加入广播组
        }catch(IOException e)
        {
            e.printStackTrace(); // 输出异常信息
        }

        label=new JLabel("发送内容为：");
        msgLabel=new JLabel("测试信号");
        text=new JTextField(15);
        btn=new JButton("修改");

        btn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String message=text.getText().trim();
                msgLabel.setText(message);
                text.setText("");
            }
        });


        JPanel panel=new JPanel();
        panel.add(label);
        panel.add(msgLabel);
        panel.add(text);
        panel.add(btn);
        setTitle("自定义广播");
        add(panel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(200,200,300,150);
    }

    public void run()
    {
        while(true)
        {
            DatagramPacket packet=null; // 数据包
            String message=msgLabel.getText().trim();
            byte data[]=message.getBytes(); // 字符串消息的字节数组
            packet=new DatagramPacket(data,data.length,inetAddress,port); // 将数据打包
            try
            {
                multicastSocket.send(packet); // 发送数据
                Thread.sleep(1000); // 线程休眠
            }catch(IOException e)
            {
                e.printStackTrace();
            }catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args)
    {
        DIYNotification diy=new DIYNotification();
        diy.setVisible(true);
        Thread t=new Thread(diy);
        t.start(); // 启动线程
    }
}

