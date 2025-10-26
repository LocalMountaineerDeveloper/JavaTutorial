/*
 * 厘米与英寸互转
 * */

package chapter6.practice;

public class Length
{
    static double ratio=2.54; // 厘米与英寸之间的转换系数

    public static double transferCM(double cm)
    { // “厘米转换为英寸”的方法
        double inch=cm/ratio;
        return inch;
    }

    public static double transferINCH(double inch)
    { // “英寸转换为厘米”的方法
        double cm=inch*ratio;
        return cm;
    }

    public static void main(String[] args)
    {
        System.out.println("10厘米转成英寸的结果为："+transferCM(10));
        System.out.println("10英寸米转成厘米的结果为："+transferINCH(10));
    }
}
