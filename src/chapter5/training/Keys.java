/*
 * 使用一维数组存储键盘字母
 * */

package chapter5.training;

public class Keys
{
    public static void main(String[] args)
    {
        char[] firstRow={'Q','W','E','R','T','Y','U','I','O','P'};
        char[] secondRow={'A','S','D','F','G','H','J','K','L'};
        char[] thirdRow={'Z','X','C','V','B','N','M'};
        System.out.println("键盘上第一排的字母键有"+firstRow.length+"个；");
        System.out.println("键盘上第二排的字母键有"+secondRow.length+"个；");
        System.out.println("键盘上第三排的字母键有"+thirdRow.length+"个。");
    }
}