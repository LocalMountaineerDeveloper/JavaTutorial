/*
* 拼接古诗：用3种方法拼接古诗。
* */

package chapter10.training;

public class Demo4
{
    public static void main(String[] args)
    {
        String str1="白日依山尽"+"，"+"黄河入海流"+"。";
        System.out.println(str1);

        String str2="白日依山尽";
        str2+="，";
        str2+="黄河入海流";
        str2+="。";
        System.out.println(str2);

        String str3="白日依山尽";
        str3=str3.concat("，");
        str3=str3.concat("黄河入海流");
        str3=str3.concat("。");
        System.out.println(str3);
    }
}