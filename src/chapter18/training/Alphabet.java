/*
* 网格布局展示26个英文字母表
* */

package chapter18.training;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Alphabet extends JFrame
{

    private JPanel contentPane;

    public static void main(String[] args)
    {
        Alphabet frame=new Alphabet();
        frame.setVisible(true);
    }

    public Alphabet()
    {
        setTitle("26个英文字母表");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,450,300);
        contentPane=new JPanel();
        contentPane.setBorder(new EmptyBorder(5,5,5,5));
        setContentPane(contentPane);
        contentPane.setLayout(new GridLayout(4,7,5,5));

        JLabel lblAa=new JLabel("Aa");
        lblAa.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(lblAa);

        JLabel lblBb=new JLabel("Bb");
        lblBb.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(lblBb);

        JLabel lblCc=new JLabel("Cc");
        lblCc.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(lblCc);

        JLabel lblDd=new JLabel("Dd");
        lblDd.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(lblDd);

        JLabel lblEe=new JLabel("Ee");
        lblEe.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(lblEe);

        JLabel lblFf=new JLabel("Ff");
        lblFf.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(lblFf);

        JLabel lblGg=new JLabel("Gg");
        lblGg.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(lblGg);

        JLabel lblHh=new JLabel("Hh");
        lblHh.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(lblHh);

        JLabel lblIi=new JLabel("Ii");
        lblIi.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(lblIi);

        JLabel lblJj=new JLabel("Jj");
        lblJj.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(lblJj);

        JLabel lblKk=new JLabel("Kk");
        lblKk.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(lblKk);

        JLabel lblLl=new JLabel("Ll");
        lblLl.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(lblLl);

        JLabel lblMm=new JLabel("Mm");
        lblMm.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(lblMm);

        JLabel lblNn=new JLabel("Nn");
        lblNn.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(lblNn);

        JLabel lblOo=new JLabel("Oo");
        lblOo.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(lblOo);

        JLabel lblPp=new JLabel("Pp");
        lblPp.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(lblPp);

        JLabel lblQq=new JLabel("Qq");
        lblQq.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(lblQq);

        JLabel labelNone=new JLabel("");
        labelNone.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(labelNone);

        JLabel lblRr=new JLabel("Rr");
        lblRr.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(lblRr);

        JLabel lblSs=new JLabel("Ss");
        lblSs.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(lblSs);

        JLabel lblTt=new JLabel("Tt");
        lblTt.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(lblTt);

        JLabel lblUu=new JLabel("Uu");
        lblUu.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(lblUu);

        JLabel lblVv=new JLabel("Vv");
        lblVv.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(lblVv);

        JLabel lblWw=new JLabel("Ww");
        lblWw.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(lblWw);

        JLabel labelNull=new JLabel("");
        labelNull.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(labelNull);

        JLabel lblXx=new JLabel("Xx");
        lblXx.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(lblXx);

        JLabel lblYy=new JLabel("Yy");
        lblYy.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(lblYy);

        JLabel lblZz=new JLabel("Zz");
        lblZz.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(lblZz);
    }
}
