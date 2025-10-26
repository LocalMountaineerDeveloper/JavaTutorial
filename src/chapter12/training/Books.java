/*
* 给图书排序：书架上有两本书《西游记》和《水浒传》，书桌上有3本书《三国演义》、《莎士比亚诗选》和《红楼梦》，现要将四大名著按照《水浒传》《三国演义》
* 《西游记》《红楼梦》的顺序排在一起。
* */

package chapter12.training;

import java.util.ArrayList;
import java.util.List;

public class Books
{
    public static void main(String[] args)
    {
        List<String> shelf=new ArrayList<>();
        shelf.add("《三国演义》");
        shelf.add("《莎士比亚诗选》");
        shelf.add("《红楼梦》");
        System.out.println("书架上的书籍："+shelf);
        List<String> desk=new ArrayList<>();
        desk.add("《西游记》");
        desk.add("《水浒传》");
        System.out.println("书桌上的书籍："+desk);
        System.out.println("\n现在开始整理四大名著……\n");
        shelf.add(0,desk.get(1)); //在集合shelf的索引为0的位置上，添加集合desk中索引为1的元素
        shelf.set(2,desk.get(0)); //把集合shelf索引为2的元素替换为集合desk中索引为0的元素
        System.out.println("中国的四大名著分别是：");
        for(int i=0;i<shelf.size();++i)
        {
            System.out.print(shelf.get(i)+" ");
        }
    }
}
