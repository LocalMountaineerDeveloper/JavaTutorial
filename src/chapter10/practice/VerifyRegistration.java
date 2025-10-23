/*
* 用户名校验：用户注册网站账号，若申请的用户名已被注册，则注册失败。
* */

package chapter10.practice;

import java.util.Scanner;

public class VerifyRegistration
{
    public static void main(String[] args)
    {
        String[] userNames={"mrsoft","mr","miss","Admin."};
        System.out.println("欢迎进入明日学院注册页面");
        boolean flag=true;
        String names=null;
        String userName;
        do
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("请输入用户名：");
            userName=sc.nextLine();
            for(int i=0;i<userNames.length;i++)
            {
                names+=userNames[i];
                if(userName.equals(userNames[i]))
                {
                    System.out.println("该用户名已存在！请重新输入……");
                }
                if(!names.contains(userName))
                {
                    flag=false;
                }
            }
        }while(flag);
        Scanner in=new Scanner(System.in);
        System.out.println("请输入密码：");
        String password=in.nextLine();
        System.out.println("当前用户的用户名："+userName.trim()+"\n当前用户的密码："+password);
        in.close();
    }
}
