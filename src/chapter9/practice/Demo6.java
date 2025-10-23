/*
* 校验年龄格式：年龄不能输入小数
* */

package chapter9.practice;

import java.util.Scanner;

public class Demo6
{

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        boolean flag=true;
        while(flag)
        {
            try
            {
                System.out.println("请输入姓名：");
                String name=sc.nextLine();
                System.out.println("请输入年龄：");
                int age=Integer.parseInt(sc.nextLine());
                System.out.println("个人信息录入成功！请核对：\n姓名："+name+"\t年龄："+age);
                flag=false;
            }catch(NumberFormatException e)
            {
                e.printStackTrace();
                System.err.println("您输入的不是有效年龄，请重新输入");
            }finally
            {
                sc.reset();
            }
        }
    }
}