/*
* 老虎机：老虎机有3个玻璃框，玻璃框有红、黄、蓝三张卡片，拉下拉杆时将玻璃框停止转动时的结果输出在控制台上。
* */

package chapter7.practice;

class Color
{

}

class Red extends Color
{

}

class Yellow extends Color
{

}

class Blue extends Color
{

}

public class ColorDemo
{
    public static void main(String[] args)
    {
        Color color[]={new Red(),new Yellow(),new Blue()};
        for(int i=0;i<3;i++)
        {
            int index=(int)(Math.random()*3);
            judge(color[index]);
        }
    }

    public static void judge(Color color)
    {
        if(color instanceof Red)
            System.out.print("红");
        if(color instanceof Yellow)
            System.out.print("黄");
        if(color instanceof Blue)
            System.out.print("蓝");
    }
}
