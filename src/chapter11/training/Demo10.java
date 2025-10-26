/*
* 中文格式日期改英文格式
* */

package chapter11.training;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo10
{
    public static void main(String[] args)
    {
        String dateStr="现在是2021年08月08日13点20分05秒";
        SimpleDateFormat s1=new SimpleDateFormat("现在是yyyy年MM月dd日HH点mm分ss秒");
        Date date=null;
        try
        {
            date=s1.parse(dateStr);
        }catch(ParseException e)
        {
            e.printStackTrace();
        }
        SimpleDateFormat s2=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(s2.format(date));
    }
}
