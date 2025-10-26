/*
 * 数据类型转换异常
 * */

package chapter9.practice;

public class NumberFormat
{
    public static void main(String[] args)
    {
        String str="1.5";
        int i=Integer.parseInt(str); // 将变量从String类型转换为int类型
        System.out.println(i);
    }
}
