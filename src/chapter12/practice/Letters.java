/*
* 26个英文字符的正反输出：使用数组和ArrayList类，先输出A-Z，再输出z-a
* */

package chapter12.practice;

import java.util.ArrayList;
import java.util.Iterator;

public class Letters
{
    public static void main(String[] args)
    {
        char[] letter={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S',
                'T','U','V','W','X','Y','Z'};
        ArrayList<Character> list1=new ArrayList<>();
        ArrayList<Character> list2=new ArrayList<>();
        for(int i=0;i<letter.length;++i)
        {
            list1.add(letter[i]);
            list2.add((char)(187-letter[i])); //187=122+65，ASCII码为122的是z，97~122是a-z的范围；ASCII码为65的是A，65~90是A-Z的范围。
        }
        System.out.println("使用迭代器输出“A→Z”：");
        Iterator<Character> it=list1.iterator();
        while(it.hasNext())
        {
            Object element=it.next();
            System.out.print(element+" ");
        }
        System.out.println();
        System.out.println("使用迭代器输出“z→a”：");
        it=list2.iterator();
        while(it.hasNext())
        {
            Object element=it.next();
            System.out.print(element+" ");
        }
    }
}
