/*
* 判断数字共有多少位
* */

package chapter10.practice;

public class Demo1
{
    public static void main(String[] args)
    {
        long l=1234567890987654321L;
        String str=String.valueOf(l);
        System.out.println(str.length());
    }
}