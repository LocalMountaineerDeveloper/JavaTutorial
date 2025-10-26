/*
 * 创建数学工具类：数学工具类有个pow()方法，返回传入的double参数的4次幂。
 * */

package chapter6.training;

public class MathUtil
{
    public double pow(double num)
    {
        return num*num*num*num;
    }

    public static void main(String[] args)
    {
        MathUtil util=new MathUtil();
        System.out.println(util.pow(45.6));
        System.out.println(util.pow(0.35));
    }
}
