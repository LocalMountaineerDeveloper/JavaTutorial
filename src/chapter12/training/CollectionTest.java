package chapter12.training;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionTest
{
    public static void main(String[] args)
    {
        Collection westList=new ArrayList(); //用ArrayList实现Collection接口
        westList.add("唐僧"); //用add()方法向集合添加数据
        westList.add("孙悟空");
        westList.add("八戒");
        westList.add("沙和尚");
        westList.add("李逵");
        System.out.println("添加元素的顺序："+westList); //输出集合westList
        System.out.println("控制台输出元素的顺序：");
        Iterator it=westList.iterator(); //创建迭代器
        while(it.hasNext())
        { //判断集合中是否还有元素
            Object element=it.next();
            System.out.print(element+" "); //输出集合中的元素
        }
        System.out.println();
        Collection books=new HashSet(); //用HashSet实现Collection接口
        books.add("《三国演义》");
        books.add("《西游记》");
        books.add("《水浒传》");
        books.add("《红楼梦》");
        System.out.println("添加元素的顺序："+books);
        System.out.println("控制台输出元素的顺序：");
        Iterator iter=books.iterator();
        while(iter.hasNext())
        {
            Object element=iter.next();
            System.out.print(element+" ");
        }
    }
}
