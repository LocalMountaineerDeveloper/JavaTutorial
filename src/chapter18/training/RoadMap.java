/*
* 全景地图：将十字路口4个方向的车况截图按2行2列显示在窗体中。0
* */

package chapter18.training;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class RoadMap extends JFrame
{ // 创建一个“路况图”类，并继承JFrame
    // 声明窗体中的组件
    private JPanel contentPane;

    /**
     * 主方法
     */
    public static void main(String[] args)
    {
        RoadMap frame=new RoadMap(); // 创建RoadMap对象
        frame.setVisible(true); // 使frame可视
    }

    /**
     * 创建JFrame窗体
     */
    public RoadMap()
    { // RoadMap的构造方法
        setResizable(false); // 不可改变窗体大小
        setTitle("十字路口四个方向的车况截图"); // 设置窗体题目
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 设置窗体关闭的方式
        setBounds(100,100,561,404); // 设置窗体大小
        /**
         * 创建JPanel面板contentPane置于JFrame窗体中，并设置面板的边距和布局
         */
        contentPane=new JPanel();
        contentPane.setBorder(new EmptyBorder(5,5,5,5));
        setContentPane(contentPane);
        contentPane.setLayout(new GridLayout(2,2,0,0));
        /**
         * 创建JPanel面板panelNorth置于面板contentPane中，并设置面板panelNorth的布局
         */
        JPanel panelNorth=new JPanel();
        contentPane.add(panelNorth);
        panelNorth.setLayout(new BorderLayout(0,0));
        /**
         * 创建标签labelNorth置于面板panelNorth的中间，并为标签添加图标
         */
        JLabel labelNorthImage=new JLabel("");
        labelNorthImage.setIcon(new ImageIcon("src/chapter18/assets/photo/1.png"));
        panelNorth.add(labelNorthImage,BorderLayout.CENTER);
        /**
         * 创建标签labelNImage置于面板panelNorth的南侧，设置标签labelNImage的text值与text在标签中的位置
         */
        JLabel labelNorthText=new JLabel("北侧路口");
        labelNorthText.setHorizontalAlignment(SwingConstants.CENTER);
        panelNorth.add(labelNorthText,BorderLayout.SOUTH);
        /**
         * 创建JPanel面板panelSouth置于面板contentPane中，并设置面板panelSouth的布局
         */
        JPanel panelSouth=new JPanel();
        contentPane.add(panelSouth);
        panelSouth.setLayout(new BorderLayout(0,0));
        /**
         * 创建标签labelSouth置于面板panelSouth的中间，并为标签添加图标
         */
        JLabel labelSouthImage=new JLabel("");
        labelSouthImage.setIcon(new ImageIcon("src/chapter18/assets/photo/2.png"));
        panelSouth.add(labelSouthImage,BorderLayout.CENTER);
        /**
         * 创建标签labelSImage置于面板panelSouth的南侧，设置标签labelSImage的text值与text在标签中的位置
         */
        JLabel labelSouthText=new JLabel("南侧路口");
        labelSouthText.setHorizontalAlignment(SwingConstants.CENTER);
        panelSouth.add(labelSouthText,BorderLayout.SOUTH);
        /**
         * 创建JPanel面板panelWest置于面板contentPane中，并设置面板panelWest的布局
         */
        JPanel panelWest=new JPanel();
        contentPane.add(panelWest);
        panelWest.setLayout(new BorderLayout(0,0));
        /**
         * 创建标签labelWest置于面板panelWest的中间，并为标签添加图标
         */
        JLabel labelWestImage=new JLabel("");
        labelWestImage.setIcon(new ImageIcon("src/chapter18/assets/photo/3.png"));
        panelWest.add(labelWestImage,BorderLayout.CENTER);
        /**
         * 创建标签labelWImage置于面板panelWest的南侧，设置标签labelWImage的text值与text在标签中的位置
         */
        JLabel labelWestText=new JLabel("西侧路口");
        labelWestText.setHorizontalAlignment(SwingConstants.CENTER);
        panelWest.add(labelWestText,BorderLayout.SOUTH);
        /**
         * 创建JPanel面板panelEast置于面板contentPane中，并设置面板panelEast的布局
         */
        JPanel panelEast=new JPanel();
        contentPane.add(panelEast);
        panelEast.setLayout(new BorderLayout(0,0));
        /**
         * 创建标签labelEast置于面板panelEast的中间，并为标签添加图标
         */
        JLabel labelEastImage=new JLabel("");
        labelEastImage.setIcon(new ImageIcon("src/chapter18/assets/photo/4.png"));
        panelEast.add(labelEastImage,BorderLayout.CENTER);
        /**
         * 创建标签labelEImage置于面板panelEast的南侧，设置标签labelEImage的text值与text在标签中的位置
         */
        JLabel labelEastText=new JLabel("东侧路口");
        labelEastText.setHorizontalAlignment(SwingConstants.CENTER);
        panelEast.add(labelEastText,BorderLayout.SOUTH);
    }
}
