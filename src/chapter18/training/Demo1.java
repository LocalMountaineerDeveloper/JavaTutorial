/*
* 创建指定大小的窗体
* */

package chapter18.training;

import javax.swing.JFrame;

public class Demo1
{
    public static void main(String[] args)
    {
        JFrame f=new JFrame();
        f.setBounds(300,100,320,240);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
