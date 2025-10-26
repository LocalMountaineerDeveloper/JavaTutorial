/*
* 转置字符串
* */

package chapter10.practice;

import java.util.Scanner;

public class ReverseStr
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入任意字符串：");
        String target=sc.next();
        char[] chr=target.toCharArray();
        System.out.println("转置后的字符串：");
        for(int i=chr.length-1;i>=0;i--)
        {
            System.out.print(chr[i]);
        }
        sc.close();
    }
}
