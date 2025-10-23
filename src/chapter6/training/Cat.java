/*
 * 创建猫类
 * */

package chapter6.training;

public class Cat
{
    String color;

    public Cat(String color)
    {
        this.color=color;
    }

    public void catchMice()
    {
        System.out.println(color+"猫去抓老鼠了……");
    }

    public static void main(String[] args)
    {
        Cat black=new Cat("黑");
        black.catchMice();
        Cat white=new Cat("白");
        white.catchMice();
        Cat yellow=new Cat("黄");
        yellow.catchMice();
    }
}