/*
* 客车售票程序：共有10万张票，用不同线程购票，优先级从高到低依次是军人、老年人、儿童、普通成人。
* */

package chapter20.training;

class Cust extends Thread
{
    String name;

    public Cust(String name,int priority)
    {
        super();
        this.name=name;
        setPriority(priority);
    }

    @Override
    public void run()
    {
        int count=0;
        while(Ticket.sell())
        {
            count++;
            System.out.println("一名"+name+"买到车票，共有"+count+"个"+name+"买到车票。");
        }
    }

}

public class Ticket
{
    static int count=100000;

    public static synchronized boolean sell()
    {
        if(count==0)
        {
            return false;
        }else
        {
            count--;
            return true;
        }
    }

    public static void main(String[] args)
    {
        new Cust("军人",10).start();
        new Cust("老人",7).start();
        new Cust("儿童",5).start();
        new Cust("成人",3).start();
    }
}
