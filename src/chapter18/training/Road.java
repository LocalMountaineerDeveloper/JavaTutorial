/*
* 全景地图：使用键盘事件（↑↓←→键）分别查看十字路口的全景图。
* */

package chapter18.training;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Road extends JFrame
{ // 创建“街道”类继承JFrame
    // 声明窗体中的成员组件
    private JPanel contentPane;
    private JLabel mapLbl;
    private JLabel directionBtn;
    private JButton goBtn;

    /**
     * 主方法
     */
    public static void main(String[] args)
    {
        Road frame=new Road(); // 创建Road对象
        frame.setVisible(true); // 使frame可视
    }

    /**
     * 创建JFrame窗体
     */
    public Road()
    { // Road的构造方法
        setTitle("查看全景地图：↑：北；↓：南；←：西；→：东"); // 设置窗体题目
        setResizable(false); // 不可改变窗体宽高
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 设置窗体关闭的方式
        setBounds(300,150,499,409); // 设置窗体的位置和宽高
        /**
         * 创建JPanel面板contentPane置于JFrame窗体中，并设置面板的背景色、边距和布局
         */
        contentPane=new JPanel();
        contentPane.setBackground(Color.WHITE);
        contentPane.setBorder(new EmptyBorder(5,5,5,5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        /**
         * 创建标签label置于面板contentPane中，设置标签的位置、宽高以及图标（水平居中）
         */
        mapLbl=new JLabel("");
        mapLbl.setHorizontalAlignment(SwingConstants.CENTER);
        mapLbl.setIcon(new ImageIcon("src/chapter18/assets/photo/5.png"));
        mapLbl.setBounds(0,0,493,280);
        contentPane.add(mapLbl);
        /**
         * 创建按钮button置于面板contentPane中，设置按钮的位置、宽高以及按钮中字体的内容和样式
         */
        String directStr="路口北侧";// 记录方向
        goBtn=new JButton("进入全景模式");
        goBtn.addMouseListener(new MouseAdapter()
        { // 按钮添加鼠标事件的监听
            @Override
            public void mouseClicked(MouseEvent e)
            { // 按钮添加鼠标单击事件的监听
                goBtn.setText("已进入到全景模式"); // 重新设置按钮中的字体内容
                mapLbl.setIcon(new ImageIcon("src/chapter18/assets/photo/poker1.png")); // 设置标签label里的图标
                directionBtn.setHorizontalAlignment(SwingConstants.CENTER); // 设置标签label_1里的字体内容水平居中
                directionBtn.setText("当前位置："+directStr); // 设置标签label_1里的字体内容
            }
        });
        goBtn.addKeyListener(new KeyAdapter()
        { // 按钮键盘事件的监听
            @Override
            public void keyPressed(KeyEvent e)
            { // 按钮添加键盘被按下时的监听
                String directStr="路口北侧";
                switch(e.getKeyCode())
                { // 多分支语句（通过“getKeyCode()”，获得与按键相关联的整数）
                    case KeyEvent.VK_UP: // 方向键“上”
                        mapLbl.setIcon(new ImageIcon("src/chapter18/assets/photo/poker1.png")); // 设置标签label里的图标
                        directionBtn.setHorizontalAlignment(SwingConstants.CENTER); // 设置标签label_1里的字体内容水平居中
                        directStr="路口北侧"; // 设置标签label_1里的字体内容
                        break;
                    case KeyEvent.VK_DOWN: // 方向键“下”
                        mapLbl.setIcon(new ImageIcon("src/chapter18/assets/photo/2.png")); // 设置标签label里的图标
                        directionBtn.setHorizontalAlignment(SwingConstants.CENTER); // 设置标签label_1里的字体内容水平居中
                        directStr="路口南侧"; // 设置标签label_1里的字体内容
                        break;
                    case KeyEvent.VK_LEFT: // 方向键“左”
                        mapLbl.setIcon(new ImageIcon("src/chapter18/assets/photo/3.png")); // 设置标签label里的图标
                        directionBtn.setHorizontalAlignment(SwingConstants.CENTER); // 设置标签label_1里的字体内容水平居中
                        directStr="路口西侧"; // 设置标签label_1里的字体内容
                        break;
                    case KeyEvent.VK_RIGHT: // 方向键“右”
                        mapLbl.setIcon(new ImageIcon("src/chapter18/assets/photo/4.png")); // 设置标签label里的图标
                        directionBtn.setHorizontalAlignment(SwingConstants.CENTER); // 设置标签label_1里的字体内容水平居中
                        directStr="路口东侧"; // 设置标签label_1里的字体内容
                        break;
                }
                directionBtn.setText("当前位置："+directStr);
            }
        });
        goBtn.setFont(new Font("微软雅黑",Font.PLAIN,14));
        goBtn.setBounds(180,290,150,35);
        contentPane.add(goBtn);
        /**
         * 创建标签label_1置于面板contentPane中，设置标签的位置、宽高以及标签中字体的内容和样式
         */
        directionBtn=new JLabel("");
        directionBtn.setFont(new Font("微软雅黑",Font.PLAIN,14));
        directionBtn.setBounds(150,335,209,35);
        contentPane.add(directionBtn);
    }
}