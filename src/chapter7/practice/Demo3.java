/*
* 餐馆点菜：使用父类转换为子类的向下转型。
* */

package chapter7.practice;

class People
{
}

class Teacher extends People
{
    public void order()
    {
        System.out.println("（老师）点了“香辣肉丝”");
    }
}

class Student extends People
{
    public void order()
    {
        System.out.println("（学生）点了”火腿炒面”");
    }
}

class Doctor extends People
{
    public void order()
    {
        System.out.println("（医生）点了“麻辣香锅”");
    }
}

public class Demo3
{
    public static void main(String[] args)
    {
        People p1=new Teacher();
        Teacher teacher=(Teacher)p1;
        teacher.order();
        People p2=new Student();
        Student student=(Student)p2;
        student.order();
        People p3=new Doctor();
        Doctor doctor=(Doctor)p3;
        doctor.order();
    }
}
