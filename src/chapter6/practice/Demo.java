/*
 * 多种权限的工具类
 * */

package chapter6.practice;

public class Demo
{
    public void getRandomNumber()
    {
        System.out.println("getRandomNumber()权限为public，可以被所有类使用。");
    }

    void setNumber()
    {
        System.out.println("setNumber()权限为default，可以被同包下的类使用。");
    }

    private void sort()
    {
        System.out.println("sort()权限为private，只能自己使用。");
    }

    public static void main(String[] args)
    {
        new Demo().sort();
    }
}
