/*
 * 话费充值：向手机中充值10元，通话0.2元/分钟，通话时长已有30分钟；流量已使用10MB，流量费用为0.3元/M。计算话费余额还可以通话的时长。
 * */

package chapter3.training;

public class CountPhoneCharge
{
    public static void main(String[] args)
    {
        double phonecharge=10; // 当前话费
        double communtime; // 通话时间
        double flux=10; // 使用10M流量
        double fluxCost=flux*0.3; // 10M流量的费用
        double communcost=0.2; // 通话0.2元/分钟
        double commuCost=30*communcost;
        communtime=(phonecharge-fluxCost-commuCost)/communcost; // 计算剩余通话时间
        System.out.println("话费余额可通话时长为"+communtime+"分钟");
    }
}

