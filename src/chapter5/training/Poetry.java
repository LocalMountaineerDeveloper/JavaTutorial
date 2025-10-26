/*
 * 输出古诗：用横板和竖版两种方式输出古诗。
 * */

package chapter5.training;

public class Poetry
{
    public static void main(String[] args)
    {
        char arr[][]=new char[4][]; // 创建一个4行的二维数组
        arr[0]=new char[]{'春','眠','不','觉','晓'}; // 为每一行赋值
        arr[1]=new char[]{'处','处','闻','啼','鸟'};
        arr[2]=new char[]{'夜','来','风','语','声'};
        arr[3]=new char[]{'花','落','知','多','少'};
        /* 横版输出 */
        System.out.println("-----横版-----");
        for(int i=0;i<4;i++)
        { // 循环4行
            for(int j=0;j<5;j++)
            { // 循环5列
                System.out.print(arr[i][j]); // 输出数组中的元素
            }
            if(i%2==0)
            {
                System.out.println(","); // 如果是一、三句，输出逗号
            }else
            {
                System.out.println("。"); // 如果是二、四句，输出句号
            }
        }
        /* 竖版输出 */
        System.out.println("\n-----竖版-----");
        for(int j=0;j<5;j++)
        { // 列变行
            for(int i=3;i>=0;i--)
            { // 行变列，反序输出
                System.out.print(arr[i][j]); // 输出数组中的元素
            }
            System.out.println(); // 换行
        }
        System.out.println("。，。，"); // 输出最后的标点
    }
}