/*
* 对比执行效率：比较“+=”运算符和concat()方法哪一个拼接字符串的执行效率更高
* */

package chapter11.training;

public class Demo6
{
    public static void main(String[] args)
    {
        long time1=System.currentTimeMillis();
        String str=null;
        for(int i=0;i<10000;i++)
        {
            str+="a";
        }
        long time2=System.currentTimeMillis();
        for(int i=0;i<10000;i++)
        {
            str.concat("a");
        }

        long time3=System.currentTimeMillis();
        System.out.println("+=用时："+(time2-time1));
        System.out.println("concat()用时："+(time3-time2));
    }
}
