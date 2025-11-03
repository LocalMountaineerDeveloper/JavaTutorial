/*
* 彩虹枚举
* */

package chapter13.practice;

enum RainbowEnum
{
    red,orange,yellow,green,blue,indigo,purple
}

public class Rainbow
{
    public static void main(String[] args)
    {
        for(RainbowEnum r : RainbowEnum.values())
        {
            System.out.println(r+" "+r.ordinal());
        }
        RainbowEnum r=RainbowEnum.valueOf("blue");
        System.out.println(r.compareTo(RainbowEnum.purple));
    }
}