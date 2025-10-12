/*
 * 计算月收入：小李每月的工资湿4500元，每月的奖金是1000元，每月要缴纳的五险一金合计是500元，计算小李每月的最终收入是多少。
 * */

package chapter3.training;

public class CountSalary
{
    public static void main(String[] args)
    {
        int salary=4500; // 小李的工资
        int bonus=1000; // 小李的奖金
        int insurance=500; // 小李要缴纳的五险一金
        int income=salary+bonus-insurance; // 小李的最终收入
        System.out.println("小李的月收入是"+income);
    }
}
