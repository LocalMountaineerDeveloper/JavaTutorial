/*
* 屏蔽手机号中间4位的值
* */

package chapter10.training;

import java.util.Scanner;

public class ScreenPhoneNum
{
    public static void main(String[] args)
    {
        System.out.println("请输入手机号：");
        Scanner sc=new Scanner(System.in);
        String phoneNum=sc.next();
        StringBuilder sbd=new StringBuilder(phoneNum);
        if(sbd.length()==11)
        {
            sbd.replace(3,7,"****");
            System.out.println("手机号"+phoneNum+"屏蔽后的效果："+sbd.toString());
        }else
        {
            System.out.println("输入的手机号有误！");
        }
        sc.close();
    }
}
