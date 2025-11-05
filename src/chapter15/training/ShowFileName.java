/*
* 列出目录下所有文件与文件夹的名称
* */

package chapter15.training;

import java.io.File;

public class ShowFileName
{

    public static void main(String[] args)
    {
        File dir=new File("C:\\Windows");
        File fs[]=dir.listFiles();
        for(File f : fs)
        {
            if(f.isFile())
            {
                System.out.print("文件：");
            }else
            {
                System.out.print("文件夹：");
            }
            System.out.println(f.getName());
        }
    }
}
