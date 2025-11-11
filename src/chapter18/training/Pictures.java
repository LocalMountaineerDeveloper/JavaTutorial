/*
* 随机背景：运行窗体时，从3张图片中随机抽取一张作为窗体的背景。
* */

package chapter18.training;

import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Pictures extends JFrame
{ // 创建一个“图片”类，并继承JFrame

    private JPanel contentPane; // 声明一个JPanel面板contentPane

    /**
     * 主方法
     */
    public static void main(String[] args)
    {
        Pictures frame=new Pictures(); // 创建Pictures对象
        frame.setVisible(true); // 使frame可视
    }

    /**
     * 创建JFrame窗体
     */
    public Pictures()
    { // Pictures的构造方法
        setTitle("随机切换背景的窗体"); // 设置窗体题目
        setResizable(false); // 不可改变窗体大小
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 设置窗体关闭的方式
        setBounds(100,100,500,336); // 设置窗体大小
        /**
         * 创建JPanel面板contentPane置于JFrame窗体中，并设置面板的边距和布局(绝对布局)
         */
        contentPane=new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);
        /**
         * 创建标签lblBackground置于面板contentPane中，设置标签的大小以及向标签中添加图标
         */
        JLabel lblBackground=new JLabel("");
        Random random=new Random(); // 创建Random对象
        int num=random.nextInt(3); // 随机生成0-3（不包括3）中的整数
        switch(num)
        { // 多分支语句
            case 0: // 生成的随机数为“0”时
                lblBackground.setIcon(new ImageIcon("src/chapter18/assets/photo/1.png")); // 图标中添加图片“Birds.jpg”
                break;
            case 1: // 生成的随机数为“1”时
                lblBackground.setIcon(new ImageIcon("src/chapter18/assets/photo/2.png")); // 图标中添加图片“Snow.jpg”
                break;
            case 2: // 生成的随机数为“2”时
                lblBackground.setIcon(new ImageIcon("src/chapter18/assets/photo/3.png")); // 图标中添加图片“Trees.jpg”
                break;
        }
        lblBackground.setBounds(0,0,494,308);
        contentPane.add(lblBackground);
    }
}
