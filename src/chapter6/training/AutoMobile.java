/*
* 汽车加油：汽车油箱30L，剩余6L，加油站每5秒加油2L，在控制台输出加油过程和加油时间。
* */

package chapter6.training;

public class AutoMobile
{
    public AutoMobile(int oilVolume,int leftOilVolume)
    {
        int addOilVolume=oilVolume-leftOilVolume;
        double time=0;
        System.out.println("即将加满油箱……");
        while(addOilVolume>0)
        {
            System.out.println("还剩余"+addOilVolume+"L，已耗时"+time+"秒。");
            if(addOilVolume<2)
            {
                time+=addOilVolume/(2.0/5);
                addOilVolume=0;
            }else
            {
                addOilVolume-=2;
                time+=5;
            }
        }
        System.out.println("还剩余"+addOilVolume+"L，已耗时"+time+"秒。");
    }

    public static void main(String[] args)
    {
        AutoMobile am=new AutoMobile(30,5);
    }
}
