/*
* 计算阶乘：通过Faction接口创建一个匿名方法，该方法可以返回整数的阶乘结果。
* */

package chapter14.practice;

import java.util.function.Function;

public class Factoril
{
    Function<Long,Long> factoril=n->
    {
        long result=1;
        for(int i=1;i<=n;++i)
        {
            result*=i;
        }
        return result;
    };

    public static void main(String[] args)
    {
        Factoril f=new Factoril();
        System.out.println(f.factoril.apply((long) 10L));
    }
}
