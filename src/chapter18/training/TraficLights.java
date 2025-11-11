/*
* 模拟交通信号灯：使用图标和单选按钮模拟交通红绿灯，绿灯对应的单选按钮被默认选中。
* */

package chapter18.training;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;

public class TraficLights extends JFrame
{ // 创建一个“交通灯”类，并继承JFrame
    // 声明窗体中的组件
    private JPanel contentPane;
    private JLabel lblImage;

    /**
     * 主方法
     */
    public static void main(String[] args)
    {
        TraficLights frame=new TraficLights(); // 创建TraficLights对象
        frame.setVisible(true); // 使frame可视
    }

    /**
     * 创建JFrame窗体
     */
    public TraficLights()
    { // TraficLights的构造方法
        setResizable(false); // 设置窗体不可改变大小
        setTitle("交通灯"); // 设置窗体题目
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 设置窗体关闭的方式
        setBounds(100,100,220,300); // 设置窗体大小
        /**
         * 创建JPanel面板contentPane置于JFrame窗体中，并设置面板的背景色、边距和布局
         */
        contentPane=new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(new GridLayout(1,0,0,0));
        /**
         * 创建面板panel置于l面板contentPane中，设置面板panel的背景色、TitledBorder、布局（边界布局）
         */
        JPanel panel=new JPanel();
        panel.setBackground(Color.WHITE);
        panel.setBorder(new TitledBorder(null,"交通灯",TitledBorder.LEADING,TitledBorder.TOP,null,null));
        contentPane.add(panel);
        panel.setLayout(new BorderLayout(0,0));
        /**
         * 创建标签lblImage置于面板panel中的中间，设置标签的背景色、图标
         */
        lblImage=new JLabel("");
        lblImage.setBackground(Color.WHITE);
        lblImage.setIcon(new ImageIcon("src/chapter18/assets/photo/green.png"));
        panel.add(lblImage,BorderLayout.CENTER);
        /**
         * 创建面板panel_1置于l面板contentPane中，设置面板panel_1的TitledBorder、布局（绝对布局）
         */
        JPanel panel_1=new JPanel();
        panel_1.setBorder(new TitledBorder(null,"交通灯的颜色",TitledBorder.LEADING,TitledBorder.TOP,null,null));
        contentPane.add(panel_1);
        panel_1.setLayout(null);
        /**
         * 创建单选按钮rbtnRed置于面板panel_1中，设置单选按钮的text值、大小
         */
        JRadioButton rbtnRed=new JRadioButton("红灯");
        rbtnRed.addActionListener(new ActionListener()
        { // 添加动作监听的事件
            @Override
            public void actionPerformed(ActionEvent e)
            { // 发生操作时
                lblImage.setIcon(new ImageIcon("src/chapter18/assets/photo/red.png")); // 标签中添加图片
            }
        });
        rbtnRed.setBounds(20,51,60,20);
        panel_1.add(rbtnRed);
        /**
         * 创建单选按钮rbtnYellow置于面板panel_1中，设置单选按钮的text值、大小
         */
        JRadioButton rbtnYellow=new JRadioButton("黄灯");
        rbtnYellow.addActionListener(new ActionListener()
        { // 添加动作监听的事件
            @Override
            public void actionPerformed(ActionEvent e)
            { // 发生操作时
                lblImage.setIcon(new ImageIcon("src/chapter18/assets/photo/yellow.png")); // 标签中添加图片
            }
        });
        rbtnYellow.setBounds(20,117,60,20);
        panel_1.add(rbtnYellow);
        /**
         * 创建单选按钮rbtnGreen置于面板panel_1中，设置单选按钮的text值、大小
         */
        JRadioButton rbtnGreen=new JRadioButton("绿灯");
        rbtnGreen.setSelected(true); // 设置按钮radioButton_2为默认的单选按钮
        rbtnGreen.addActionListener(new ActionListener()
        { // 添加动作监听的事件
            @Override
            public void actionPerformed(ActionEvent e)
            { // 发生操作时
                lblImage.setIcon(new ImageIcon("src/chapter18/assets/photo/green.png")); // 标签中添加图片
            }
        });
        rbtnGreen.setBounds(20,182,60,20);
        panel_1.add(rbtnGreen);
        /**
         * 创建ButtonGroup对象group，把单选按钮rbtnRed、rbtnYellow、rbtnGreen放进group中
         */
        ButtonGroup group=new ButtonGroup();
        group.add(rbtnRed);
        group.add(rbtnYellow);
        group.add(rbtnGreen);
    }
}
