/*
* 创建猫类：创建Cat类，包含各种属性，重写toString()方法
* */

package chapter7.practice;

import java.awt.Color;

public class Test1
{
    public static void main(String[] args)
    {
        Cat cat1=new Cat("Java",12,21,Color.BLACK); // 创建猫咪1号
        Cat cat2=new Cat("C++",12,21,Color.WHITE); // 创建猫咪2号
        Cat cat3=new Cat("Java",12,21,Color.BLACK); // 创建猫咪3号
        System.out.println("猫咪1号："+cat1); // 输出猫咪1号
        System.out.println("猫咪2号："+cat2); // 输出猫咪2号
        System.out.println("猫咪3号："+cat3); // 输出猫咪3号
    }
}
