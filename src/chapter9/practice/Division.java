/*
* 除数不能为零
* */

package chapter9.practice;

public class Division
{ // 创建一个Division类
    static int num1=25; // 初始化“被除数”
    static int num2=0; // 初始化“除数”
    static int result; // 声明“结果”

    public static void division() throws ArithmeticException
    {
        result=num1/num2; // 为“结果”赋值
    }

    public static void main(String[] args)
    {
        try
        { // try块
            division();
        }catch(ArithmeticException ae)
        { // catch块
            System.out.println("小学生都笑哭了：除数不能是0！！！");
        }
    }
}
