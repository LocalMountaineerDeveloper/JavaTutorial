/*
 * 计算1~20的阶乘的倒数之和：1/1!+1/2!+1/3!+...+1/20!之和
 * */

package chapter4.practice;

public class Demo
{
    public static void main(String args[])
    {
        double sum=0, a=1,b=1;
        int i=1,j=1;
        while(i<=20)
        {
            b=1;
            j=i;
            while(j>=1)
            {
                b*=j;
                --j;
            }
            a=1.0/b;
            sum+=a;
            ++i;
        }
        System.out.println(sum);
    }
}
