/*
 * 单例模式：一个类无法被其他类通过构造方法创建对象，只能通过该类提供的getInstance()静态方法获得该类对象。
 * */

package chapter6.practice;

public class SingleInstance
{
    int num;

    private SingleInstance()
    {
        num=100;
    }

    public static SingleInstance getInstance()
    {
        return new SingleInstance();
    }
}
