/*
 * 匿名类实现小狗跑：创建Moveable接口的匿名子类对象，重写run()方法，执行该方法后会在控制台打印“小狗向前跑”字样
 * */

package chapter8.practice;

interface Moveable
{
    void run();
}

public class Demo4
{

    public static void main(String[] args)
    {
        Moveable dog=new Moveable()
        {
            public void run()
            {
                System.out.println("小狗向前跑");
            }
        };
        dog.run();
    }
}
