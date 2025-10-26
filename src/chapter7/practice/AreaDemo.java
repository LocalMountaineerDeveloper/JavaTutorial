/*
 * 抽象的图形：创建一个抽象的图形类，图形类有一个表示“颜色”的属性、一个有参构造方法和一个抽象的“获得面积”的方法 。让长方形类继承图形类，先在长方形
 * 类的构造方法中调用图形类的构造方法，再在长方形类中声明“长”和“宽”的属性，接着在长方形类中重写图形类中的抽象方法。
 * */

package chapter7.practice;

abstract class Shape1
{
    String color;

    public Shape1(String color)
    {
        this.color=color;
    }

    abstract void getArea();
}

class Rectangle extends Shape1
{
    public Rectangle(String color)
    {
        super(color);
    }

    double length, width;

    @Override
    void getArea()
    {
        System.out.println("长为"+length+"、宽为"+width+"的"+
                super.color+"色长方形的面积是"+(length*width));
    }
}

public class AreaDemo
{
    public static void main(String[] args)
    {
        Rectangle rectangle=new Rectangle("黄");
        rectangle.length=6;
        rectangle.width=2;
        rectangle.getArea();
    }
}
