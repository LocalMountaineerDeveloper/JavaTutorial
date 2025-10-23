/*
* 获得最中间的字符：若字符个数为偶数，则获取中间两个字符中索引值较小的那个。
* */

package chapter10.training;

public class Demo6
{
    public static void main(String[] args)
    {
        String str="012345";
        int length=str.length();
        int index=-1;// 中间字符的索引
        if(length%2==0)
        {
            index=(length-1)/2;
        }else
        {
            index=length/2;
        }
        System.out.println(str.charAt(index));
    }
}