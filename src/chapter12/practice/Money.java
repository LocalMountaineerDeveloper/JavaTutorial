/*
* 模拟账户存取款
* */

package chapter12.practice;

import java.util.ArrayList;
import java.util.Iterator;

class Account
{
    String time; //存取款时间
    int in; //存入
    int out; //存出
    static int left=0; //余额

    public Account(String time,int in,int out)
    {
        this.time=time;
        this.in=in;
        this.out=out;
    }

    @Override
    public String toString()
    {
        left+=in-out;
        return time+"\t\t"+in+"\t\t"+out+"\t\t"+left;
    }
}

public class Money
{
    public static void main(String[] args)
    {
        System.out.println("存、取款时间\t\t存入\t\t支出\t\t金额");
        ArrayList<Account> list=new ArrayList<>();
        list.add(new Account("2017-05-06",2000,400));
        list.add(new Account("2017-05-18",250,1000));
        list.add(new Account("2017-06-08",5000,200));
        list.add(new Account("2017-06-23",0,1500));
        list.add(new Account("2017-07-19",3000,4200));
        Iterator<Account> it=list.iterator();
        while(it.hasNext())
        {
            Object message=it.next();
            System.out.println(message+"\t\t");
        }
    }
}
