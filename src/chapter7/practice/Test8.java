/*
* 景区游客人数：创建表示可增加接口Addable，可减少接口Reducible，可变化接口Changeable，其中Changeable同时继承Addable和Reducible，接口
* Changeable中有一个表示均匀变化30个单位的常量UNITS。创建人数类Number，使之实现Changeable。模拟如下场景：某景区只允许满载30人的大巴车进出，
* 当天自景区开放起，已驶入景区的大巴车有7辆，驶出景区的大巴车有4辆，计算景区里还有多少人。
* */

package chapter7.practice;

public class Test8
{
    public static void main(String[] args)
    {
        Number number=new Number();
        for(int i=1;i<=7;i++)
        {
            number.add();
        }
        for(int i=1;i<=4;i++)
        {
            number.reduce();
        }
        number.output();
    }
}
