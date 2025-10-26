/*
* 检索图书（二）：两个书柜，一个书柜依次有5本书，另一个也依次有5本书，通过关键字或书名检索出相应书籍时输出书名及书的位置。
* */

package chapter10.practice;

import java.util.Scanner;

public class Bookshelf
{
    public static void main(String[] args)
    {
        String books[][]={// 初始化一个String类型的二维数组
                {"《Java》","《Java Web》","《C语言》","《C++》","《Linux C》"},
                {"《论语》","《资治通鉴》","《四十二章经》","《史记》","《隋唐史》"}
        };
        Scanner sc=new Scanner(System.in);// 控制台输入
        // 控制台输出提示信息
        System.out.println("请输入您要搜索的书名或关键字：");
        String message=sc.next();// 接收控制台输入的书名或关键字
        // 控制台输出提示信息
        System.out.println("--------------搜索结果--------------");
        for(int i=0;i<books.length;i++)// 遍历数组
        {
            for(int j=0;j<books[i].length;j++)
            {
                // 判断书名是否包含message
                if(books[i][j].contains(message) ||
                        // 判断去掉大小写的书名是否包含message
                        books[i][j].toLowerCase().contains(message))
                {
                    // 条件成立时输出被搜索的书的位置
                    System.out.println(books[i][j]+"："+
                            "第"+(i+1)+"个书柜里的第"+(j+1)+"本书");
                }
            }
            System.out.println();// 换行
        }
        sc.close();// 关闭控制台输入
    }
}
