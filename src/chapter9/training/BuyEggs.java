/*
 * 超市限购：鲜鸡蛋每500克3.98元，每人限购1500克，将超过1500克作为异常抛出
 * */

package chapter9.training;

import java.util.Scanner;

class OverloadException extends Exception
{// 自定义一个异常类OverloadException继承Exception类

    public OverloadException(double weight)
    {// 构造有参的方法
        // 出现异常时控制台输出的信息
        System.out.println("异常提示：这份鲜鸡蛋的重量为"+weight+"斤，超过3斤了，超重了！！！");
    }
}

public class BuyEggs
{// 创建一个BuyEggs类

    public static void pay(double weight) throws OverloadException
    {// 创建一个静态的、有参的pay(double
        if(weight>3.0)
        {// 如果鸡蛋的重量超过三斤
            throw new OverloadException(weight); // 抛出异常
        }
        float money=(float)(weight*3.98); // 如果鸡蛋的重量没有超过三斤，计算“应付款”
        System.out.println("应付款："+money+"元"); // 输出“应付款”
    }

    public static void main(String[] args)
    {
        System.out.print("请输入鲜鸡蛋的重量(斤)：");
        Scanner sc=new Scanner(System.in); // 控制台输入
        double weight=sc.nextDouble(); // 声明一个double类型的变量weight接收控制台输入的值
        try
        {// try块
            pay(weight); // 调用pay()方法，并传递参数weight
        }catch(OverloadException ole)
        {// catch块
            /*
             * 注意： 这个方法体之所以为“空”是因为在自定义异常的类OverloadException中， 我们通过构造的有参方法public
             * OverloadException(double weight)，已将出现异常时的信息在控制台上输出了；
             * 所以，此处就不必再写“System.out.println(ole);”这条控制台输出语句。
             */
        }finally
        {// finally块
            sc.close(); // 关闭控制台输入
        }
    }
}
