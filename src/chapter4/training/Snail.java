/*
* 蜗牛爬井：有一口井，深10米，一只蜗牛从井底向井口爬，白天向上爬2米，晚上下滑1米，问多少天可以爬到井口？
* */

package chapter4.training;

public class Snail
{
    public static void main(String[] args)
    {
        int distance=0;
        int day=1;
        while(true)
        {
            distance+=2;
            if(distance>=10)
            {
                break;
            }
            distance-=1;
            day++;
        }
        System.out.println("蜗牛第"+day+"天爬到了井口。");
    }
}
