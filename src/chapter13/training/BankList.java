/*
* 模拟银行存钱：使用泛型类模拟场景，通过泛型类BankList<T>再控制台输出银行卡各种信息。
* */

package chapter13.training;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Date;

public class BankList<T>
{
    T bankName; //银行名称
    T time; //存款时间
    T username; //户名
    T cardNum; //卡号
    T currency; //币种
    T inAccount; //存款金额
    T leftAccount; //账户余额

    public static void main(String[] args)
    {
        BankList<Object> list=new BankList<Object>(); //创建一个String类型的BankList对象
        list.bankName="中国建设银行"; //初始化“银行名称”
        list.time=new Date(); //初始化“存款时间”
        list.username="赵四"; //初始化“户名”
        list.cardNum="6666 7777 8888 9996 789"; //初始化“卡号”
        list.currency="RMB"; //初始化“币种”
        list.inAccount=new BigDecimal(8888.00); //初始化“存款金额”
        list.leftAccount=new BigDecimal(18888.89); //初始化“账户余额”
        DecimalFormat df=new DecimalFormat("###,###.00"); //创建DecimalFormat对象，用来格式化Double类型的对象
        System.out.println(
                "银行名称："+list.bankName
                        +"\n存款时间："+list.time
                        +"\n户　　名："+list.username
                        +"\n卡　　号："+list.cardNum
                        +"\n币　　种："+list.currency
                        +"\n存款金额："+df.format(list.inAccount)
                        +"\n账户余额："+df.format(list.leftAccount)
        ); //输出上述信息
    }
}
