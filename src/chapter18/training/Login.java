/*
 * 仿QQ登录窗口：当用户名为“mr”，密码为“mrsoft”时，登入会弹出登入成功对话框。
 * */

package chapter18.training;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JPasswordField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.util.Arrays;

public class Login extends JFrame
{ // 创建一个“登录”类，并继承JFrame
    // 声明窗体中的组件
    private JPanel contentPane;
    private JTextField nameField;
    private JPasswordField pwdField;
    private JLabel bannerLbl;
    private char[] pwd={'m','r','s','o','f','t'};

    /**
     * 主方法
     */
    public static void main(String[] args)
    {
        Login frame=new Login(); // 创建Login对象
        frame.setVisible(true); // 使frame可视
    }

    /**
     * 创建JFrame窗体
     */
    public Login()
    { // Login的构造方法
        setResizable(false); // 不可改变窗体大小
        setTitle("仿QQ登录窗口"); // 设置窗体题目
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 设置窗体关闭的方式
        setBounds(100,100,406,289); // 设置窗体大小
        /**
         * 创建JPanel面板contentPane置于JFrame窗体中，并设置面板的边距和布局
         */
        contentPane=new JPanel();
        contentPane.setBackground(Color.WHITE);
        contentPane.setBorder(new EmptyBorder(5,5,5,5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        /**
         * 创建标签nameLbl置于面板contentPane中，设置标签的大小以及标签中字体的内容、样式
         */
        JLabel nameLbl=new JLabel("用户名：");
        nameLbl.setFont(new Font("幼圆",Font.PLAIN,16));
        nameLbl.setBounds(115,144,64,18);
        contentPane.add(nameLbl);
        /**
         * 创建文本框nameField置于面板contentPane中，设置文本框的大小
         */
        nameField=new JTextField();
        nameField.setBounds(180,143,156,21);
        contentPane.add(nameField);
        nameField.setColumns(10);
        /**
         * 创建标签pwdLbl置于面板contentPane中，设置标签的大小以及标签中字体的内容、样式
         */
        JLabel pwdLbl=new JLabel("密码：");
        pwdLbl.setHorizontalAlignment(SwingConstants.RIGHT);
        pwdLbl.setFont(new Font("幼圆",Font.PLAIN,16));
        pwdLbl.setBounds(125,175,54,15);
        contentPane.add(pwdLbl);
        /**
         * 创建按钮loginBtn置于面板contentPane中，设置按钮的大小以及按钮中字体的内容、样式
         */
        JButton loginBtn=new JButton("登　入");
        loginBtn.addActionListener(new ActionListener()
        { // 添加动作监听的事件
            @Override
            public void actionPerformed(ActionEvent e)
            { // 发生操作时
                if(nameField.getText().equals("mr") &&
                        Arrays.equals(pwdField.getPassword(),pwd))
                { // “登陆成功”的条件
                    JOptionPane.showMessageDialog(null,"登入成功！","Success",JOptionPane.INFORMATION_MESSAGE); // 弹出框：“登陆成功！”
                }else if(nameField.getText().equals("") || Arrays.equals(pwdField.getPassword(),new char[]{}) || nameField==null || pwdField==null)
                { // 文本框为空时
                    JOptionPane.showMessageDialog(null,"用户名或密码不能为空！","Error",JOptionPane.ERROR_MESSAGE); // 弹出框：“用户名或密码不能为空！”
                }else
                { // 以上条件都不满足的时候
                    JOptionPane.showMessageDialog(null,"用户名或密码错误！","Error",JOptionPane.ERROR_MESSAGE); // 弹出框：“用户名或密码错误！”
                }
            }
        });
        loginBtn.setFont(new Font("幼圆",Font.PLAIN,16));
        loginBtn.setBounds(125,216,156,23);
        contentPane.add(loginBtn);
        /**
         * 创建密码框置于面板contentPane中，设置密码框的大小
         */
        pwdField=new JPasswordField();
        pwdField.setBounds(180,172,156,21);
        contentPane.add(pwdField);
        /**
         * 创建标签bannerLbl置于面板contentPane中，设置标签的大小并向标签中添加图标
         */
        bannerLbl=new JLabel("");
        bannerLbl.setIcon(new ImageIcon("src/chapter18/assets/photo/QQlogin.png"));
        bannerLbl.setBounds(0,0,400,129);
        contentPane.add(bannerLbl);
        /**
         * 创建标签iconLbl置于面板contentPane中，设置标签的大小并向标签中添加图标
         */
        JLabel iconLbl=new JLabel("");
        iconLbl.setIcon(new ImageIcon("src/chapter18/assets/photo/Photo.jpg"));
        iconLbl.setBounds(56,140,55,55);
        contentPane.add(iconLbl);
    }
}
