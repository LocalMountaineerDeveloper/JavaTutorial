/*
* 检索图书（一）：书架上存放着多本书，通过关键字或书名检索出相应的书籍。
* */

package chapter10.practice;

import java.util.Scanner;

public class SearchBook
{// 创建一个SearchBook类

    public static void main(String[] args)
    {
        String books[]={
                "《明史讲义》","《明代社会生活史》","《紫禁城的黄昏》","《中国的黄金时代》",
                "《国史十六讲》","《停滞的帝国》","《唐朝定居指南》","《明史简述》","《明史十讲》",
                "《大明风物志》","《西方眼中的中国》","《皇帝与秀才》"
        };
        Scanner sc=new Scanner(System.in);// 控制台输入
        // 控制台输出提示信息
        System.out.println("请输入您要搜索的书名或关键字：");
        String message=sc.next();// 接收控制台输入的书名或关键字
        // 控制台输出提示信息
        System.out.println("--------------搜索结果--------------");
        for(int i=0;i<books.length;i++)// 遍历数组
        {
            // 判断书名是否包含message
            if(books[i].contains(message))
            {
                // 条件成立时输出搜索结果
                System.out.println(books[i]);
            }
        }
        sc.close();// 关闭控制台输入
    }
}
