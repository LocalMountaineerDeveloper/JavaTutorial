/*
* 找到名字最后一个字相同的人
* */

package chapter10.practice;

public class SameName
{
    public static void main(String[] args)
    {
        String str[]={"张三","李四","王五","赵六","周七","王哲","白浩","贾蓉","慕容阿三","黄蓉"};
        System.out.println("最后一个字相同的名字有");
        for(int i=0;i<str.length;i++)
        {
            for(int j=i+1;j<str.length;j++)
            {
                int len=str[i].length();
                char endChar=str[i].charAt(len-1);
                String strEC=endChar+"";
                if(str[j].endsWith(strEC))
                {
                    System.out.println(str[i]+"和"+str[j]);
                }
            }
        }
    }
}
