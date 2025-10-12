/*
* 自动批卷程序：现有学号为1~8的8名学生和10道题目，将学生答案存储在二维数组中，通过学号找到并输出该学生的答案及回答正确的题目总数
* */

package chapter5.practice;

import java.util.Scanner;

public class Answers
{// 创建Scores类

    public static void main(String[] args)
    {
        // 初始化String类型的一维数组（设为题目的标准答案）
        char right[]={'B','A','D','C','C','B','C','A','D','B'};
        // 初始化String类型的二维数组（记录8名学生的答案）
        char choice[][]={
                {'B','A','D','C','A','B','C','C','D','B'},
                {'B','A','D','B','A','B','C','A','C','B'},
                {'A','A','D','C','B','A','C','A','D','B'},
                {'B','C','D','C','A','B','C','B','D','A'},
                {'B','C','D','A','C','B','D','A','D','A'},
                {'B','A','D','A','C','B','D','A','C','B'},
                {'A','B','A','C','D','B','C','A','D','B'},
                {'B','A','D','C','D','B','A','C','D','B'}};
        while(true)
        {// 实现多次控制台输入信息
            System.out.println("您想调取第几位学生的答题结果"
                    +"(有效数字为1至8)：");// 提示信息
            Scanner sc=new Scanner(System.in);// 控制台输入
            int num=sc.nextInt();// 接收控制台输入的信息
            int sum=0;// 声明int类型的全局变量sum（答对的题目总数）
            System.out.println("第"+num+"位同学的全部答案为：");// 提示信息
            for(int j=0;j<choice[num-1].length;j++)
            {
                System.out.print(choice[num-1][j]+" ");// 输出数组的元素
                // 判断键入的信息是否为正确答案
                if(choice[num-1][j]==right[j])
                {
                    sum++;// 答对的题目总数
                }
            }
            System.out.println();// 换行
            // 控制台输出答对的题目总数
            System.out.println("第"+num+"位同学一共答对了"+sum
                    +"道题"+"\n");
        }
    }
}
