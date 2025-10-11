/*
* 判断生肖
* */

package chapter4.practice;

public class Year
{
    public static void main(String[] args)
    {
        int year=2021;//年份
        switch(year%12)
        {
            case 0:
                System.out.println(year+"年的生肖是猴");
                break;
            case 1:
                System.out.println(year+"年的生肖是鸡");
                break;
            case 2:
                System.out.println(year+"年的生肖是狗");
                break;
            case 3:
                System.out.println(year+"年的生肖是猪");
                break;
            case 4:
                System.out.println(year+"年的生肖是鼠");
                break;
            case 5:
                System.out.println(year+"年的生肖是牛");
                break;
            case 6:
                System.out.println(year+"年的生肖是虎");
                break;
            case 7:
                System.out.println(year+"年的生肖是兔");
                break;
            case 8:
                System.out.println(year+"年的生肖是龙");
                break;
            case 9:
                System.out.println(year+"年的生肖是蛇");
                break;
            case 10:
                System.out.println(year+"年的生肖是马");
                break;
            case 11:
                System.out.println(year+"年的生肖是羊");
                break;
        }
    }
}
