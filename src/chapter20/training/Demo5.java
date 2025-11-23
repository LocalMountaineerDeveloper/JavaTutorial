/*
* 让兔子跑更快：创建乌龟和兔子两个线程，让兔子线程的优先级高于乌龟线程，让乌龟先启动，看谁先完成。
* */

package chapter20.training;

class Rabbit extends Thread
{
    public Rabbit()
    {
        setPriority(10);
    }

    public void run()
    {
        String tmp="";
        for(int i=0;i<50000;i++)
        {
            tmp+=i;
        }
        System.out.println("兔子完成");
    }
}

class Tortoise extends Thread
{
    public Tortoise()
    {
        setPriority(1);
    }

    public void run()
    {
        String tmp="";
        for(int i=0;i<50000;i++)
        {
            tmp+=i;
        }
        System.out.println("乌龟完成");
    }
}

public class Demo5
{
    public static void main(String[] args)
    {
        new Tortoise().start();
        new Rabbit().start();
    }
}
