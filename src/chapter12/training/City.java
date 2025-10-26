/*
* 省市联动：输出东北三省的每个省份中的城市名称
* */

package chapter12.training;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class City
{
    public static void main(String[] args)
    {
        Map<String,String[]> map=new HashMap<>();
        map.put("黑龙江",new String[]{"哈尔滨","齐齐哈尔","牡丹江","大庆","伊春","双鸭山","鹤岗","鸡西","佳木斯","七台河","黑河","绥化","大兴安岭"});
        map.put("吉林",new String[]{"长春","延边","吉林","白山","白城","四平","松原","辽源","大安","通化"});
        map.put("辽宁",new String[]{"沈阳","大连","葫芦岛","旅顺","本溪","抚顺","铁岭","辽阳","营口","阜新","朝阳","锦州","丹东","鞍山"});
        Iterator<String> iter=map.keySet().iterator();
        while(iter.hasNext())
        {
            Object province=iter.next();
            System.out.println(province+"省主要城市：");
            String[] val=(String[])map.get(province);
            for(int i=0;i<val.length;++i)
            {
                System.out.print(val[i]+" ");
            }
            System.out.println();
        }
    }
}
