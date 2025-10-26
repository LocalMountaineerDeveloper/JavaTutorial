/*
* 判断“ABAB”形式的数字：在控制台输入一个4位数字，判断其是否位“ABAB”形式。
* */

package chapter10.training;

import java.util.Scanner;

public class Demo11
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个4位的数字：");
        String numbers=sc.next();
        if(numbers.length()==4)
        { //“()”表示捕获组，“\1”表示反向引用第1个捕获组匹配到的内容
            boolean b=numbers.matches("(..)\\1");
            if(b)
            {
                System.out.println(numbers+"是ABAB形式的数字！");
            }else
            {
                System.out.println(numbers+"不是ABAB形式的数字！");
            }
        }else
        {
            System.out.println("请输入一个4位的数字！");
        }
        sc.close();
    }
}