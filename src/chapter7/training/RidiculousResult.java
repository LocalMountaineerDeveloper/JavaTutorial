/*
* 让猪狗是同类：重写equals()方法，让猪和狗是同类。
* */

package chapter7.training;

class Pig
{
    @Override
    public boolean equals(Object obj)
    {
        return true;
    }
}

class Dog
{
}

public class RidiculousResult
{
    public static void main(String[] args)
    {
        Pig pig=new Pig();
        if(pig.equals(new Dog()))
        {
            System.out.println("猪和狗是同类！！！");
        }else
        {
            System.out.println("猪和狗不是同类。");
        }
    }
}
