/*
* 模拟客车售票：一辆大巴有9排4列座位，编写一个程序，模拟这辆大巴的售票过程（1代表有票，0代表无票）
* */

package chapter5.practice;

import java.util.Scanner;

public class Ticket
{// 客车售票系统

    public static void main(String[] args)
    {
        int zuo[][]=new int[9][4];// 定义二维数组
        for(int i=0;i<9;i++)
        {// for循环开始
            for(int j=0;j<4;j++)
            {// for循环开始
                zuo[i][j]=1;// 初始化二维数组
            }
        }
        while(true)
        {// 开始售票
            // 输出标题
            System.out.println("            简单客车售票系统"+"\n　　9排4列的大巴车开始售票");
            for(int i=0;i<9;i++)
            {
                for(int j=0;j<4;j++)
                {
                    System.out.print(zuo[i][j]+"\t");// 输出售票信息
                }
                System.out.println();// 输出换行符
            }
            // 创建扫描器，用来进行用户输入
            Scanner sc=new Scanner(System.in);
            // 提示用户输入信息
            System.out.print("请输入要预定的坐位行号：");
            int row=sc.nextInt();// 得到坐位行数
            // 提示用户输入信息
            System.out.print("请输入要预定的坐位列号：");
            int column=sc.nextInt();// 得到坐位列数
            zuo[row-1][column-1]=0;// 标记售出票状态
        }
    }
}
