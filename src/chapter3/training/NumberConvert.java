/*
* 计算商和余数：应用除法运算符可以计算两个数的商，应用取余运算符可以计算两个数相处所得的余数。根据这两个运算符做一个数字转置的练习，将123的各数字
* 顺序前后颠倒后输出。
* */

package chapter3.training;

public class NumberConvert
{
    public static void main(String[] args)
    {
        int number = 123; // 定义所需要的转换的数字
        // 定义三个数字接收number转换后的结果
        int number1;
        int number2;
        int number3;
        number1 = number % 10; // 计算个位数上的余数
        number2 = number / 10 % 10; // 计算十位数上的余数
        number3 = number / 100; // 计算百位数上的余数
        System.out.println(number + "转换后的结果为" + number1 + number2 + number3); // 输出转换后的结果
    }
}
