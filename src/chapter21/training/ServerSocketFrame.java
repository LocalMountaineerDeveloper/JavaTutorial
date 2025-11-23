/*
* 一对一聊天服务端程序：实现一个服务器与一个客户端之间的通信。
* */

package chapter21.training;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ServerSocketFrame extends JFrame
{
    private JTextField sendTextField;
    private JTextArea infoTextArea;
    private PrintWriter writer; // 声明PrintWriter类对象
    private BufferedReader reader; // 声明BufferedReader对象
    private ServerSocket serverSocket; // 声明ServerSocket对象
    private Socket socket; // 声明Socket对象socket

    public void getServer()
    {
        try
        {
            serverSocket=new ServerSocket(9898); // 实例化Socket对象
            infoTextArea.append("服务器套接字已经创建成功\n"); // 输出信息
            while(true)
            { // 如果套接字是连接状态
                infoTextArea.append("等待客户端的连接......\n"); // 输出信息
                socket=serverSocket.accept(); // 实例化Socket对象
                reader=new BufferedReader(new InputStreamReader(socket
                        .getInputStream())); // 实例化BufferedReader对象
                writer=new PrintWriter(socket.getOutputStream(),true);
                getClientInfo(); // 调用getClientInfo()方法
            }
        }catch(Exception e)
        {
            e.printStackTrace(); // 输出异常信息
        }
    }

    private void getClientInfo()
    {
        try
        {
            while(true)
            {
                String line=reader.readLine();// 读取客户端发送的信息
                if(line!=null)
                    infoTextArea.append("接收到客户端发送的信息："+line+"\n"); // 显示客户端发送的信息
            }
        }catch(Exception e)
        {
            infoTextArea.append("客户端已退出。\n"); // 输出异常信息
        }finally
        {
            try
            {
                if(reader!=null)
                {
                    reader.close();// 关闭流
                }
                if(socket!=null)
                {
                    socket.close(); // 关闭套接字
                }
            }catch(IOException e)
            {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args)
    { // 主方法
        ServerSocketFrame frame=new ServerSocketFrame(); // 创建本类对象
        frame.setVisible(true);
        frame.getServer(); // 调用方法
    }

    public ServerSocketFrame()
    {
        super();
        setTitle("服务端程序");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,379,260);

        final JScrollPane scrollPane=new JScrollPane();
        getContentPane().add(scrollPane,BorderLayout.CENTER);

        infoTextArea=new JTextArea();
        scrollPane.setViewportView(infoTextArea);

        final JPanel panel=new JPanel();
        getContentPane().add(panel,BorderLayout.SOUTH);

        final JLabel label=new JLabel();
        label.setText("服务器发送的信息：");
        panel.add(label);

        sendTextField=new JTextField();
        sendTextField.setPreferredSize(new Dimension(150,25));
        panel.add(sendTextField);

        final JButton button=new JButton();
        button.addActionListener(new ActionListener()
        {
            public void actionPerformed(final ActionEvent e)
            {
                writer.println(sendTextField.getText()); // 将文本框中信息写入流
                infoTextArea.append("服务器发送的信息是："+sendTextField.getText()+"\n"); // 将文本框中信息显示在文本域中
                sendTextField.setText(""); // 将文本框清空
            }
        });
        button.setText("发  送");
        panel.add(button);

        final JPanel panel_1=new JPanel();
        getContentPane().add(panel_1,BorderLayout.NORTH);

        final JLabel label_1=new JLabel();
        label_1.setForeground(new Color(0,0,255));
        label_1.setFont(new Font("",Font.BOLD,22));
        label_1.setText("一对一通信——服务端程序");
        panel_1.add(label_1);
    }
}

