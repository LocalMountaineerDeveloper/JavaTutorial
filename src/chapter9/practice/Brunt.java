/*
* 乘法引发的异常：数据溢出
* */
package chapter9.practice;

public class Brunt
{
    public static int count(int m,int n) throws ArithmeticException
    {
        int result=m*n;
        if((result<0 && m>0 && n>0) || (result<0 && m<0 && n<0) || (result>0 && m<0 && n>0) || (result>0 && m>0 && n<0))
        {
            throw new ArithmeticException("数据溢出！");
        }else
        {
            return result;
        }
    }

    public static void main(String args[]) throws Exception
    {
        try
        {
            int result=count(12315,57876876);
            System.out.println(result);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        try
        {
            int result=count(-12315,-57876876);
            System.out.println(result);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        try
        {
            int result=count(-12315,57876876);
            System.out.println(result);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        try
        {
            int result=count(12315,-57876876);
            System.out.println(result);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
