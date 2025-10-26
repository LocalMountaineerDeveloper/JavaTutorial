/*
* 鸡是不是鸟
* */

package chapter7.training;

class Life
{
    public void live()
    {
        System.out.println("生命可以活着。");
    }
}

class Bird extends Life
{
    public void fly()
    {
        System.out.println("鸟类都会飞么？");
    }
}

public class Chicken extends Bird
{
    @Override
    public void fly()
    {
        System.out.println("鸡就不会飞！");
    }

    public static void main(String[] args)
    {
        Chicken chicken=new Chicken();
        System.out.println("鸡是否属于鸟类？");
        if(chicken instanceof Bird)
        {
            System.out.println("鸡属于鸟类。");
            Bird bird=new Bird();
            bird.fly();
            chicken.fly();
        }else
        {
            System.out.println("鸡不属于鸟类！！！");
        }


        Life chicken1=new Chicken();
        System.out.println("鸡是否属于生命类？");
        if(chicken instanceof Life)
        {
            System.out.println("鸡属于生命类。");
            Life life=new Life();
            life.live();
            System.out.println("接下来活着的是一只鸡：");
            chicken1.live();
        }else
        {
            System.out.println("鸡不属于生命类！！！");
        }
    }
}
