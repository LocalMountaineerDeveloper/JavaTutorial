/*
* 人员信息表（一）：创建一个JTable表格。
* */

package chapter18.training;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JTableDemo
{
    public static void main(String args[])
    {
        String[] columnNames={"编号","姓名","性别"};
        String[][] tableValues={{"1","张三","男"},{"2","李四","女"},{"3","王五","女"},{"4","赵六","男"},};
        DefaultTableModel tableModel=new DefaultTableModel(tableValues,columnNames);
        JTable table=new JTable(tableModel);
        JScrollPane scrollPane=new JScrollPane(table);

        JFrame f=new JFrame();
        f.add(scrollPane,BorderLayout.CENTER);
        f.setBounds(100,100,240,150);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
