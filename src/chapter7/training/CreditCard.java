package chapter7.training;

public class CreditCard extends BankCard
{
    public void drawMoney()
    {
        System.out.println("卡号为"+cardNum+"银行卡可以取钱。");
    }

    public void borrowMoney()
    {
        System.out.println("卡号为"+cardNum+"银行卡可以借钱。");
    }
}
