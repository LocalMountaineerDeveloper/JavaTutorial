/*
* 3种形式创建字符串
* */

package chapter10.training;

public class Demo1
{
    public static void main(String[] args)
    {
        String str1="要么你主宰生活，要么你被生活主宰。——吉姆·罗恩";
        String str2=new String("要么你主宰生活，要么你被生活主宰。——吉姆·罗恩");
        String str3=String.valueOf("要么你主宰生活，要么你被生活主宰。——吉姆·罗恩");
    }
};