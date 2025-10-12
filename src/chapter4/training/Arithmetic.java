/*
* 斐波那契数列：前两个数相加等于第三个数，那么第n个数的值是多少？
* */

package chapter4.training;

import java.util.Scanner;

public class Arithmetic
{
    public static void main(String[] args)
    {
        int num1=1, num2=1;// 前两个数字
        Scanner sc=new Scanner(System.in);// 创建扫描器对象，用于输入
        System.out.print("请输入要查看第n个数中的n值：");
        int n=sc.nextInt();// 记录用户输入的数字
        for(int i=2;i<n;i++)
        {// 从2开始
            num1=num1+num2;// 后一个数字是前两个数字之和
            // 交换num1和num2的值
            int temp=num1;
            num1=num2;
            num2=temp;
        }
        System.out.println("第"+n+"个数为"+num2);// 输出指定位数上的数据
        sc.close();
    }
}
