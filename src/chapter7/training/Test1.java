/*
* 储蓄卡与信用卡：创建银行卡类，并设计银行卡类的两个子类，储蓄卡与信用卡。
* */

package chapter7.training;

public class Test1
{
    public static void main(String[] args)
    {
        System.out.println("--------------银行卡的特点--------------");
        BankCard bankCard=new BankCard();
        bankCard.cardNum="6224 4569 2421 3677";
        bankCard.saveMoney();
        System.out.println("--------------储蓄卡的特点--------------");
        SavingCard savingCard=new SavingCard();
        savingCard.cardNum="6212 2636 0001 2739";
        savingCard.saveMoney();
        savingCard.drawMoney();
        System.out.println("--------------信用卡的特点--------------");
        CreditCard creditCard=new CreditCard();
        creditCard.cardNum="4013 7356 3380 0642";
        creditCard.saveMoney();
        creditCard.drawMoney();
        creditCard.borrowMoney();
    }
}
