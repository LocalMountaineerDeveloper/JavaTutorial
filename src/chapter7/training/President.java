package chapter7.training;

public class President extends PublicServant //创建一个President类继承PublicServant
{
    @Override
    public void handleAffairs()
    {//重写handleAffairs()方法
        super.handleAffairs(); //调用父类PublicServant的handleAffairs()方法
        System.out.println("总统掌控方针、政策和方向，处理国内乃至国与国之间的事务。"); //控制台输出
    }
}
