/*
* 权限设置：模拟明日学院的权限设置模块，不同角色有不同的权限。
* */

package chapter13.practice;

import java.util.Scanner;

public class PermitEnum
{ // 创建一个PermitEnum（权限）类
    enum POP
    {
        TOURIST,USER,VIP,MANAGER; // 把常量放置在枚举类型Identity（身份）中

        public static POP getPop(int id)
        {// 定义一个静态方法，用来根据输入获取对应POP枚举值
            switch(id)
            {
                case 0:
                    return POP.TOURIST;
                case 1:
                    return POP.USER;
                case 2:
                    return POP.VIP;
                case 3:
                    return POP.MANAGER;
                default:
                    return POP.TOURIST;
            }
        }
    }

    public static void main(String[] args)
    {
        System.out.print("Welcome to 明日学院！\n\n请输入您的身份\n（0表示游客，1表示注册用户，2表示VIP会员，3表示管理员）："); // 提示信息
        Scanner sc=new Scanner(System.in); // 控制台输入
        POP pop=POP.getPop((int)sc.nextInt());// 根据输入获取枚举值
        switch(pop)
        { // 多分支语句
            case TOURIST: // 登录人的身份是“游客”时，输出“游客”的权限
                System.out.println("您现在是“游客”，可享有的权限如下：\n观看部分视频、浏览所有课程、注册、登录！");
                break;
            case USER: // 登录人的身份是“注册用户”时，输出“注册用户”的权限
                System.out.println("您已成为注册用户，可享有的权限如下：\n免费观看所有视频、部分配套习题、收藏课程、实时提问、个人设置！");
                break;
            case VIP: // 登录人的身份是“VIP会员”时，输出“VIP会员”的权限
                System.out.println("您已成为VIP会员，可享有的权限如下：\n免费观看所有视频、所有习题及答案、源码下载、定期在线互动交流！");
                break;
            case MANAGER: // 登录人的身份是“管理员”时，输出“管理员”的权限
                System.out.println("您是大BOSS，拥有本站所有权限：\n后台所有管理模块、前台所有功能模块！");
                break;
        }
        sc.close(); // 关闭控制台输入
    }
}
