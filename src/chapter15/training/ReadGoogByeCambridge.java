/*
* 从文件中读取《再别康桥》
* */

package chapter15.training;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadGoogByeCambridge
{

    public static void main(String[] args)
    {
        File file=new File("src/chapter15/Files/再别康桥.txt");
        try
        {
            FileReader fr=new FileReader(file);
            BufferedReader br=new BufferedReader(fr);
            String tmp=null;
            while((tmp=br.readLine())!=null)
            {
                System.out.println(tmp);
            }
            br.close();
            fr.close();
        }catch(IOException e)
        {
            e.printStackTrace();
        }

    }

}
