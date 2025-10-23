/*
* 百钱买百鸡：5钱买一只公鸡，3钱买一只母鸡，1钱买3只雏鸡，正好花费一百钱买一百只鸡，公鸡、母鸡、雏鸡各多少只？
* */

package chapter4.practice;

public class BuyChicken
{// 百钱买百鸡

    public static void main(String[] args)
    {
        int cock, hen, chick;// 公鸡、母鸡、小鸡
        for(cock=0;cock<=20;cock++)
        {// 最多买20只公鸡
            for(hen=0;hen<=33;hen++)
            {// 最多买33只母鸡
                for(chick=3;chick<=99;chick+=3)
                {// 最多买99只小鸡（有“百鸡”的限制）
                    if(5*cock+3*hen+chick/3==100)
                    {// 百钱
                        if(cock+hen+chick==100)
                        {// 百鸡
                            System.out.println("公鸡："+cock+"\t母鸡："+hen+"\t小鸡："+chick);
                        }
                    }
                }
            }
        }
    }
}
