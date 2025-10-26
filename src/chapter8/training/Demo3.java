/*
* 让心脏成为内部类：创建一个人类，人类中包含一个内部类——心脏类。当人类执行走路方法时，心脏方法也会同时执行。
* */

package chapter8.training;

class Human
{
    Heart heart=new Heart();

    class Heart
    {
        void beating()
        {
            System.out.println("心脏跳动");
        }
    }

    void walk()
    {
        System.out.println("人在走路");
        heart.beating();
    }
}

public class Demo3
{
    public static void main(String[] args)
    {
        Human tom=new Human();
        tom.walk();
    }
}
