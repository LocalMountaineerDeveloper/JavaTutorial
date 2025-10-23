/*
* 摄氏度转华氏度
* */

package chapter4.practice;

public class Temperature
{
    public static void main(String[] args)
    {
        int centigrade=-40; // 摄氏度的初始值为-40
        double fahrenheit; // 华氏度
        do
        {
            centigrade+=10; // 每行间隔10度
            fahrenheit=centigrade*9/5.0+32; // 由摄氏度转为华氏度的公式
            System.out.println("摄氏温度："+centigrade+"℃\t华氏温度："+fahrenheit+"℉");
        }while(centigrade<50);
    }
}