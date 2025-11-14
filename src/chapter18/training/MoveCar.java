/*
* 移动图标：创建“前进”、“后退”、“上移”、“下移”按钮，单击后可以让汽车图标在窗体中的位置发生变化。
* */

package chapter18.training;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MoveCar extends JFrame
{ // 创建一个“挪车”类，并继承JFrame
    // 声明窗体中的组件
    private JPanel contentPane;
    private JLabel carImageLbl;

    /**
     * 主方法
     */
    public static void main(String[] args)
    {
        MoveCar frame=new MoveCar(); // 创建MoveCar对象
        frame.setVisible(true); // 使frame可视
    }

    /**
     * 创建JFrame窗体
     */
    public MoveCar()
    { // MoveCar的构造方法
        setResizable(false); // 设置窗体不可改变大小
        setTitle("让汽车动起来"); // 设置窗体题目
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 设置窗体关闭的方式
        setBounds(100,100,590,300); // 设置窗体大小
        /**
         * 创建JPanel面板contentPane置于JFrame窗体中，并设置面板的背景色、边距和布局
         */
        contentPane=new JPanel();
        contentPane.setBackground(Color.WHITE);
        contentPane.setBorder(new EmptyBorder(5,5,5,5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        /**
         * 创建按钮frontBtn置于面板contentPane中，设置按钮的大小、按钮中的字体内容和样式
         */
        JButton frontBtn=new JButton("前　进");
        frontBtn.addActionListener(new ActionListener()
        { // 添加动作监听的事件
            @Override
            public void actionPerformed(ActionEvent e)
            { // 发生操作时
                carImageLbl.setHorizontalAlignment(SwingConstants.TRAILING); // 是标签中的图标移动到尾部
            }
        });
        frontBtn.setFont(new Font("幼圆",Font.PLAIN,14));
        frontBtn.setBounds(10,229,108,23);
        contentPane.add(frontBtn);
        /**
         * 创建按钮backBtn置于面板contentPane中，设置按钮的大小、按钮中的字体内容和样式
         */
        JButton backBtn=new JButton("后　退");
        backBtn.addActionListener(new ActionListener()
        { // 添加动作监听的事件
            @Override
            public void actionPerformed(ActionEvent e)
            { // 发生操作时
                carImageLbl.setHorizontalAlignment(SwingConstants.LEADING); // 是标签中的图标移动到首部
            }
        });
        backBtn.setFont(new Font("幼圆",Font.PLAIN,14));
        backBtn.setBounds(165,229,108,23);
        contentPane.add(backBtn);
        /**
         * 创建标签carImageLbl置于面板contentPane中，设置标签大小、图标以及图标的位置
         */
        carImageLbl=new JLabel("");
        carImageLbl.setHorizontalAlignment(SwingConstants.LEFT);
        carImageLbl.setIcon(new ImageIcon("src/chapter18/assets/photo/car.png"));
        carImageLbl.setBounds(10,10,564,209);
        contentPane.add(carImageLbl);
        /**
         * 创建按钮upBtn置于面板contentPane中，设置按钮的大小、按钮中的字体内容和样式
         */
        JButton upBtn=new JButton("上　移");
        upBtn.addActionListener(new ActionListener()
        { // 添加动作监听的事件
            @Override
            public void actionPerformed(ActionEvent e)
            { // 发生操作时
                carImageLbl.setVerticalAlignment(SwingConstants.TOP); // 是标签中的图标移动到上部
            }
        });
        upBtn.setFont(new Font("幼圆",Font.PLAIN,14));
        upBtn.setBounds(318,229,108,23);
        contentPane.add(upBtn);
        /**
         * 创建按钮downBtn置于面板contentPane中，设置按钮的大小、按钮中的字体内容和样式
         */
        JButton downBtn=new JButton("下　移");
        downBtn.addActionListener(new ActionListener()
        { // 添加动作监听的事件
            @Override
            public void actionPerformed(ActionEvent e)
            { // 发生操作时
                carImageLbl.setVerticalAlignment(SwingConstants.BOTTOM); // 是标签中的图标移动到底部
            }
        });
        downBtn.setFont(new Font("幼圆",Font.PLAIN,14));
        downBtn.setBounds(466,229,108,23);
        contentPane.add(downBtn);
    }
}
