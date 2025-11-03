/*
* 小动物吃东西：编写一个接口，接口中有一个抽象方法，使用lambda表达式创建3个Eatable接口对象，三者执行各自的方法。
* */

package chapter14.training;

interface Eatable
{
    void eat();
}

public class EatDemo
{

    public static void main(String[] args)
    {
        Eatable dog=()->
        {
            System.out.println("小狗爱吃骨头");
        };

        Eatable cat=()->
        {
            System.out.println("小猫爱吃鱼");
        };

        Eatable chick=()->
        {
            System.out.println("小鸡爱吃毛毛虫");
        };

        dog.eat();
        cat.eat();
        chick.eat();
    }

}
