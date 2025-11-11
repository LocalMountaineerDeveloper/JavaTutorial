/*
* 创建特定布局效果的面板的窗体
* */

package chapter18.training;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Demo5
{
    public static void main(String[] args)
    {

        JButton b1=new JButton("Botton1");
        JButton b2=new JButton("Botton2");
        JButton b3=new JButton("Botton3");
        JButton b4=new JButton("Botton4");
        JButton b5=new JButton("Botton5");
        JPanel center=new JPanel();
        center.setLayout(new GridLayout(1,4));
        center.add(b1);
        center.add(b2);
        center.add(b3);
        center.add(b4);
        JPanel main=new JPanel();
        main.setLayout(new BorderLayout());
        main.add(center,BorderLayout.CENTER);
        main.add(b5,BorderLayout.SOUTH);

        JFrame f=new JFrame();
        f.add(main);
        f.setBounds(100,100,350,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
