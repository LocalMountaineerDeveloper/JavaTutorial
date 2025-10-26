/*
* 校验银行取款金额：使用try-catch语句块和finally语句块模拟取款过程，且银行规定每次取款金额必须是整数，捕捉数字格式转换异常。
* */

package chapter9.training;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Account
{ // 创建一个Account类
    public static void main(String[] args)
    {
        double leftMoney=1023.79; // 初始化“账户余额”
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入取款金额：");
        try
        { // try块
            int drawMoney=sc.nextInt();
            double result=leftMoney-drawMoney; // 建立变量间的关系
            if(result>=0)
            { // 当余额大于取款金额时
                System.out.println("您账号上的余额："+(float)result+"元");
            }else
            { // 当取款金额超出余额时
                System.out.println("您账号上的余额不足！");
            }
        }catch(InputMismatchException e)
        { // catch块
            System.out.println("发生数字格式转换异常：输入的“取款金额”不是整数！");
        }finally
        {
            sc.close(); // 关闭控制台输入
        }
    }
}
