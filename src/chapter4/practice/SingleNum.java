/*
* 查找素数：判断1~100里有多少个素数。
* */

package chapter4.practice;

public class SingleNum
{
    public static void main(String[] args)
    {
        int count=0;
        for(int i=1;i<=100;i++)
        {
            // 默认是素数
            boolean flag=true;
            for(int j=2;j<=Math.sqrt(i);j++)
            {
                if(i%j==0)
                {
                    // 能整除
                    flag=false;
                }
            }
            if(flag)
            {
                if(i==1)
                {
                    continue;
                }
                count+=1;
                System.out.print(i+",");
            }
        }
        System.out.println("\n共计"+count+"个素数");
    }
}