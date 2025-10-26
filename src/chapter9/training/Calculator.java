/*
* 简易计算器：使用try-catch语句块捕捉InputMismatchException异常
* */

package chapter9.training;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator
{// 创建一个Number类

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in); // 控制台输入
        try
        {// try块
            System.out.println("请输入第一个整数："); // 提示信息
            int num1=sc.nextInt(); // 声明一个int类型的变量num1接收控制台输入的信息

            System.out.println("请输入运算符号(+、-、*、/)："); // 提示信息
            String symbol=sc.next(); // 声明一个String类型的变量symbol接收控制台输入的信息

            System.out.println("请输入第二个整数："); // 提示信息
            int num2=sc.nextInt(); // 声明一个int类型的变量num1接收控制台输入的信息

            int result=0; // 定义并初始化“运算结果”

            switch(symbol)
            {
                case "+":
                    result=num1+num2;
                    break;
                case "-":
                    result=num1-num2;
                    break;
                case "*":
                    result=num1*num2;
                    break;
                case "/":
                    if(num2!=0)
                    {
                        result=num1/num2;
                    }else
                    {
                        System.out.println("除数怎么可能是“0”呢？");
                        return;
                    }
                    break;
            }
            System.out.println("运算结果："+result); // 输出运算结果
        }catch(InputMismatchException ime)
        {// catch块
            System.out.println("对不起！您输入的不是整数，已经引起了"+ime.toString()+"异常；\n"+"即：用户输入的信息与规定的参数类型不符时出现的异常"); // 输出异常的信息
        }
        sc.close();
    }
}
