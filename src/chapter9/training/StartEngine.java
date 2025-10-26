/*
* 没带车钥匙：使用throws关键字模拟，没带车钥匙引发了NullPointerException
* */

package chapter9.training;

public class StartEngine
{
    static void start() throws NullPointerException
    {
        Object key=null;
        key.toString();
    }

    public static void main(String[] args)
    {
        try
        {
            start();
        }catch(Exception e)
        {
            System.out.println("车钥匙忘带了！车暂时是启动不了了……");
        }finally
        {
            System.out.println("去取车钥匙吧T_T");
        }
    }
}
