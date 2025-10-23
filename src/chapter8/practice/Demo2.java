/*
 * 跳动的心脏：创建一个人类，把心脏类设计为人类里面的一个成员内部类，心脏类有一个跳动的方法，在一个人类创建时，心脏就开始不断地跳动。
 * */

package chapter8.practice;

class People
{                     // 人类
    final Heart heart=new Heart();     // 心脏属性

    public People()
    {                     // 构造人类对象
        heart.beating();                  // 心脏开始跳动
    }

    class Heart
    {                         // 人类内部的心脏类
        public void beating()
        {          // 跳动
            System.out.println("心脏：扑通扑通……");
        }
    }
}

public class Demo2
{
    public static void main(String[] args)
    {
        new People();
    }
}
