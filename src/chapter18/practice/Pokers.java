/*
* 翻转扑克牌：通过鼠标移入与移除翻转扑克牌。
* */

package chapter18.practice;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Pokers extends JFrame
{
    private JPanel contentPane;
    private JLabel firstLbl;
    private JLabel secondLbl;
    private JLabel thirdLbl;
    private JLabel fourthLbl;
    
    public static void main(String[] args)
    {
        Pokers frame=new Pokers();
        frame.setVisible(true);
    }
    
    public Pokers()
    {
        setTitle("可翻转的扑克");
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,509,200);
        
        contentPane=new JPanel();
        contentPane.setBackground(new Color(0,153,51));
        contentPane.setBorder(new EmptyBorder(5,5,5,5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        firstLbl=new JLabel("");
        firstLbl.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                firstLbl.setIcon(new ImageIcon("src/chapter18/assets/photo/poker3.png"));
            }
            @Override
            public void mouseExited(MouseEvent e)
            {
                firstLbl.setIcon(new ImageIcon("src/chapter18/assets/photo/poker5.png"));
            }
        });
        firstLbl.setIcon(new ImageIcon("src/chapter18/assets/photo/poker5.png"));
        firstLbl.setBounds(10,10,113,153);
        contentPane.add(firstLbl);

        secondLbl=new JLabel("");
        secondLbl.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                secondLbl.setIcon(new ImageIcon("src/chapter18/assets/photo/poker2.png"));
            }
            @Override
            public void mouseExited(MouseEvent e)
            {
                secondLbl.setIcon(new ImageIcon("src/chapter18/assets/photo/poker5.png"));
            }
        });
        secondLbl.setIcon(new ImageIcon("src/chapter18/assets/photo/poker5.png"));
        secondLbl.setBounds(133,10,113,153);
        contentPane.add(secondLbl);

        thirdLbl=new JLabel("");
        thirdLbl.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                thirdLbl.setIcon(new ImageIcon("src/chapter18/assets/photo/poker4.png"));
            }
            @Override
            public void mouseExited(MouseEvent e)
            {
                thirdLbl.setIcon(new ImageIcon("src/chapter18/assets/photo/poker5.png"));
            }
        });
        thirdLbl.setIcon(new ImageIcon("src/chapter18/assets/photo/poker5.png"));
        thirdLbl.setBounds(256,10,113,153);
        contentPane.add(thirdLbl);

        fourthLbl=new JLabel("");
        fourthLbl.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                fourthLbl.setIcon(new ImageIcon("src/chapter18/assets/photo/poker1.png"));
            }
            @Override
            public void mouseExited(MouseEvent e)
            {
                fourthLbl.setIcon(new ImageIcon("src/chapter18/assets/photo/poker5.png"));
            }
        });
        fourthLbl.setIcon(new ImageIcon("src/chapter18/assets/photo/poker5.png"));
        fourthLbl.setBounds(379,10,113,153);
        contentPane.add(fourthLbl);
    }
}
