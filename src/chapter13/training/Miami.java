/*
* 输出NBA球队信息：定义泛型类Miami<T>，再创建令两个类Detroit类和Philadelphia类继承泛型类，输出NBA中夺冠次数为3次的球队及夺冠年份。
* */

package chapter13.training;

public class Miami<T>
{
    private T name; // 球队名称
    private T championTimes; // 夺冠次数
    private T championYears; // 夺冠年份

    // 用Getters（获取私有属性值）/Setters（设置私有属性值）封装“迈阿密”类中的私有属性
    public T getName()
    {
        return name;
    }

    public void setName(T name)
    {
        this.name=name;
    }

    public T getChampionTimes()
    {
        return championTimes;
    }

    public void setChampionTimes(T championTimes)
    {
        this.championTimes=championTimes;
    }

    public T getChampionYears()
    {
        return championYears;
    }

    public void setChampionYears(T championYears)
    {
        this.championYears=championYears;
    }

    public static void main(String[] args)
    {
        Miami<String> miami1=new Miami<String>(); // 创建实际类型为String的Miami对象
        miami1.setName("迈阿密热队"); // 设置“球队名称”
        miami1.setChampionYears("2006、2012、2013"); // 设置“夺冠年份”
        Miami<Integer> miami2=new Miami<Integer>(); // 创建实际类型为Integer的Miami对象
        miami2.setChampionTimes(3); // 设置“夺冠次数”
        System.out.println("夺冠次数为 "+miami2.getChampionTimes()+" 次的球队及年份：\n"); // 获取夺冠次数
        System.out.println("球队名称："+miami1.getName()+"\n夺冠年份："+miami1.getChampionYears()+"\n"); // 输出“球队名称”、“夺冠年份”、“夺冠次数”
        Detroit detroit=new Detroit(); // 创建Detroit对象
        System.out.println("球队名称："+detroit.getName()+"\n夺冠年份："+detroit.getChampionYears()+"\n"); // 输出“球队名称”、“夺冠年份”、“夺冠次数”
        Philadelphia phi=new Philadelphia(); // 创建Philadelphia对象
        System.out.println("球队名称："+phi.getName()+"\n夺冠年份："+phi.getChampionYears()); // 输出“球队名称”、“夺冠年份”、“夺冠次数”
    }
}

class Detroit extends Miami<String>
{// 创建一个“底特律”类继承实际类型为String的“迈阿密”类

    @Override
    public String getName()
    {// 重写获取“球队名称”的方法，并返回"底特律活塞队"
        return "底特律活塞队";
    }

    @Override
    public String getChampionYears()
    {// 重写获取“夺冠年份”的方法，并返回"1989、1990、2004"
        return "1989、1990、2004";
    }
}

class Philadelphia extends Miami<String>
{// 创建一个“底特律”类继承实际类型为String的“迈阿密”类

    @Override
    public String getName()
    {// 重写获取“球队名称”的方法，并返回"费城76人队"
        return "费城76人队";
    }

    @Override
    public String getChampionYears()
    {// 重写获取“夺冠年份”的方法，并返回"1955、1967、1983"
        return "1955、1967、1983";
    }
}
