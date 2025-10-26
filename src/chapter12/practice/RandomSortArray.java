/*
* 给随机数组排序：请利用TreeSet集合实现不重复的数列，自动完成元素的排列，然后生成数组。
* */

package chapter12.practice;

import java.util.Random;
import java.util.TreeSet;

public class RandomSortArray
{
    public static void main(String[] args)
    {
        TreeSet<Integer> set=new TreeSet<Integer>(); //Set集合不能包含重复对象
        Random ran=new Random();
        int count=0;
        while(count<10)
        { //循环生成随机数
            boolean succeed=set.add(ran.nextInt(100)); //随机出的元素只有与集合中所有元素不同才能添加到集合中
            if(succeed)
            {
                ++count;
            }
        }
        int size=set.size(); //获取集合的大小
        Integer[] array=new Integer[size];
        set.toArray(array); //获取集合中元素并转换为数组
        System.out.println("生成无重复元素且升序排列的随机数组如下：");
        for(int value:array)
        {
            System.out.print(value+" ");
        }
    }
}
