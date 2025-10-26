/*
* 坐标移动：一个小球在直角坐标系中的坐标位置是(15,4)，它向与竖直线成30°的东北方向移动了100个单位的距离，轻微小球移动后的坐标是多少？
* */

package chapter11.practice;

public class Demo3
{
    public static void main(String[] args)
    {
        double distance=100;
        int x1=15, y1=14;
        int angle=30;
        double distance_H=distance*Math.sin(Math.toRadians(angle));
        double distance_V=distance*Math.cos(Math.toRadians(angle));
        int x2=x1+(int)Math.round(distance_H);
        int y2=y1+(int)Math.round(distance_V);
        System.out.println("新坐标("+x2+","+y2+")");
    }
}
