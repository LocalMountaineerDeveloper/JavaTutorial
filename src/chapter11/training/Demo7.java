/*
* 边长可变的正方形：打印出用户输入的数字为边长的由“*”字符组成的正方形
* */

package chapter11.training;

import java.util.Scanner;

public class Demo7
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入边长：");
        int l=sc.nextInt();
        for(int x=0;x<l;x++)
        {
            for(int y=0;y<l;y++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
