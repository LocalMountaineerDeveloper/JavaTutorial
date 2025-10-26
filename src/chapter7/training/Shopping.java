/*
* 购物车：购买两件及其以上的商品享8折优惠，编写同名pay()方法输出购买不同件商品的应付金额。
* */

package chapter7.training;

import java.util.Scanner;

public class Shopping
{
    public static void main(String[] args)
    {
        double price=580;
        double discount=0.8;
        Scanner sc=new Scanner(System.in);
        System.out.print("输入要购买商品的数量：");
        int number=sc.nextInt();
        sc.close();
        Shopping shopping=new Shopping();
        if(number==1)
        {
            shopping.pay(number,price);
        }else
        {
            shopping.pay(number,price,discount);
        }
    }

    public void pay(int account,double price)
    {
        System.out.println("应付金额："+price+"元。");
    }

    public void pay(int account,double price,double discount)
    {
        System.out.println("应付金额："+(account*price*discount)+"元。");
    }
}
