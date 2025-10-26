/*
* 格式化当前时间
* */

package chapter10.training;

import java.util.Date;

public class Demo9
{
    public static void main(String[] args)
    {
        Date date=new Date();
        System.out.printf("HH:MM:SS PM格式（12时制）：%tr%n",date); //%tr是“时：分：秒 PM（AM）格式”（12时制）
        //%n是一个特殊的格式说明符，它的作用是插入一个与平台相关的换行符（相当于换行操作）
        //%n的效果等同于 \n（换行符），但它是平台无关的。
        //在Windows系统中，换行符实际是 \r\n（回车+换行），而Unix/Linux/macOS中则是 \n。%n会根据操作系统自动选择正确的换行符。
    }
}
