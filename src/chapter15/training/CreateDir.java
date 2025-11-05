/*
* 批量创建文件夹
* */

package chapter15.training;

import java.io.File;

public class CreateDir
{
    public static void main(String[] args)
    {
        File dir=new File("src/chapter15/Files");
        if(!dir.exists())
        {
            dir.mkdir();
        }
        for(int i=1;i<=10;i++)
        {
            File dirIner=new File(dir,String.valueOf(i));
            dirIner.mkdir();
        }
        System.out.println("文件夹创建完毕");
    }
}
