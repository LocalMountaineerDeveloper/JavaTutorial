/*
 * 交换数组元素：将第一个元素值与第三个元素值交换，第二个与第四个交换。
 * */

package chapter6.training;

public class Demo
{
    public static void main(String[] args)
    {
        int a[]={1,3,5,7};
        int tmp=a[0];
        a[0]=a[2];
        a[2]=tmp;
        tmp=a[1];
        a[1]=a[3];
        a[3]=tmp;
        for(int num : a)
        {
            System.out.print(num+" ");
        }
    }
}
