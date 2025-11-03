/*
* 对数组进行排序：编写一个Sortable接口，让接口对象引用java.util.Arrays类的sort()静态方法。
* */

package chapter14.training;

interface Sortable
{
    void sort(int arr[]);
}

public class Demo3
{

    public static void main(String[] args)
    {
        Sortable s=java.util.Arrays::sort;
        int arr[]={9,4,1,5,2,6,3};
        s.sort(arr);
        for(int x : arr)
        {
            System.out.print(x+" ");
        }
    }
}
