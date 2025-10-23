/*
 * 杨辉三角：使用二维数组实现杨辉三角算法。
 * */

package chapter5.practice;

public class YangHui
{// 杨辉三角算法的实现

    public static void main(String[] args)
    {
        // 定义一个长度为10的二维数组
        int[][] Array_int=new int[10][];
        // 向数组中记录杨辉三角形的值
        for(int i=0;i<Array_int.length;i++)
        {// 遍历行数
            Array_int[i]=new int[i+1];// 定义二维数组的列数
            // 遍历二维数组的列数
            for(int j=0;j<Array_int[i].length;j++)
            {
                if(i<=1)
                {// 如果是数组的前两行
                    Array_int[i][j]=1;// 将其设置为1
                    continue;
                }else
                {
                    // 如果是行首或行尾
                    if(j==0 | j==Array_int[i].length-1)
                        Array_int[i][j]=1;// 将其设置为1
                    else// 根据杨辉算法进行计算
                        Array_int[i][j]=Array_int[i-1][j-1]+Array_int[i-1][j];
                }
            }
        }
        for(int i=0;i<Array_int.length;i++)
        {// 输出杨辉三角
            for(int j=0;j<Array_int[i].length;j++)
                System.out.print(Array_int[i][j]+"\t");
            System.out.println();
        }
    }
}
