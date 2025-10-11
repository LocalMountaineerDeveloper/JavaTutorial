/*
 * 矩阵转置：交换二维数组的行与列数据。
 * */

package chapter5.practice;

public class SwapRC
{// 交换二维数组的行列数据

    public static void main(String[] args)
    {
        int i, j;// 定义两个变量，分别用来作为行和列的循环变量
        // 初始化一个静态的int型二维数组
        int[][] array={{8,75,23},{21,55,34},{15,23,20}};
        System.out.println("—————原始数组—————");// 提示信息
        // 遍历原始的二维数组
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(array[i][j]+"\t");// 输出原始数组中的元素
            }
            System.out.println();// 换行
        }
        int temp;// 临时变量
        // 通过循环调换元素的位置
        for(i=0;i<3;i++)
        {
            for(j=0;j<i;j++)
            {
                temp=array[i][j];// 把数组元素赋给临时变量
                // 交换行列数据
                array[i][j]=array[j][i];
                array[j][i]=temp;
            }
        }
        System.out.println("——调换位置之后的数组——");// 提示信息
        // 遍历调换位置之后的二维数组
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(array[i][j]+"\t");// 输出调换位置后的数组元素
            }
            System.out.println();// 换行
        }
    }
}
