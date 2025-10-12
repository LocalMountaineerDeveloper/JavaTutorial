/*
* 货车装西瓜：一货车的车厢长400厘米、宽160厘米、高30厘米，现有100个直径约为23厘米的西瓜。问：这辆货车满载时能装多少个西瓜？实际能装多少个西瓜？
* */

package chapter3.training;

public class Truck
{
    public static void main(String[] args)
    {
        double l=400, w=160, h=30;// 货箱的长宽高
        double r=23;// 西瓜的直径
        int lCount=(int)(l/r);// 长可以放下的西瓜数量
        int wCount=(int)(w/r);// 宽可以放下的西瓜数量
        int hCount=(int)(h/r);// 高可以放下的西瓜数量
        System.out.println("货车满载时能装"+(lCount*wCount*hCount)+"个西瓜");
        System.out.println((lCount*wCount*hCount)>100 ? "货车实际能装100个西瓜" : "货车实际能装"+(lCount*wCount*hCount)+"个西瓜");
    }
}

