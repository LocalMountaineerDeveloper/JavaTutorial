/*
* 通道提示：创建一个通道类，类中有一个入口方法，若顾客进入通道会提示“顾客您好，小心地滑”，员工进入通道没有任何提示。创建员工和公共两个通道对象，
* 顾客不能进入员工通道。
* */

package chapter13.practice;

class Entrance<T>
{
    public void enter(T t)
    {
        if(t instanceof Customer)
        {
            System.out.println("顾客您好，小心地滑");
        }
    }
}

class Customer
{

}

class Staff
{

}

public class Demo3
{
    public static void main(String[] args)
    {
        Staff tom=new Staff();
        Customer mali=new Customer();
        Entrance<Staff> staffEntrance=new Entrance();
        staffEntrance.enter(tom);
        Entrance publicEntrance=new Entrance();
        publicEntrance.enter(tom);
        publicEntrance.enter(mali);
    }
}
