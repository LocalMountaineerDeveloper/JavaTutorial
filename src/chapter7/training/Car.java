package chapter7.training;

public class Car //创建一个Car类
{
    public int pedalAuto=2; //定义一个用public修饰的成员变量“自动挡汽车的踏板数”，并初始化
    public int pedalHand=3; //定义一个用public修饰的成员变量“手动挡汽车的踏板数”，并初始化

    public void stepOnGas() //创建一个普通的方法stepOnGas()
    {
        System.out.println("油门踏板"); //控制台输出
    }

    public void stepOnBrake() //创建一个普通的方法stepOnBrake()
    {
        System.out.println("刹车踏板"); //控制台输出
    }
}
