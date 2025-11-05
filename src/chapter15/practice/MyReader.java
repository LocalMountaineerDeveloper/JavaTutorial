/*
* 控制台输出本类所写的Java代码
* */

package chapter15.practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyReader
{

    public static void main(String[] args)
    {
        File me=new File("src/chapter15/practice/MyReader.java");
        BufferedReader br=null;
        FileReader fr=null;
        try
        {
            fr=new FileReader(me);
            br=new BufferedReader(fr);
            String tmp=null;
            while((tmp=br.readLine())!=null)
            {
                System.out.println(tmp);
            }
        }catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }catch(IOException e)
        {
            e.printStackTrace();
        }finally
        {
            try
            {
                br.close();
            }catch(IOException e)
            {
                e.printStackTrace();
            }
            try
            {
                fr.close();
            }catch(IOException e)
            {
                e.printStackTrace();
            }
        }
    }

}
