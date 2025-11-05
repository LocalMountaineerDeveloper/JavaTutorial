/*
* 数字加密：对数字进行加密运算后写入文件中，然后再将其读取出解密还原。
* */

package chapter15.training;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class EncryptionDemo
{
    public static int encryption(int original)
    {
        return (original*2-11)*3+17;
    }

    public static int decrypt(int ciphertext)
    {
        return ((ciphertext-17)/3+11)/2;
    }

    public static void main(String[] args)
    {
        File file=new File("src/chapter15/Files/ciphertext");
        int original=11987;
        System.out.println("原文："+original);
        try
        {
            FileOutputStream fos=new FileOutputStream(file);
            DataOutputStream dos=new DataOutputStream(fos);
            int input=encryption(original);
            System.out.println("写入的密文："+input);
            dos.writeInt(input);
            dos.close();
            fos.close();

            FileInputStream fis=new FileInputStream(file);
            DataInputStream dis=new DataInputStream(fis);
            int ciphertext=dis.readInt();
            System.out.println("读取的密文："+ciphertext);
            System.out.println("解密的结果："+decrypt(ciphertext));
            dis.close();
            fis.close();
        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
