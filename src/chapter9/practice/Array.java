/*
 * 数组发生的异常：简述整型数组会产生哪些种类异常
 * */

package chapter9.practice;

public class Array
{// 创建一个Array类

    public static void main(String args[])
    {
        int a[]={1,2,3,4};// 定义一个int类型的数组
        for(int i=0;i<5;i++)
        {// 遍历数组
            try
            {// try块
                System.out.print("当 i = "+i+"，"+i+" < 5 时，a["+i+"] = "+a[i]+"；");// 控制台输出
            }catch(ArrayIndexOutOfBoundsException e)
            {// catch块
                System.out.println("当 i = "+i+"，"+i+" < 5 时，a["+i+"]不存在，会引起"
                        +e.toString().substring(10,e.toString().indexOf(':'))
                        +"异常，\n该异常为数组越界异常，主要是由于索引超出了数组的长度范围引起的");// 控制台输出
            }
            if(i!=4)
            {// 当i不等于4的时候
                System.out.println("执行i++，"+"i = "+(i+1)+"。");// 控制台输出
            }
        }
        try
        {
            int b[]=new int[-2];
        }catch(Exception e)
        {
            System.out.println(e.toString()+"该异常为数组元素为负数时抛出的异常");
        }
    }
}
