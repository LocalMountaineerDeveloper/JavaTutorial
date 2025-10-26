/*
* 剧院售票：某剧院发售门票，演播厅观众席有4行，每行10个座位。在发售门票时，屏蔽掉最左一列和最右一列的作为。现模拟售票过程。
* */

package chapter4.training;

public class SellSeats
{
    public static void main(String[] args)
    {
        System.out.println("剧院可售座位信息：");
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=10;j++)
            {
                if(j==1 || j==10)
                {
                    continue;
                }else
                {
                    System.out.println("第"+i+"排，第 "+j+"列可售");
                }
            }
        }
    }
}
