/*
* 大写转小写：编写同名print()方法，一个方法输出在ASCII表中这个整数对应的大写字母，另一个输出这个大写字母对应的小写字母。
* */

package chapter7.training;

public class DaXiaoXie
{
    public static void main(String[] args)
    {
        int i=66;
        DaXiaoXie dxx=new DaXiaoXie();
        dxx.print(i,(char)i);
        dxx.print((char)i,i);
    }

    public void print(int i,char c)
    {
        System.out.println("在ASCII表中，"+i+"对应的大写字母是"+c+"。");
    }

    public void print(char c,int i)
    {
        System.out.println(c+"的小写字母是"+(char)(i+32)+"。");
    }
}
