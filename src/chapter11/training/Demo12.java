/*
* 检查计算机是否联网
* */

package chapter11.training;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Demo12
{
    public static void main(String[] args)
    {
        Runtime r=Runtime.getRuntime();
        try
        {
            Process p=r.exec("ping www.baidu.com");
            InputStream is=p.getInputStream();
            BufferedReader br=new BufferedReader(new InputStreamReader(is));
            String str=null;
            while((str=br.readLine())!=null)
            {
                System.out.println(str);
            }
        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
