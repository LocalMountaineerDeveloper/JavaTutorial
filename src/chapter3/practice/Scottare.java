/*
 * 谁该缴税：员工a与员工b的月薪分别为3000元和4500元，判断哪位员工需要缴纳个人所得税，哪位员工不需要缴纳个人所得税。（假设工资、薪金所得的个税起征
 * 点为5000元）
 * */

package chapter3.practice;

public class Scottare
{
    public static void main(String[] args)
    {
        int salaryA=4500;
        int salaryB=5500;
        int standard=5000;
        System.out.println("员工a的月薪为4500元，员工a是否需要缴税："+(standard<salaryA));
        System.out.println("员工b的月薪为5500元，员工b是否需要缴税："+(standard<salaryB));
    }
}
