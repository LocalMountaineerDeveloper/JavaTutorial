/*
 * 购买电影票：购买电影票，满18岁付40原，未满18岁半价。
 * */

package chapter6.practice;

public class Audience
{
    String name; //姓名
    int age; //年龄

    public Audience(String name,int age)
    {
        this.name=name;
        this.age=age;
    }

    public void buyTicket()
    { //购票方法
        if(this.age>=18)
        { //观众已满18周岁
            System.out.println(name+"\t\t"+age+"\t\t"+40);
        }else
        {//观众未满18周岁
            System.out.println(name+"\t\t"+age+"\t\t"+40/2);
        }
    }

    public static void main(String[] args)
    {
        System.out.println("姓名\t\t年龄\t\t票价(元)");
        System.out.println("———————————————————————————————————————");

        Audience audience1=new Audience("李明",20); //李明，20岁
        audience1.buyTicket(); //李明购票

        Audience audience2=new Audience("钱丽",16); //钱丽， 16岁
        audience2.buyTicket(); //钱丽购票

        Audience audience3=new Audience("周刚",8); //周刚， 8岁
        audience3.buyTicket(); //周刚购票

        Audience audience4=new Audience("吴红",32); //吴红，32岁
        audience4.buyTicket(); //吴红购票
    }
}
