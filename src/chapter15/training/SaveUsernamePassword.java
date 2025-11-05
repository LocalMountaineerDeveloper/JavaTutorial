/*
* 保存账号密码：在文件中写入账号密码
* */

package chapter15.training;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class SaveUsernamePassword
{

    public static void main(String[] args)
    {
        File file=new File("src/chapter15/Files/save.txt");
        try
        {
            FileOutputStream out=new FileOutputStream(file);
            byte buy[]="mr@mrsoft.com/123456".getBytes();
            out.write(buy);
            out.close();
        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
