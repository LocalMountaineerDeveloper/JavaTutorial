/*
* 判断月份对应的季节
* */

package chapter4.training;

import java.util.Scanner;

public class Seasons
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入某个月份（1~12）：");
        int month=sc.nextInt();
        if(month<1 || month>12)
        {
            System.out.println("警告：您在非法操作……");
        }else
        {

            switch(month)
            {
                case 3:
                case 4:
                case 5:
                    System.out.println(month+"月正值春季");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println(month+"月正值夏季");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println(month+"月正值秋季");
                    break;
                case 12:
                case 1:
                case 2:
                    System.out.println(month+"月正值冬季");
                    break;
            }
        }
        sc.close();
    }
}
