/*
 * 从运行时参数读取用户账号与密码：再Run Configuration的Arguments中输入两个参数，利用main函数参数给程序添加权限判断。
 * */

package chapter6.training;

public class Login
{
    public static void main(String[] args)
    {
        if(args[0].equals("张三") && args[1].equals("123456"))
        {
            System.out.println("开始执行……");
        }else
        {
            System.out.println("您的权限无法运行此程序");
        }
    }
}
