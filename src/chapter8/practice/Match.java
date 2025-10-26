/*
 * 划火柴：定义一个点燃接口，再定义一个火柴类实现点燃接口，每根火柴对象只能调用一次点燃方法，这种对象如何创建？
 * */

package chapter8.practice;

interface Light
{
    public void light();
}

public class Match
{
    public static void main(String[] args)
    {
        new Match()
        {
            public void light()
            {
                System.out.println("一根火柴被点燃了……");
            }
        }.light();
    }
}
