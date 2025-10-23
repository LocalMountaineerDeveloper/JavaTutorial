/*
* 校验密码复杂程度：密码需8~20位，至少包含小写字母、大写字母、数字中的任意两种。
* */

package chapter10.training;

public class Demo12
{
    public static void main(String[] args)
    {
        String str="dave1234";
        if(check(str))
        {
            System.out.println("此密码符合要求！");
        }else
        {
            System.out.println("请按要求重新设置密码……");
        }
    }

    public static boolean check(String str)
    {
        // 判断输入的密码是否出现规定以外的字符
        if(!str.matches("[a-zA-Z0-9]{8,20}"))
            return false;

        // 记录出现几种字符
        int count=0;

        // 如果出现小写字母
        if(str.matches(".*[a-z].*"))
            count++;
        // 如果出现大写字母
        if(str.matches(".*[A-Z].*"))
            count++;
        // 如果出现数字
        if(str.matches(".*[0-9].*"))
            count++;
        // 如果count < 2
        if(count<2)
        {
            System.out.println("密码错误！");
            return false;
        }else
            return true;
    }
}