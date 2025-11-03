/*
* 性别枚举：设计一个厕所类，提供一个入口方法，要求男生只能进男厕所，女生只能进女厕所。
* */

package chapter13.practice;

class Toilet<T>
{
    public void enter(T t)
    {

    }
}

class Male
{

}

class Female
{

}

public class Demo2
{
    public static void main(String[] args)
    {
        Toilet<Male> mansroom=new Toilet();
        Toilet<Female> womansroom=new Toilet();
    }
}
