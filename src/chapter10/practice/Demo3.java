/*
* 判断后缀名
* */

package chapter10.practice;

public class Demo3
{

    public boolean check(String fileName)
    {
        boolean upperFlag=fileName.lastIndexOf(".MP4")!=-1;
        boolean lowerFlag=fileName.lastIndexOf(".mp4")!=-1;
        return upperFlag || lowerFlag;
    }

    public static void main(String[] args)
    {
        Demo3 d=new Demo3();
        String fileName="String类的常用方法.mp4";
        System.out.print(fileName+"文件");
        if(d.check(fileName))
        {
            System.out.println("是MP4文件");
        }else
        {
            System.out.println("不是MP4文件");
        }

    }
}