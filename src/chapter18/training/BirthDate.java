/*
* 选择出生日期：使用下拉列表框选择出生日期，要求最大年份根据系统时间而定，能够判断大小月、平闰年不同情况下一个月的天数。
* */

package chapter18.training;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Calendar;
import java.util.Vector;

public class BirthDate extends JFrame
{
    private JPanel contentPane;
    private JComboBox yearComboBox;
    private JComboBox monthComboBox;
    private JComboBox dayComboBox;

    public static void main(String[] args)
    {
        BirthDate frame=new BirthDate();
        frame.setVisible(true);
    }

    public BirthDate()
    {
        setTitle("选择出生日期");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,300,100);

        contentPane=new JPanel();
        contentPane.setLayout(new FlowLayout());
        setContentPane(contentPane);

        JLabel labelBirth=new JLabel("出生日期：");
        contentPane.add(labelBirth);

        yearComboBox=new JComboBox();
        int currentYear=Calendar.getInstance().get(Calendar.YEAR);
        Vector<Integer> yearList=new Vector<>();
        for(int year=1970;year<=currentYear;++year)
        {
            yearList.add(Integer.valueOf(year));
        }
        yearComboBox.setModel(new DefaultComboBoxModel<Integer>(yearList));
        contentPane.add(yearComboBox);

        JLabel labelYear=new JLabel("年");
        contentPane.add(labelYear);

        monthComboBox=new JComboBox();
        monthComboBox.setModel(new DefaultComboBoxModel<Integer>(new Integer[]{1,2,3,4,5,6,7,8,9,10,11,12}));
        contentPane.add(monthComboBox);

        JLabel labelMonth=new JLabel("月");
        contentPane.add(labelMonth);

        dayComboBox=new JComboBox();
        dayComboBox.setModel(new DefaultComboBoxModel<Integer>(new Integer[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31}));
        contentPane.add(dayComboBox);

        JLabel labelDay=new JLabel("日");
        contentPane.add(labelDay);

        initListener(); //初始化年月下拉列表框监听器，用于判断日日期框的天数。
    }

    private void initListener()
    { //给年月下拉列表框添加选择事件监听器
        yearComboBox.addItemListener(new ItemListener()
        {
            @Override
            public void itemStateChanged(ItemEvent e)
            {
                if(e.getStateChange()==ItemEvent.SELECTED)
                { //仅当选择完成时发生触发
                    int year=(Integer)e.getItem();
                    int month=(Integer)monthComboBox.getSelectedItem();
                    updateDayComboBox(year,month);
                }
            }
        });
        monthComboBox.addItemListener(new ItemListener()
        {
            @Override
            public void itemStateChanged(ItemEvent e)
            {
                if(e.getStateChange()==ItemEvent.SELECTED)
                { //仅当选择完成时发生触发
                    int year=(Integer)yearComboBox.getSelectedItem();
                    int month=(Integer)e.getItem();
                    updateDayComboBox(year,month);
                }
            }
        });
    }

    private void updateDayComboBox(int year,int month)
    { //使用Calendar类自动处理日期的大小月、平闰年逻辑，注意Calendar的月份范围是0~11
        Calendar calendar=Calendar.getInstance();
        calendar.set(year,month-1,1);
        int maxDay=calendar.getActualMaximum(Calendar.DAY_OF_MONTH); //获取当月最大天数
        dayComboBox.removeAllItems();
        for(int i=1;i<=maxDay;++i)
        {
            dayComboBox.addItem(Integer.valueOf(i));
        }
    }
}