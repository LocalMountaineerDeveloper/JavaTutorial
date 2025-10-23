package chapter7.practice;

interface USBRechargeable
{
    void charge();
}

interface TypeCRechargeable
{
    void charge();
}

class Car implements USBRechargeable, TypeCRechargeable
{
    @Override
    public void charge()
    {
        System.out.println("汽车上的USB和TypeC接口都能用于给手机充电。");
    }
}
