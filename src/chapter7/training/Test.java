/*
* 创建抽象的工厂类，工厂类有一个抽象的生产方法，让汽车厂和鞋厂都继承工厂类，汽车厂生产的是汽车，鞋厂生产的是鞋
* */

package chapter7.training;

public class Test
{
    public static void main(String[] args)
    {
        AutoPlant autoPlant=new AutoPlant("汽车");
        autoPlant.setName("汽车厂");
        System.out.println(autoPlant.getName()+"生产的是"+autoPlant.productsName);
        ShoeFactory shoeFactory=new ShoeFactory("鞋");
        shoeFactory.setName("鞋厂");
        System.out.println(shoeFactory.getName()+"生产的是"+shoeFactory.productsName);
    }
}
