/*
 * 总统是不是公务员
 * */

package chapter7.training;

public class Test8
{// 创建一个Test类

    public static void main(String[] args)
    {
        President president=new President(); // 创建president对象
        president.appellation="总统"; // 初始化“职称”
        president.age=55; // 初始化“年龄”
        if(president instanceof PublicServant)// 判断总统是否为公务员
            president.handleAffairs(); // president对象调用handleAffairs()方法
    }
}

