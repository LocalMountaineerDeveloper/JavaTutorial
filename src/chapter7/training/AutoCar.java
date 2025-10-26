package chapter7.training;

public class AutoCar extends Car //创建一个AutoCar类继承Car
{
    @Override
    public void stepOnGas() //重写父类Car的stepOnGas()方法
    {
        System.out.println("右脚踩油门踏板！"); //控制台输出
    }

    @Override
    public void stepOnBrake() //重写父类Car的stepOnBrake()方法
    {
        System.out.println("右脚踩刹车踏板！"); //控制台输出
    }
}
