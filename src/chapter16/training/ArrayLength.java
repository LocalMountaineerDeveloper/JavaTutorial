/*
* 反射方法：利用反射实现通用扩展数组长度的方法。
* */

package chapter16.training;

import java.lang.reflect.*;

public class ArrayLength
{

    public static void main(String[] args)
    {

        Test1 test=new Test1();

        test.print();

        test.is=(int[])addArrayLength(test.is,10);
        test.ss=(String[])addArrayLength(test.ss,10);

        test.print();

    }

    public static Object addArrayLength(Object array,int newLength)
    {
        Object newArray=null;
        Class componentType=array.getClass().getComponentType();
        newArray=Array.newInstance(componentType,newLength);
        System.arraycopy(array,0,newArray,0,Array.getLength(array));
        return newArray;
    }
}

class Test1
{

    public int[] is={1,2,3};

    public String[] ss={"A","B","C"};

    public void print()
    {

        for(int index=0;index<is.length;index++)
        {
            System.out.println("is["+index+"]="+is[index]);
        }

        System.out.println();

        for(int index=0;index<ss.length;index++)
        {
            System.out.println("ss["+index+"]="+ss[index]);
        }

        System.out.println();

    }

}