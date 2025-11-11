/*
* 图像浏览器：使用滚动面板实现通过滚动条查看完整图片。
* */

package chapter18.training;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.ScrollPaneConstants;

public class Picture extends JFrame
{
    private JPanel contentPane;

    public static void main(String[] args)
    {
        Picture frame=new Picture();
        frame.setVisible(true);
    }

    public Picture()
    {
        setTitle("通过滚动条查看完整图片");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,300,220);
        setResizable(false);
        contentPane=new JPanel();
        contentPane.setLayout(new BorderLayout(0,0));
        setContentPane(contentPane);

        JScrollPane scrollPane=new JScrollPane();
        contentPane.add(scrollPane,BorderLayout.CENTER);

        JLabel label=new JLabel("");
        //label.setIcon(new ImageIcon(Picture.class.getResource("Snow.jpg")));
        label.setIcon(new ImageIcon("src/chapter18/assets/photo/Snow.jpg"));
        scrollPane.setViewportView(label);
    }
}
