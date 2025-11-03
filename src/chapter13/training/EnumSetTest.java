/*
* 星期枚举
* */

package chapter13.training;

import java.util.Scanner;

enum Week
{ // 定义一个枚举，用来记录一周的星期
    MONDAY("星期一"),TUESDAY("星期二"),WEDNESDAY("星期三"),THURSDAY("星期四"),FRIDAY("星期五"),SATURDAY("星期六"),SUNDAY("星期日");
    String week; // 定义一个变量，作为临时变量

    Week(String week)
    { // 定义枚举构造函数
        this.week=week;
    }

    public String getName()
    { // 获取枚举常量对应的值
        return week;
    }

    public static String getWeek(Week week)
    { // 定义一个静态方法，用来根据输入获取对应Week枚举值
        switch(week)
        {
            case Week.MONDAY:
                return "mon";
            case Week.TUESDAY:
                return "tues";
            case Week.WEDNESDAY:
                return "wed";
            case Week.THURSDAY:
                return "thru";
            case Week.FRIDAY:
                return "fri";
            case Week.SATURDAY:
                return "sat";
            case Week.SUNDAY:
                return "sun";
            default:
                return "Not a valid input.";
        }
    }
}

public class EnumSetTest
{ // 创建一个EnumSetTest类
    public static void main(String[] args)
    {
        System.out.println("———中英文星期对照表———"); // 提示信息
        Week weekArray[]=Week.values(); // 获取枚举数组
        for(Week k : weekArray)
        { // foreach循环遍历枚举数组
            System.out.println(k+"——"+k.getName()); // 输出枚举名称及对应中文含义
        }

        System.out.print("\n请输入要查询简写(小写)的英文星期："); // 提示信息
        Scanner sc=new Scanner(System.in); // 控制台输入
        String week=Week.getWeek(Week.valueOf(sc.next())); // 根据输入获取枚举值
        System.out.println(week);
        sc.close(); // 关闭控制台输入
    }
}
