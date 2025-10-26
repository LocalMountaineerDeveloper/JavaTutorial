/*
* 引发越界异常
* */

package chapter9.practice;

public class NullPointer
{
    public static void main(String[] args)
    {
        int[] a=new int[]{1,2};
        int i=3;
        System.out.println(a[i]);
    }
}
