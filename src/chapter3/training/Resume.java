/**
 * 输出个人信息：控制台输出如下所示的个人基本信息。
 */

package chapter3.training;

public class Resume
{
    public static void main(String[] args)
    {
        char family='李';
        char name='四';
        char sex='男';// 性别为男
        int age=25;// 年龄为25岁
        double height=1.76;// 身高为1.76米
        double weight=65.5;// 体重为65.5千克
        boolean marryStatus=false;// 未婚
        System.out.println("\t个人基本信息");
        System.out.println("-------------------------");
        System.out.println("姓名：\t"+family+name);
        System.out.println("性别：\t"+sex);
        System.out.println("年龄：\t"+age);
        System.out.println("身高：\t"+height+"米");
        System.out.println("体重：\t"+weight+"千克");
        System.out.println("是否已婚：\t"+marryStatus);
    }
}
