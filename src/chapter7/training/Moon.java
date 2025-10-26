/*
* 月球类：地球周围没有其他类似月球的卫星，所以月球类不能有子类
* */

package chapter7.training;

public final class Moon
{
    String name;
    String characteristic;

    public Moon(String name,String characteristic)
    {
        this.name=name;
        this.characteristic=characteristic;
    }

    public String reflect()
    {
        return this.name+"本身并不发光，只反射太阳光";
    }

    public static void main(String[] args)
    {
        Moon moon=new Moon("月球","地球周围没有其他类似月球的卫星");
        System.out.println(moon.characteristic+"。"+moon.reflect()+"。");
    }
}

//public class newPlanet extends Moon {}