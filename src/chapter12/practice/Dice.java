/*
* 玩骰子：张三、李四、王五、赵六玩掷骰子游戏，比点数大小，如果点数有重复则重新开始，如果没有则输出点数最大的那个人的名字。
* */

package chapter12.practice;

import java.util.*;

public class Dice
{
    public static void main(String[] args)
    {
        System.out.println("——————————————掷骰子游戏——————————————");
        List list=new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(12);
        System.out.println("骰子的点数："+list);
        Random random=new Random();
        int index1=random.nextInt(12);
        int index2=random.nextInt(12);
        int index3=random.nextInt(12);
        int index4=random.nextInt(12);
        Map map=new HashMap();
        map.put("张三",list.get(index1));
        map.put("李四",list.get(index2));
        map.put("王五",list.get(index3));
        map.put("赵六",list.get(index4));
        TreeSet ts=new TreeSet();
        ts.add(list.get(index1));
        ts.add(list.get(index2));
        ts.add(list.get(index3));
        ts.add(list.get(index4));
        System.out.println("——————————————掷骰子结果——————————————");
        if(ts.size()!=4)
        { //TreeSet不能有重复元素，当TreeSet元素个数没达到预定值时说明有重复数据
            OneByOne(map);
            System.out.println("本轮掷骰子有多人的点子重复，重新开始下一轮。\n——————————————本轮作废——————————————");
        }else
        {
            OneByOne(map);
            System.out.println("——————————————本轮胜出者——————————————");
            Iterator iterator=map.keySet().iterator();
            while(iterator.hasNext())
            {
                Object key=iterator.next();
                if(ts.last().equals(map.get(key)))
                { //TreeSet是有序的，默认按照自然顺序递增，所以ts.last()是最大的元素
                    System.out.println(key);
                }
            }
        }

    }

    public static void OneByOne(Map map)
    {
        Iterator iterator=map.keySet().iterator();
        while(iterator.hasNext())
        {
            Object key=iterator.next();
            System.out.println(key+"的点数："+map.get(key));
        }
    }
}