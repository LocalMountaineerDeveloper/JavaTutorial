/*
* 模拟购物车：把3本书放进了购物车，把3本书信息输出，再求出3本书的价格总和。
* */

package chapter12.training;

import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.Iterator;

class Book
{
    private String bookName;
    private String author;
    private double price;

    public Book(String bookName,String author,double price)
    {
        this.bookName=bookName;
        this.author=author;
        this.price=price;
    }

    public double getPrice()
    {
        return price;
    }

    @Override
    public String toString()
    {
        return bookName+"\t"+author+"\t"+price+"元";
    }
}

public class BookInfo
{
    public static void main(String[] args)
    {
        HashSet<Book> shoppingCart=new HashSet<>();
        Book[] books={new Book("《Java从入门到精通（第3版）》","明日科技编著",59.8),
                new Book("《Java从入门到精通（实例版）》","明日科技编著",69.8),
                new Book("《Java Web从入门到精通》","明日科技编著",69.8)};
        shoppingCart.add(books[0]);
        shoppingCart.add(books[1]);
        shoppingCart.add(books[2]);
        Iterator<Book> it=shoppingCart.iterator(); //创建迭代器
        System.out.println("您的购物车里的商品信息：\n书名\t\t\t\t\t\t\t作者（团队）\t\t价格");
        System.out.println("——————————————————————————————————————————————————————————————————————");
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        System.out.println("——————————————————————————————————————————————————————————————————————");
        double sumMoney=books[0].getPrice()+books[1].getPrice()+books[2].getPrice();
        DecimalFormat pattern=new DecimalFormat("##.00");
        String result=pattern.format(sumMoney);
        System.out.println("合计：\t\t\t\t\t\t\t\t"+result+"元\n\t\t\t\t\t\t\t\t\t\t\t→点我去结账");
    }
}
