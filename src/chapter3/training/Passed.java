/*
 * 判断成绩是否及格：裆分数大于等于60时，成绩及格，否则不及格。现一学生的分数是80分，使用三元运算符判断这名学生的成绩是否及格。
 * */

package chapter3.training;

public class Passed
{
    public static void main(String[] args)
    {
        int score=80; // 学生的分数
        System.out.println(score>=60 ? score+"分，成绩及格" : score+"分，成绩不及格");
    }
}
