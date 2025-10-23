/*
* 中断循环：编写2个使用for循环输出0~9代码的流程，一个当循环变量的值为2时抛出异常循环中断，另一个当循环变量为2时抛出异常但是不中断
* */

package chapter9.practice;

public class Demo7
{
    public static void main(String[] args)
    {
        try
        {
            for(int i=0;i<10;i++)
            {
                System.out.println(i);
                if(i==2)
                {
                    throw new Exception("中断循环");
                }
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }

        for(int i=0;i<10;i++)
        {
            System.out.println(i);
            try
            {
                if(i==2)
                {
                    throw new Exception("不中断循环");
                }
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
