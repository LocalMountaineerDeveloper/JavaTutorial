/*
 * 时间广播器发送端：使用UDP协议向所有接收端发送广播，内容为当前时间。
 * */

package chapter21.training;

import java.io.IOException;
import java.net.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeNotification extends Thread
{
    InetAddress inetAress=null;
    MulticastSocket multicastSocket=null; // 多点广播套接字
    int port=9898;

    TimeNotification()
    {
        try
        {
            inetAress=InetAddress.getByName("224.255.10.0"); // 实例化InetAddress，指定地址
            multicastSocket=new MulticastSocket(port); // 实例化多点广播套接字
            multicastSocket.setTimeToLive(1); // 指定发送范围是本地网络
            multicastSocket.joinGroup(inetAress); // 加入广播组
        }catch(IOException e)
        {
            e.printStackTrace(); // 输出异常信息
        }
    }

    public void run()
    {
        while(true)
        {
            DatagramPacket packet=null; // 数据包
            String message=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
            byte data[]=message.getBytes(); // 字符串消息的字节数组
            packet=new DatagramPacket(data,data.length,inetAress,port); // 将数据打包
            System.out.println(message); // 控制台打印消息
            try
            {
                multicastSocket.send(packet); // 发送数据
                sleep(1000); // 线程休眠
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
        TimeNotification timeNotification=new TimeNotification();
        timeNotification.start(); // 启动线程
    }
}
