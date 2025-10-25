/*
* 模拟用户登录
* */

package chapter11.training;

import java.util.Scanner;

public class Demo8
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username=sc.nextLine();
        System.out.println("请输入密码：");
        String password=sc.nextLine();
        if("mr".equals(username) && "123456".equals(password))
        {
            System.out.println("登录成功");
        }else
        {
            System.out.println("用户名或密码错误");
        }

        sc.close();
    }
}
