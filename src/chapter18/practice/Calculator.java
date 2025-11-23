/*
* 模拟计算器
* */

package chapter18.practice;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame
{
    private JPanel contentPane;
    private JTextField display;
    private ActionListener dotInsert=new dotInsertAction();
    private ActionListener insert=new InsertAction();
    private ActionListener command=new CommandAction();
    private double result=0;
    private String lastCommand="=";
    private boolean start=true; //为true时表示刚完成一次计算，为false时表示尚未进行计算而是在输入式子中

    //Launch the application.
    public static void main(String[] args)
    {
        Calculator frame=new Calculator();
        frame.setVisible(true);
    }

    //Create the frame.
    public Calculator()
    {
        setTitle("计算器");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationByPlatform(true); //设置窗口下次可见时应该出现的位置：本机窗口系统的默认位置，还是当前位置
        contentPane=new JPanel();
        contentPane.setBorder(new EmptyBorder(5,5,5,5));
        contentPane.setLayout(new BorderLayout(0,0));
        setContentPane(contentPane);

        JPanel displayPane=new JPanel();
        contentPane.add(displayPane,BorderLayout.NORTH);

        display=new JTextField();
        display.setText("0");
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        display.setEditable(false);
        display.setFont(new Font("微软雅黑",Font.PLAIN,15));
        displayPane.add(display);
        display.setColumns(13);

        JPanel systemButtonPanel=new JPanel();
        contentPane.add(systemButtonPanel,BorderLayout.CENTER);
        systemButtonPanel.setLayout(new GridLayout(1,2,5,5));

        JButton ceButton=new JButton("CE");
        ceButton.addActionListener(command);
        ceButton.setFont(new Font("微软雅黑",Font.PLAIN,15));
        systemButtonPanel.add(ceButton);

        JButton acButton=new JButton("AC");
        acButton.addActionListener(command);
        acButton.setFont(new Font("微软雅黑",Font.PLAIN,15));
        systemButtonPanel.add(acButton);

        JPanel buttonPanel=new JPanel();
        contentPane.add(buttonPanel,BorderLayout.SOUTH);
        buttonPanel.setLayout(new GridLayout(4,4,5,5));

        JButton number7Button=new JButton("7");
        number7Button.addActionListener(insert);
        number7Button.setFont(new Font("微软雅黑",Font.PLAIN,15));
        buttonPanel.add(number7Button);

        JButton number8Button=new JButton("8");
        number8Button.addActionListener(insert);
        number8Button.setFont(new Font("微软雅黑",Font.PLAIN,15));
        buttonPanel.add(number8Button);

        JButton number9Button=new JButton("9");
        number9Button.addActionListener(insert);
        number9Button.setFont(new Font("微软雅黑",Font.PLAIN,15));
        buttonPanel.add(number9Button);

        JButton divideButton=new JButton("/");
        divideButton.addActionListener(command);
        divideButton.setFont(new Font("微软雅黑",Font.PLAIN,15));
        buttonPanel.add(divideButton);

        JButton number4Button=new JButton("4");
        number4Button.addActionListener(insert);
        number4Button.setFont(new Font("微软雅黑",Font.PLAIN,15));
        buttonPanel.add(number4Button);

        JButton number5Button=new JButton("5");
        number5Button.addActionListener(insert);
        number5Button.setFont(new Font("微软雅黑",Font.PLAIN,15));
        buttonPanel.add(number5Button);

        JButton number6Button=new JButton("6");
        number6Button.addActionListener(insert);
        number6Button.setFont(new Font("微软雅黑",Font.PLAIN,16));
        buttonPanel.add(number6Button);

        JButton multiplyButton=new JButton("*");
        multiplyButton.addActionListener(command);
        multiplyButton.setFont(new Font("微软雅黑",Font.PLAIN,15));
        buttonPanel.add(multiplyButton);

        JButton number1Button=new JButton("1");
        number1Button.addActionListener(insert);
        number1Button.setFont(new Font("微软雅黑",Font.PLAIN,16));
        buttonPanel.add(number1Button);

        JButton number2Button=new JButton("2");
        number2Button.addActionListener(insert);
        number2Button.setFont(new Font("微软雅黑",Font.PLAIN,16));
        buttonPanel.add(number2Button);

        JButton number3Button=new JButton("3");
        number3Button.addActionListener(insert);
        number3Button.setFont(new Font("微软雅黑",Font.PLAIN,16));
        buttonPanel.add(number3Button);

        JButton substractButton=new JButton("-");
        substractButton.addActionListener(command);
        substractButton.setFont(new Font("微软雅黑",Font.PLAIN,15));
        buttonPanel.add(substractButton);

        JButton number0Button=new JButton("0");
        number0Button.addActionListener(insert);
        number0Button.setFont(new Font("微软雅黑",Font.PLAIN,16));
        buttonPanel.add(number0Button);

        JButton dotButton=new JButton(".");
        dotButton.setFont(new Font("微软雅黑",Font.PLAIN,15));
        dotButton.addActionListener(dotInsert);
        buttonPanel.add(dotButton);

        JButton equalButton=new JButton("=");
        equalButton.addActionListener(command);
        equalButton.setFont(new Font("微软雅黑",Font.PLAIN,15));
        buttonPanel.add(equalButton);

        JButton addButton=new JButton("+");
        addButton.addActionListener(command);
        addButton.setFont(new Font("微软雅黑",Font.PLAIN,15));
        buttonPanel.add(addButton);

        pack(); //用于确保窗口大小恰当地适应包含的组件，这个方法简化了窗口布局的过程
    }

    private class dotInsertAction implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String input=e.getActionCommand();
            String text=display.getText();
            if(!text.contains("."))
            {
                display.setText(text+input);
            }
        }
    }

    private class InsertAction implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String input=e.getActionCommand();
            String text=display.getText();
            if(start)
            {
                display.setText("");
                start=false;
            }
            if(text.startsWith("."))
            {
                display.setText("0"+display.getText()+input);
            }else if(text.startsWith("-0.") || text.startsWith("0."))
            {
                display.setText(display.getText()+input);
            }else if(text.startsWith("-0"))
            {
                display.setText("-"+input);
            }else if(text.startsWith("0"))
            {
                display.setText(input);
            }else
            {
                display.setText(display.getText()+input);
            }
        }
    }

    private class CommandAction implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String command=e.getActionCommand();
            if(command.equals("AC") || command.equals("CE"))
            {
                start=true;
            }
            if(start)
            {
                if(command.equals("AC"))
                {
                    display.setText("0");
                    result=0;
                    lastCommand="=";
                    start=false;
                }else if(command.equals("CE"))
                {
                    display.setText("0");
                    start=false;
                }else
                {
                    lastCommand=command;
                }
            }else
            {
                calculate(Double.parseDouble(display.getText()));
                lastCommand=command;
                start=true;
            }
        }
    }

    public void calculate(double x)
    {
        char operator=lastCommand.charAt(0);
        switch(operator)
        {
            case '+':
                result+=x;
                break;
            case '-':
                result-=x;
                break;
            case '*':
                result*=x;
                break;
            case '/':
                result/=x;
                break;
            case '=':
                result=x;
                break;
        }
        display.setText(""+result);
    }
}
