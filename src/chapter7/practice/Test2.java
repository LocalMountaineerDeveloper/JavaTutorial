/*
* 创建昆虫类：创建一个飞行接口Flyable，接口有一个抽象方法fly()。然后创建一个抽象的昆虫类Insect，有一个有参的构造方法，还有一个表示繁殖的抽象方
* 法reproduce()。接着创建一个苍蝇类，继承昆虫类，并实现接口Flyable。最后创建测试类，输出内容。
* */

package chapter7.practice;

public class Test2
{
    public static void main(String[] args)
    {
        Fly fly=new Fly(6);
        fly.fly();
        fly.reproduce();
    }
}
