/*
 * 成绩排名（二）：接续Scores.java描述，从大到小输出成绩。
 * */

package chapter5.training;

import java.util.Arrays;

public class ReverseScores
{
    public static void main(String[] args)
    {
        // 创建一个数组，将10名学生的英语竞赛成绩存储在这个数组里
        int[] array={71,89,67,53,78,64,92,56,74,85};
        // 创建反转排序类的对象
        ReverseScores reScores=new ReverseScores();
        // 调用排序对象的方法，将数组反转
        reScores.sort(array);
    }

    /**
     * 反转排序
     *
     * @param array 要排序的数组
     */
    public void sort(int[] array)
    {
        Arrays.sort(array);
        int temp;
        int len=array.length;
        for(int i=0;i<len/2;i++)
        {
            temp=array[i];
            array[i]=array[len-1-i];
            array[len-1-i]=temp;
        }
        System.out.println("这10名学生的英语竞赛成绩由大到小进行排序后的结果如下所示：");
        showArray(array); // 输出排序后的数组元素
    }

    /**
     * 显示数组中的所有元素
     *
     * @param array 要显示的数组
     */
    public void showArray(int[] array)
    {
        for(int i : array)
        { // 遍历数组
            System.out.print("\t"+i); // 输出每个数组元素值
        }
        System.out.println();
    }
}
