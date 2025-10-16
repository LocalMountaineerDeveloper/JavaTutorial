/*
* 五颜六色的接口：接口有一个抽象方法
* */

package chapter7.training;

interface Colorful
{
    void shine();
}

class RedLights implements Colorful
{
    @Override
    public void shine()
    {
        System.out.println("红灯亮红光");
    }
}

class YellowLights implements Colorful
{
    @Override
    public void shine()
    {
        System.out.println("黄灯亮黄光");
    }
}

class GreenLights implements Colorful
{
    @Override
    public void shine()
    {
        System.out.println("绿灯亮绿光");
    }
}
