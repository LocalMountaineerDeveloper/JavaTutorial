/*
 * 鸡蛋装箱（一）：10个包装箱，每箱原计划装60个鸡蛋，现每箱少装了2个，体现该过程。
 * */

package chapter5.training;

import java.util.Arrays;

public class EggsPackaged
{
    public static void main(String[] args)
    {
        int[] boxes=new int[10];
        Arrays.fill(boxes,58);
        for(int i=0;i<boxes.length;i++)
        {
            System.out.println("第"+(i+1)+"箱装了"+boxes[i]+"枚鸡蛋");
        }
    }
}
