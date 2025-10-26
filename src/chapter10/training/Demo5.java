/*
* 判断某文字只出现一次
* */

package chapter10.training;

public class Demo5
{

    public int check(String original,String substr)
    {
        if(original.indexOf(substr)!=-1)
        {
            if(original.indexOf(substr)==original.lastIndexOf(substr))
            {
                return 1;
            }
            return 0;
        }
        return -1;
    }

    public static void main(String[] args)
    {
        Demo5 d=new Demo5();
        String original="合理安排时间，就等于节约时间";
        String substr="时间";
        if(d.check(original,substr)==1)
        {
            System.out.println("子字符串在原字符中只出现过一次");
        }else if(d.check(original,substr)==0)
        {
            System.out.println("子字符串在原字符中出现了多次");
        }else
        {
            System.out.println("子字符串不存在于原字符串");
        }
    }
}