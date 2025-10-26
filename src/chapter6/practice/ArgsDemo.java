/*
 * 判断是否存在运行时参数：将main()方法所有参数输出到控制台。
 * */

package chapter6.practice;

public class ArgsDemo
{
    public static void main(String[] args)
    {
        int lengh=args.length;
        if(lengh==0)
        {
            System.out.println("无运行参数");
        }else
        {
            for(int i=1;i<=args.length;i++)
            {
                System.out.println(i);
            }
        }
    }
}
