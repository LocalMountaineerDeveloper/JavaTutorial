/*
* 给字符串加标点
* */

package chapter10.training;

import java.util.Scanner;

public class Punctuation
{
    public static void main(String[] args)
    {
        StringBuilder sbd=new StringBuilder("熊出没小心");
        System.out.println("未添加标点的字符串："+sbd.toString());
        System.out.println("请输入在第几个汉字后加逗号：");
        Scanner sc=new Scanner(System.in);
        int position=sc.nextInt();
        sbd.insert(position,"，");
        System.out.println("添加标点后的字符串："+sbd.toString());
        sc.close();
    }
}
