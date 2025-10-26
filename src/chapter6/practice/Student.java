/*
* 计算平均分：记录4名学生的语文、数学、英语这3科成绩，再计算每个人平均分。
* */

package chapter6.practice;

public class Student
{
    int number; //学号
    String name; //姓名
    float chinese; //语文成绩
    float math; //数学成绩
    float english; //英语成绩

    public Student(int number,String name,float chinese,float math,float english)
    { //构造有参方法，并用this关键字区分重名的成员变量与变量
        this.number=number;
        this.name=name;
        this.chinese=chinese;
        this.math=math;
        this.english=english;
    }

    public void average()
    { //计算平均分的方法
        float aver=(chinese+math+english)/3; //aver表示平均分
        System.out.println(number+"\t"+name+"\t"+chinese+"\t"+math+"\t"+english+"\t"+aver);
    }

    public static void main(String[] args)
    {
        System.out.println("学号\t姓名\t语文\t数学\t英语\t平均分");
        System.out.println("——————————————————————————————————————————————————");
        Student student1=new Student(1,"张三",91.5f,98f,89f); //张三的各科成绩
        student1.average(); //计算张三的平均分

        Student student2=new Student(2,"李四",96f,98.5f,93f); //李四的各科成绩
        student2.average(); //计算李四的平均分

        Student student3=new Student(3,"王五",97f,100f,98.5f); //王五的各科成绩
        student3.average(); //计算王五的平均分

        Student student4=new Student(4,"钱六",77f,83f,81f); //钱六的各科成绩
        student4.average(); //计算钱六的平均分
    }
}
