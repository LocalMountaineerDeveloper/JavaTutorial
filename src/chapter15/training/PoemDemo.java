/*
* 记录古诗：在文件中写入古诗《春晓》全文。
* */

package chapter15.training;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class PoemDemo
{

    public static void main(String[] args)
    {
        File file=new File("src/chapter15/Files/春晓.txt");
        try
        {
            FileOutputStream out=new FileOutputStream(file);
            byte buy[]="春眠不觉晓，处处闻啼鸟。夜来风雨声，花落知多少。".getBytes();
            out.write(buy);
            out.close();
        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}

