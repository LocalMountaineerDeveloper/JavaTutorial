/*
 * 简易计算器：使用静态方法模拟一个只能进行两个数加减乘除的简易计算器。
 * */

package chapter6.practice;

public class Calculator
{
    public static double add(double a,double b)
    {
        return a+b;
    }

    public static double minus(double a,double b)
    {
        return a-b;
    }

    public static double multiply(double a,double b)
    {
        return a*b;
    }

    public static double divide(double a,double b)
    {
        return a/b;
    }

    public static void main(String[] args)
    {
        System.out.println("4.4加上7.11的结果："+Calculator.add(4.4,7.11));
        System.out.println("8.9减去2.28的结果："+Calculator.minus(8.9,2.28));
        System.out.println("5.2乘以13.14的结果："+Calculator.multiply(5.2,13.14));
        System.out.println("92除以89的结果："+Calculator.divide(92,89));
    }
}
