/*
 * 计算矩形面积
 * */

package chapter6.practice;

public class Rect
{
    private float height;
    private float width;

    public Rect(float height,float width)
    {
        this.height=height;
        this.width=width;
    }

    public float square()
    {
        return height*width;
    }

    public static void main(String args[])
    {
        Rect u=new Rect(3.5f,4.5f);
        System.out.println(u.square());
    }
}
