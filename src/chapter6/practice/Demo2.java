package chapter6.practice;

public class Demo2
{
    public static void main(String[] args)
    {
        new Demo().setNumber();
        //new SingleInstance(); //单例模式的类无法被其他类通过构造方法创建，只能通过该类提供的getInstance()静态方法获得该类对象
        SingleInstance s=SingleInstance.getInstance();
        System.out.println(s.num);
        s.num=34;
        System.out.println(s.num);
        s=SingleInstance.getInstance();
        System.out.println(s.num);
    }
}
