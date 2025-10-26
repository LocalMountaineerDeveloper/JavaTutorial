/*
* 统计粮仓中的粮食：一个圆柱形粮仓，底面直径为10米，高为3米，该粮仓体积为多少立方米？如果每立方米屯粮750千克，该粮仓一共可以储存多少千克粮食。
* */

package chapter3.practice;

public class Granary
{
    public static void main(String[] args)
    {
        final double PI = 3.14;
        int diameter = 10;
        int height = 3;
        double volume = diameter / 2 * diameter / 2 * PI * height;
        System.out.println("该粮仓的体积 = " + volume + "立方米");
        int weight = 750;
        System.out.println("该粮仓一共可储存" + weight * volume + "千克粮食");
    }
}
