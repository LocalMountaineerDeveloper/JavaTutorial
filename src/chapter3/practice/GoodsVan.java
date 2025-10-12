/*
 * 货车装箱子：一辆货车运输箱子，载货区宽2米、长4米，一个箱子宽1.5米、长1.5米，请问载货区一层可以放多少箱子？
 * */

package chapter3.practice;

public class GoodsVan
{
    public static void main(String[] args)
    {
        int vanWidth=2;
        int vanLength=4;
        double boxWidth=1.5;
        double boxLength=1.5;
        int boxNumber=(int)(vanWidth/boxWidth)*(int)(vanLength/boxLength);
        System.out.println("载货区一层可以放"+boxNumber+"箱子！");
    }
}
