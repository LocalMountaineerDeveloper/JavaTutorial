/*
* 统计男员工总人数：结合Employee员工类
* */

package chapter14.training;

import java.util.List;
import java.util.stream.Stream;

public class CountDemo
{

    public static void main(String[] args)
    {
        List<Employee> list=Employee.getEmpList(); // 获取公共类的测试数据
        Stream<Employee> stream=list.stream(); // 获取集合流对象
        // 判断员工是否有的年龄大于等于40
        stream=stream.filter(e->e.getSex().equals("男"));
        System.out.println("男员工的人数为："+stream.count()); // 输出结果
    }
}
