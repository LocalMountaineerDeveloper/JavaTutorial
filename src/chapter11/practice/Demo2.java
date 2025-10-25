/*
* 输出1~100中的勾股定理数
* */

package chapter11.practice;

public class Demo2
{
    public static void main(String[] args)
    {
        for(int a=1;a<=100;a++)
        {
            for(int b=1;b<=100;b++)
            {
                for(int c=1;c<=100;c++)
                {
                    if(Math.pow(a,2)+Math.pow(b,2)==Math.pow(c,2))
                    {
                        System.out.println(a+","+b+","+c);
                    }
                }
            }
        }
    }
}
