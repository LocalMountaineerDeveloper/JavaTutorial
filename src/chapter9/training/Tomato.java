/*
 * 价格调控：使用throw关键字模拟，西红柿单价超过7元时作为异常抛出。
 * */

package chapter9.training;

import java.util.Scanner;

class PriceException extends Exception
{ // 自定义价格异常类，并继承异常类
    public PriceException(String message)
    { // 创建价格异常类有参构造方法
        super(message); // 调用异常类的有参构造方法
    }
}

public class Tomato
{ // 创建西红柿类
    private double price; // 西红柿单价

    public double getPrice()
    { // 获取西红柿单价
        return price;
    }

    // 设置西红柿单价，如果产生价格异常，那么就抛出价格异常
    public void setPrice(double price) throws PriceException
    {
        if(price>7.0)
        { // 如果西红柿单价大于7元
            throw new PriceException("国家规定西红柿单价不得超过7元！！！"); // 抛出价格异常
        }else
        { // 如果西红柿单价不大于7元
            this.price=price; // 为西红柿类的price属性赋值
        }
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in); // 创建控制台输入对象
        System.out.println("今天的西红柿单价(单价格式为“3.00”)："); // 控制台输出提示信息
        String dayPrice=sc.next(); // 把控制台输入的西红柿单价赋值给变量dayPrice
        if(dayPrice.length()==4)
        { // 控制台输入的字符串长度为4时
            // 将String类型的西红柿单价转换为double类型
            double unitPriceDou=Double.parseDouble(dayPrice);
            Tomato tomato=new Tomato(); // 创建西红柿对象
            try
            { // 把可能产生异常的Java代码放在try中
                tomato.setPrice(unitPriceDou); // 西红柿对象调用设置西红柿单价的方法
            }catch(Exception e)
            { // 捕捉数组元素下标越界异常对象
                System.out.println(e.getMessage()); // 输出异常信息
            }finally
            {
                sc.close(); // 关闭控制台输入对象
            }
        }else
        { // 控制台输入的字符串长度不为4时
            // 输出提示信息
            System.out.println("违规操作："+"输入西红柿单价时小数点后须保留两位有效数字（如3.00）！");
        }
    }
}
