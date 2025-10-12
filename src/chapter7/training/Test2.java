/*
* 水果售价：用继承展示经过人工包装的水果与普通水果在价格上的区别。
* */

package chapter7.training;

public class Test2 //创建一个Test类
{
    public static void main(String[] args)
    {
        Fruit fruit=new Fruit(); //创建fruit对象
        fruit.setName("苹果"); //初始化“水果名称”
        fruit.setPrice(1.98f); //初始化“水果价格”
        fruit.setWeight(5.0f); //初始化“水果重量”
        PackagedFruit packagedFruit=new PackagedFruit(); //创建packagedFruit对象
        packagedFruit.setName("精装苹果"); //初始化“精装水果的名称”
        packagedFruit.setPrice(2.98f); //初始化“精装水果的价格”
        packagedFruit.setWeight(5.0f); //初始化“精装水果的重量”
        packagedFruit.setPackagesfee(((float)packagedFruit.getPrice()-(float)fruit.getPrice())); ///初始化“精装水果的包装费”
        System.out.println("水果名称\t水果价格(元/千克)\t水果重量(千克)\t包装费(元/千克)\t总价"); //提示信息
        System.out.println("——————————————————————————————————————————————————————————————"); //分割线
        System.out.println(fruit.getName()+"\t"+fruit.getPrice()+"\t\t"+fruit.getWeight()+"\t"
                +"\t"+"0.0"+"\t\t"+fruit.getPrice()*fruit.getWeight()); //输出结果
        System.out.println(packagedFruit.getName()+"\t"+packagedFruit.getPrice()+"\t\t"+packagedFruit.getWeight()
                +"\t\t"+packagedFruit.getPackagesfee()+"\t\t"
                +packagedFruit.getPrice()*packagedFruit.getWeight()); //输出结果
        System.out.println("——————————————————————————————————————————————————————————————"); //分割线
        System.out.println("差价\t\t\t\t\t\t\t"
                +(packagedFruit.getPrice()*packagedFruit.getWeight()-fruit.getPrice()*fruit.getWeight())); //输出结果
    }
}
