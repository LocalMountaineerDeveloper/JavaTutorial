/*
* 寻找梁山好汉：控制台上按格式输出如“呼保义宋江”、“智多星吴用”等格式的《水浒传》中梁山前十位好汉的绰号和人名，之后在控制台输入一位梁山好汉绰号如
* “智多星”时，控制台会输出这位好汉的人名。
* */

package chapter12.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Warriors
{
    public static void main(String[] args)
    {
        HashMap hm=new HashMap();
        hm.put("呼保义","宋江");
        hm.put("玉麒麟","卢俊义");
        hm.put("智多星","吴用");
        hm.put("入云龙","公孙胜");
        hm.put("大刀","关胜");
        hm.put("豹子头","林冲");
        hm.put("霹雳火","秦明");
        hm.put("双鞭","呼延灼");
        hm.put("小李广","花荣");
        hm.put("小旋风","柴进");
        System.out.println("梁山前十位好汉（无序）：");
        Iterator it=hm.keySet().iterator();
        String key;
        while(it.hasNext())
        {
            key=(String)it.next();
            System.out.print(key+hm.get(key)+" ");
        }
        System.out.println();
        System.out.println("请输入上述梁山前十位好汉其中一位的绰号：");
        Scanner sc=new Scanner(System.in);
        key=sc.next().trim();
        System.out.println(key+"——"+hm.get(key));
        sc.close();
    }
}
