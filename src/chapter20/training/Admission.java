/*
* 球员入场：足球比赛开始前，A、B两队的上场球员依次通过球员通道口，每次只能通过一名球员，使用Thread类，模拟球员入场顺序。
* */

package chapter20.training;

public class Admission
{
    public static void main(String[] args)
    {
        System.out.println("A、B两队球员开始入场……");
        A a=new A();
        a.start();
        B b=new B();
        b.start();
    }
}

class A extends Thread
{
    public void run()
    {
        for(int i=1;i<=11;i++)
        {
            System.out.println("a"+i);
        }
    }
}

class B extends Thread
{
    public void run()
    {
        for(int i=1;i<=11;i++)
        {
            System.out.println("b"+i);
        }
    }
}