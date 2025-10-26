/*
* 吃水果：创建一个抽象的水果类，类中有一个获取水果名称的抽象方法。创建人类，人类有个吃的方法，参数类型为水果类型，并可以在控制台打印吃了什么，请用
* 匿名类创建吃方法的参数，让人类吃苹果和香蕉。
* */

package chapter8.practice;

abstract class Fruits
{
    public abstract String getName();

}

class Human
{
    void eat(Fruits food)
    {
        System.out.println("吃了一个"+food.getName());
    }
}

public class Demo
{
    public static void main(String[] args)
    {
        Human tom=new Human();
        tom.eat(new Fruits()
        {
            public String getName()
            {
                return "苹果";
            }
        });
        tom.eat(new Fruits()
        {
            public String getName()
            {
                return "香蕉";
            }
        });
    }
}
