/*
* 划分成绩等级：将一、二年级学生的成绩划分等级
* */

package chapter4.training;

import java.util.Scanner;

public class ScoreLevel
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入您的分数：");
        int score=sc.nextInt();
        if(score>=90 && score<=100)
        {
            System.out.println("您的分数"+score+"对应的等级为“优秀”");
        }else if(score>=80 && score<90)
        {
            System.out.println("您的分数"+score+"对应的等级为“良好”");
        }else if(score>=60 && score<80)
        {
            System.out.println("您的分数"+score+"对应的等级为“合格”");
        }else if(score<60 && score>=0)
        {
            System.out.println("您的分数"+score+"对应的等级为“不合格”");
        }else
        {
            System.out.println("无效成绩");
        }
        sc.close();
    }
}

