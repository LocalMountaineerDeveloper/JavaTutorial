/*
* 记录所有文件/文件夹名称到一个文件中
* */

package chapter15.practice;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SaveWindowsFileName
{

    public static void main(String[] args)
    {
        File file=new File("src/chapter15/Files/CWindowsFileNames.txt"); // 创建文件对象
        File dir=new File("C:\\Windows");
        File fs[]=dir.listFiles();
        try
        {
            FileWriter fw=new FileWriter(file); // 文件字符输出流
            BufferedWriter bw=new BufferedWriter(fw); // 换成输出流
            for(File f : fs)
            {
                bw.write(f.getAbsolutePath()); // 写入字符串
                bw.newLine(); // 写入一个换行符
            }
            bw.close(); // 关闭缓冲输出流
            fw.close(); // 关闭文件字符输出流
        }catch(IOException e)
        {
            e.printStackTrace();
        }

    }

}
