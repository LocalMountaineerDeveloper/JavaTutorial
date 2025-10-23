/*
* USB/TypeC充电接口：创建表示USB充电接口USBRechargeable和TypeC充电接口TypeCRechargeable，都有一个表示充电的抽象方法charge()。接着创建
* 汽车类Car，使之同时实现之前两个接口，最后创建测试类，并在控制台输出。
* */
package chapter7.practice;

public class Test7
{
    public static void main(String[] args)
    {
        Car car=new Car();
        car.charge();
    }
}
