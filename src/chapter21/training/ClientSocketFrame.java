/*
* 一对一聊天客户端程序：实现一个服务器与一个客户端之间的通信。
* */

package chapter21.training;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ClientSocketFrame extends JFrame
{
    private PrintWriter writer; // 声明PrintWriter类对象
    private BufferedReader reader; // 声明BufferedReader对象
    private Socket socket; // 声明Socket对象
    private JTextArea infoTextArea; // 创建JtextArea对象
    private JTextField sendTextField; // 创建JtextField对象

    private void connect()
    { // 连接套接字方法
        infoTextArea.append("尝试连接......\n"); // 文本域中信息信息
        try
        { // 捕捉异常
            socket=new Socket("192.168.0.100",9898); // 实例化Socket对象
            while(true)
            {
                writer=new PrintWriter(socket.getOutputStream(),true);
                reader=new BufferedReader(new InputStreamReader(socket
                        .getInputStream())); // 实例化BufferedReader对象
                infoTextArea.append("完成连接。\n"); // 文本域中提示信息
                getServerInfo();
            }
        }catch(Exception e)
        {
            e.printStackTrace(); // 输出异常信息
        }
    }

    public static void main(String[] args)
    { // 主方法
        ClientSocketFrame client=new ClientSocketFrame(); // 创建本例对象
        client.setVisible(true); // 将窗体显示
        client.connect(); // 调用连接方法
    }

    private void getServerInfo()
    {
        try
        {
            while(true)
            {
                if(reader!=null)
                {
                    String line=reader.readLine();// 读取服务器发送的信息
                    if(line!=null)
                        infoTextArea.append("接收到服务器发送的信息："+line+"\n"); // 显示服务端发送的信息
                }
            }
        }catch(Exception e)
        {
            e.printStackTrace();
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

    /**
     * Create the frame
     */
    public ClientSocketFrame()
    {
        super();
        setTitle("客户端程序");
        setBounds(100,100,361,257);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        final JPanel panel=new JPanel();
        getContentPane().add(panel,BorderLayout.NORTH);

        final JLabel label=new JLabel();
        label.setForeground(new Color(0,0,255));
        label.setFont(new Font("",Font.BOLD,22));
        label.setText("一对一通信——客户端程序");
        panel.add(label);

        final JPanel panel_1=new JPanel();
        getContentPane().add(panel_1,BorderLayout.SOUTH);

        final JLabel label_1=new JLabel();
        label_1.setText("客户端发送的信息：");
        panel_1.add(label_1);

        sendTextField=new JTextField();
        sendTextField.setPreferredSize(new Dimension(140,25));
        panel_1.add(sendTextField);

        final JButton button=new JButton();
        button.addActionListener(new ActionListener()
        {
            public void actionPerformed(final ActionEvent e)
            {
                writer.println(sendTextField.getText()); // 将文本框中信息写入流
                infoTextArea.append("客户端发送的信息是："+sendTextField.getText()
                        +"\n"); // 将文本框中信息显示在文本域中
                sendTextField.setText(""); // 将文本框清空
            }
        });
        button.setText("发  送");
        panel_1.add(button);

        final JScrollPane scrollPane=new JScrollPane();
        getContentPane().add(scrollPane,BorderLayout.CENTER);

        infoTextArea=new JTextArea();
        scrollPane.setViewportView(infoTextArea);
        //
    }
}