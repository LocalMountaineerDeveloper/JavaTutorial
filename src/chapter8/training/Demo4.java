/*
* 猫吃鱼，狗吃肉：创建Animal类的匿名子类对象，重写eat()方法，执行该方法后会在控制台打印“猫吃鱼，狗吃肉”的字样。
* */

package chapter8.training;

class Animal
{
    void eat()
    {

    }
}

public class Demo4
{

    public static void main(String[] args)
    {
        Animal a=new Animal()
        {
            void eat()
            {
                System.out.println("猫吃鱼，狗吃肉");
            }
        };
        a.eat();
    }
}
