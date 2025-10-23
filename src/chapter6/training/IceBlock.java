/*
* 买可乐：买可乐默认不加冰块，但可以要求加冰块。
* */

package chapter6.training;

public class IceBlock
{

    public IceBlock()
    {
        System.out.println("商家默认可乐里没有冰块……");
    }

    public IceBlock(String name,int number)
    {
        System.out.println(name+"要求向可乐里放入"+number+"个冰块。");
    }

    public static void main(String[] args)
    {
        IceBlock block=new IceBlock();
        IceBlock iceBlock=new IceBlock("张三",3);
    }
}
