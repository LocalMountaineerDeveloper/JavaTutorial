/*
* 计算质数：使用lambda表达式创建接口对象，抽象方法输出方法参数值内所有质数。
* */

package chapter14.training;

import java.util.ArrayList;

interface SingleNumInterface
{
    int[] getSingleNums(int max);
}

public class Demo1
{

    public static void main(String[] args)
    {
        SingleNumInterface sni=e->
        {
            ArrayList<Integer> list=new ArrayList<>();
            if(e<=1)
            {
                System.err.println("质数只能是大于1的自然数。");
            }
            for(int i=2;i<=e;i++)
            {
                boolean flag=true;// 默认是素数
                for(int j=2;j<=Math.sqrt(i);j++)
                {
                    if(i%j==0)
                    {
                        flag=false;// 能整除
                    }
                }
                if(flag)
                {
                    list.add(i);
                }
            }
            int result[]=new int[list.size()];
            for(int i=0;i<result.length;i++)
            {
                result[i]=list.get(i);
            }
            return result;
        };

        int max=1;
        System.out.println(max+"以内的所有质数为：");
        for(int num : sni.getSingleNums(max))
        {
            System.out.print(num+" ");
        }

    }
}