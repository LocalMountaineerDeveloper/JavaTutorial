package chapter7.training;

public class HandCar extends Car //创建一个HandCar类继承Car
{
    @Override
    public void stepOnGas() //重写父类Car的stepOnGas()方法（踩油门）
    {
        System.out.println("右脚踩油门踏板！"); //控制台输出
    }

    @Override
    public void stepOnBrake() //重写父类Car的stepOnBrake()方法（踩刹车）
    {
        System.out.println("右脚踩刹车踏板！"); //控制台输出
    }

    public void stepOnClutch() //创建一个普通的stepOnClutch()方法（踩离合）
    {
        System.out.println("左脚踩离合器踏板！"); //控制台输出
    }
}
