/*
 * 成绩排名（一）：10名学生成绩分别为71,89,67,53,78,64,92,56,74,85，用冒泡排序按照从小到大输出。
 * */

package chapter5.training;

public class Scores
{
    public static void main(String[] args)
    {
        // 创建一个数组，将10名学生的英语竞赛成绩存储在这个数组里
        int[] array={71,89,67,53,78,64,92,56,74,85};
        // 创建分数类的对象
        Scores scores=new Scores();
        // 调用排序方法将数组排序
        scores.sort(array);
    }

    /**
     * 冒泡排序
     *
     * @param array 要排序的数组
     */
    public void sort(int[] array)
    {
        for(int i=1;i<array.length;i++)
        {
            // 比较相邻两个元素，较大的数往后冒泡
            for(int j=0;j<array.length-i;j++)
            {
                if(array[j]>array[j+1])
                {
                    int temp=array[j]; // 把第一个元素值保存到临时变量中
                    array[j]=array[j+1]; // 把第二个元素值保存到第一个元素单元中
                    array[j+1]=temp; // 把临时变量（也就是第一个元素原值）保存到第二个元素中
                }
            }
        }
        showArray(array); // 输出冒泡排序后的数组元素
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
            System.out.print(" >"+i); // 输出每个数组元素的值
        }
        System.out.println();
    }
}