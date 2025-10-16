/*
* 判断3条给定长度的边能否构成三角形：创建一个抽象的图形类，图形类中有一个抽象的“计算周长”方法，让三角形类继承图形类，判断三条边能否构成三角形，接着
* 重写图形类中的抽象方法。
* */

package chapter7.practice;

abstract class Shape2
{
    abstract void calPerimeter();
}

class Triangle extends Shape2
{
    double a, b, c;
    boolean flag;

    public Triangle(double a,double b,double c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public void judge()
    {
        if(a>=b+c || b>=a+c || c>=a+b)
        {
            flag=false;
        }else
        {
            flag=true;
        }
    }

    @Override
    void calPerimeter()
    {
        if(flag==true)
        {
            System.out.println("长为"+a+"、"+b+"、"+c+"的3条边能构成三角形，这个三角形的周长为"+(a+b+c));
        }else
        {
            System.out.println("长为"+a+"、"+b+"、"+c+"的3条边不能构成三角形，因为三角形两边之和必须大于第三边");
        }
    }
}

public class TriangleDemo
{
    public static void main(String[] args)
    {
        Triangle t1=new Triangle(3,4,5);
        t1.judge();
        t1.calPerimeter();
        Triangle t2=new Triangle(1,4,5);
        t2.judge();
        t2.calPerimeter();
    }
}
