/*
* 边界布局：把《射雕英雄传》中的“东邪”、“西毒”、“南帝”、“北丐”、“中神通”放置在合适位置上。
* */

package chapter18.training;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Characters extends JFrame
{

    private JPanel contentPane;

    public static void main(String[] args)
    {
        Characters frame=new Characters();
        frame.setVisible(true);
    }

    public Characters()
    {
        setTitle("东邪西毒南帝北丐中神通");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,450,300);
        contentPane=new JPanel();
        contentPane.setBorder(new EmptyBorder(5,5,5,5));
        contentPane.setLayout(new BorderLayout(0,0));
        setContentPane(contentPane);

        JLabel label=new JLabel("北丐——洪七公");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(label,BorderLayout.NORTH);

        JLabel label_1=new JLabel("南帝——段智兴");
        label_1.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(label_1,BorderLayout.SOUTH);

        JLabel label_2=new JLabel("西毒——欧阳锋");
        label_2.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(label_2,BorderLayout.WEST);

        JLabel label_3=new JLabel("东邪——黄药师");
        label_3.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(label_3,BorderLayout.EAST);

        JLabel label_4=new JLabel("中神通——王重阳");
        label_4.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(label_4,BorderLayout.CENTER);
    }
}
