/*
* 绘制验证码：使用AWT相关技术，实现一个含有带背景图片的验证码的登录界面。
* */

package chapter19.practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame
{
    private JTextField codeText;
    private JPasswordField pwdText;
    private JTextField nameText;
    ImageCodePanel imageCodePanel=null;

    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                try
                {
                    MainFrame frame=new MainFrame();
                    frame.setVisible(true);
                }catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
        });
    }

    public MainFrame()
    {
        super();
        setResizable(false);
        setTitle("图片验证码");
        setBounds(100,100,426,210);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        imageCodePanel=new ImageCodePanel(); //创建类的实例
        imageCodePanel.setBounds(170,85,106,35); //设置位置
        getContentPane().add(imageCodePanel); //添加验证码面板

        final JPanel panel=new JPanel();
        panel.setLayout(null);
        getContentPane().add(panel,BorderLayout.CENTER);

        final JButton button=new JButton();
        button.addActionListener(new ActionListener()
        {
            public void actionPerformed(final ActionEvent e)
            {
                if(imageCodePanel!=null)
                {
                    imageCodePanel.draw(); //调用方法生成验证码
                }
            }
        });

        button.setText("换一张");
        button.setBounds(301,90,94,20);
        panel.add(button);

        final JLabel label=new JLabel();
        label.setText("用户名：");
        label.setBounds(29,25,66,18);
        panel.add(label);

        final JLabel label_1=new JLabel();
        label_1.setText("密 码：");
        label_1.setBounds(29,59,66,18);
        panel.add(label_1);

        nameText=new JTextField();
        nameText.setBounds(85,23,310,22);
        panel.add(nameText);

        pwdText=new JPasswordField();
        pwdText.setBounds(85,57,310,22);
        panel.add(pwdText);

        final JLabel label_2=new JLabel();
        label_2.setText("验证码：");
        label_2.setBounds(29,95,66,18);
        panel.add(label_2);

        codeText=new JTextField();
        codeText.setBounds(85,93,77,22);
        panel.add(codeText);

        final JButton button_1=new JButton();
        button_1.addActionListener(new ActionListener()
        {
            public void actionPerformed(final ActionEvent e)
            {
                String username=nameText.getText(); //从文本框获取用户名
                String password=new String(pwdText.getPassword()); //从密码框中获取密码
                String code=codeText.getText(); //获取输入的验证码
                String info=""; //用户登录信息
                if(username==null || username.isEmpty())
                {
                    info="用户名为空！";
                }else if(password==null || password.isEmpty())
                {
                    info="密码为空！";
                }else if(code==null || code.isEmpty())
                {
                    info="验证码为空！";
                }else if(!code.equals(imageCodePanel.getNum()))
                {
                    info="验证码错误！";
                }else if(username.equals("mrsoft") && password.equals("mrsoft") && code.equals(imageCodePanel.getNum()))
                {
                    info="登入成功！";
                }else
                {
                    info="用户名或密码错误！";
                }
                JOptionPane.showMessageDialog(null,info); //通过对话框弹出信息
            }
        });
        button_1.setText("登 入");
        button_1.setBounds(42,134,106,28);
        panel.add(button_1);

        final JButton button_2=new JButton();
        button_2.addActionListener(new ActionListener()
        {
            public void actionPerformed(final ActionEvent e)
            { //清除各个文本框内容
                nameText.setText("");
                pwdText.setText("");
                codeText.setText("");
            }
        });
        button_2.setText("重 置");
        button_2.setBounds(191,134,106,28);
        panel.add(button_2);
    }
}
