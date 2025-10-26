/*
* 无重复组合：在控制台输出由4,5,6,7能组成多少个互不相同且无重复数字的三位数。
* */

package chapter4.practice;

public class RepeatNumber
{
    public static void main(String[] args)
    {
        int bai=0; // 百位上的数字
        int shi=0; // 十位上的数字
        int ge=0; // 个位上的数字
        int number=0; // 数字的个数
        for(bai=4;bai<=7;bai++)
        {
            for(shi=4;shi<=7;shi++)
            {
                for(ge=4;ge<=7;ge++)
                {
                    if(bai!=shi && shi!=ge && bai!=ge)
                    {
                        number+=1;
                        System.out.println(bai*100+shi*10+ge);
                    }
                }
            }
        }
        System.out.println("总共能够组成"+number+"个数字！");
    }
}