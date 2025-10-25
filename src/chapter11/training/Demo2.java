/*
* 判断字符串中的每个字符是数字还是字符
* */

package chapter11.training;

public class Demo2
{
    public static void main(String[] args)
    {
        String str="JDK 11.0.1";
        char cs[]=str.toCharArray();
        for(char c : cs)
        {
            System.out.print("字符'"+c+"'");
            if(Character.isLetter(c))
            {
                System.out.println("是字母");

            }else if(Character.isDigit(c))
            {
                System.out.println("是数字");
            }else
            {
                System.out.println("既不是字母也不是数字");
            }
        }
    }
}
