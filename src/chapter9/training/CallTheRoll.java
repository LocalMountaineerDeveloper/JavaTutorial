/*
* 模拟上课点名：将旷课的学生作为异常抛出
* */

package chapter9.training;

class Person
{ // 创建一个Person类
    private String job; // 定义“职称”

    public String getJob()
    { // 获得“职称”
        return job;
    }

    public void setJob(String job)
    { // 设置“职称”
        this.job=job;
    }

    public void say(String words)
    { // 创建有参的方法say()
        System.out.println(job+"："+words); // 输出结果
    }
}

public class CallTheRoll
{ // 创建一个CallTheRoll类
    public static void main(String[] args)
    {
        try
        { // try块
            Person person1=new Person(); // 创建对象person1
            person1.setJob("老师"); // 设置对象person1的“职称”
            person1.say("同学们早上好！现在我们开始点名..."); // 设置对象person1说话的内容

            Person person2=new Person(); // 创建对象person2
            person2.setJob("班长"); // 设置对象person2的“职称”
            person2.say("大家保持安静！准备上课..."); // 设置对象person2说话的内容

            person1.say("张三！"); // 设置对象person1说话的内容

            Person person3=new Person(); // 创建对象person3
            person3.setJob("同学张三"); // 设置对象person3的“职称”
            person3.say("到！"); // 设置对象person3说话的内容

            person1.say("李四！"); // 设置对象person1说话的内容

            Person person4=new Person(); // 创建对象person4
            person4.setJob("同学李四"); // 设置对象person4的“职称”
            person4.say("Here！"); // 设置对象person4说话的内容

            person1.say("下次说中文。下一个！\n　　　王五！"); // 设置对象person1说话的内容

            Person person5=new Person(); // 创建对象person5
            person5.setJob("同学王五"); // 设置对象person5的“职称”
            person5.say("...."); // 设置对象person5说话的内容

            person1.say("王五！"); // 设置对象person1说话的内容

            person5.say("...."); // 设置对象person5说话的内容

            throw new Exception("抛出异常：老师在点名册上记下了“王五旷课”！！！"); // 抛出异常
        }catch(Exception e)
        { // catch块
            System.out.println(e.getMessage()); // 输出异常的信息
        }finally
        {
            System.out.println("老师：今天点名到此结束。现在开始上课！"); // 控制台输出
        }
    }
}
