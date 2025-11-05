/*
* 在文件中记录圆周率数值
* */

package chapter15.training;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CircularConstant
{
    public static void main(String[] args)
    {
        File file=new File("src/chapter15/Files/PI.txt");
        try
        {
            FileOutputStream fos=new FileOutputStream(file);
            DataOutputStream dos=new DataOutputStream(fos);
            dos.writeDouble(Math.PI);
            dos.close();
            fos.close();

            FileInputStream fis=new FileInputStream(file);
            DataInputStream dis=new DataInputStream(fis);
            System.out.println(dis.readDouble());
            dis.close();
            fis.close();
        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
