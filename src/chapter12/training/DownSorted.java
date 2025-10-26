/*
* 使用TreeSet类排序：实现定制排序（降序）
* */

package chapter12.training;

import java.util.TreeSet;

class Down implements Comparable
{ //创建一个Down（降序）类实现Comparable接口
    int number;

    public Down(int number)
    { //创建有参构造方法
        this.number=number;
    }

    @Override
    public String toString()
    {
        return "number="+number;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(this==obj)
        {
            return true;
        }
        if(obj!=null && obj.getClass()==Down.class)
        { //当obj不为null且obj与Down这两个类的类型相同时
            Down down=(Down)obj; //通过类型转换，将obj转换为Down对象
            return down.number==this.number;
        }
        return false; //以上条件都不成立时返回false
    }

    @Override
    public int compareTo(Object obj)
    {
        Down down=(Down)obj;
        if(number>down.number)
        {
            return 1;
        }else if(number==down.number)
        {
            return 0;
        }else
        {
            return -1;
        }
    }
}

public class DownSorted
{
    public static void main(String[] args)
    {
        TreeSet<Down> tSet=new TreeSet<>();
        tSet.add(new Down(3));
        tSet.add(new Down(-7));
        tSet.add(new Down(-5));
        tSet.add(new Down(10));
        tSet.add(new Down(6));
        System.out.println("经定制排序（降序）后，得到的结果：\n"+tSet);
    }
}
