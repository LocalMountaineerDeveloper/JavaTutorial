/*
* 模拟员工打卡：员工输入自己姓名，若名单有则打卡成功，否则提示员工不存在。
* */

package chapter10.training;

import java.util.Scanner;

public class PunchClock
{
    public static void main(String[] args)
    {
        String names="张三，李四，王五，赵六，周七，王哲，白浩，贾蓉，贾蓉阿三，黄蓉";
        while(true)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("输入姓名：");
            String targetName=sc.next();
            if(names.indexOf(targetName)!=-1)
            {
                System.out.println("打卡成功");
            }else
            {
                System.out.println("该员工不存在");
            }
        }
    }
}
