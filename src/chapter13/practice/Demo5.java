/*
* 体检记录：创建一个性别枚举，包含男女；一个测试类，有3个泛型，使用这些泛型创建3个成员变量；两个测试类对象，一个对象date，用于记录日期，一个对象
* tom，用于记录人物信息。
* */

package chapter13.practice;

enum Sex
{
    male,female
}

public class Demo5<A,B,C>
{
    A a;
    B b;
    C c;

    public Demo5(A a,B b,C c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }

    @Override
    public String toString()
    {
        return "Demo [a="+a+", b="+b+", c="+c+"]";
    }

    public static void main(String[] args)
    {
        Demo5<Integer,Integer,Integer> date=new Demo5<>(2008,8,8);
        System.out.println(date);
        Demo5<String,Integer,Sex> tom=new Demo5<String,Integer,Sex>("汤姆",175,Sex.male);
        System.out.println(tom);
    }

}
