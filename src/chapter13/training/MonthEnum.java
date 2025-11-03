/*
* 月份枚举
* */

package chapter13.training;

enum Month
{
    JAN,FEB,MAR,APR,MAY,JUN,JUL,AUG,SEP,OCT,NOV,DEC
}

public class MonthEnum
{
    public static void main(String[] args)
    {
        for(Month m:Month.values())
        {
            System.out.println(m+" "+m.ordinal());
        }
        Month m=Month.valueOf("APR");
        System.out.println(m.compareTo(Month.SEP));
    }
}