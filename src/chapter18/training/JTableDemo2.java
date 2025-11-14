/*
* 人员信息表（二）：在人员信息表（一）中添加一个“删除”按钮。
* */

package chapter18.training;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JTableDemo2
{
    public static void main(String args[])
    {
        String[] columnNames={"编号","姓名","性别"};
        String[][] tableValues={{"1","张三","男"},{"2","李四","女"},{"3","王五","女"},{"4","赵六","男"},};
        DefaultTableModel tableModel=new DefaultTableModel(tableValues,columnNames);
        JTable table=new JTable(tableModel);
        JScrollPane scrollPane=new JScrollPane(table);

        JButton b=new JButton("删除");
        b.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                int index=table.getSelectedRow();
                if(index!=-1)
                {
                    tableModel.removeRow(index);
                }
            }
        });

        JFrame f=new JFrame();
        f.add(scrollPane,BorderLayout.CENTER);
        f.add(b,BorderLayout.SOUTH);
        f.setBounds(100,100,240,150);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
