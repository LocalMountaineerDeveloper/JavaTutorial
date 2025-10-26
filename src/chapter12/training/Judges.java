/*
* 模拟2021年NBA扣篮大赛评分：请5为评委打分，控制台输入5个0~10的整数，中间用逗号隔开如（10,9,9,8,10），最后计算5为评委给出的分数之和。
* */

package chapter12.training;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Judges
{
    public static void main(String[] args)
    {
        System.out.println("——————————————模拟NBA扣篮大赛的评分——————————————");
        System.out.println("请五位评委打分\n（提示：输入五个0~10内的整数，中间用逗号隔开，例如：10,9,9,8,10");
        Scanner sc=new Scanner(System.in);
        String score=sc.next();
        String[] scores=score.split(",");
        int score1=Integer.valueOf(scores[0]);
        int score2=Integer.valueOf(scores[1]);
        int score3=Integer.valueOf(scores[2]);
        int score4=Integer.valueOf(scores[3]);
        int score5=Integer.valueOf(scores[4]);
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("魔术师约翰逊",score1);
        hm.put("大鲨鱼奥尼尔",score2);
        hm.put("麦蒂",score3);
        hm.put("穆大叔",score4);
        hm.put("冰人格文",score5);
        int total=0;
        Iterator<String> it=hm.keySet().iterator();
        while(it.hasNext())
        {
            String key=(String)it.next();
            System.out.println(key+"："+hm.get(key)+"分");
            total+=(int)hm.get(key);
        }
        System.out.println();
        System.out.println("球员本轮扣篮的成绩："+total+"分");
        sc.close();
    }
}
