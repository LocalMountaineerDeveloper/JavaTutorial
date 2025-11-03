/*
* 找出大于平均年龄的员工：基于Employee员工类。
* */

package chapter14.practice;

import chapter14.training.Employee;

import java.util.List;
import java.util.stream.Collectors;

public class AvgAgeDemo
{
    public static void main(String[] args)
    {
        List<Employee> list=Employee.getEmpList();
        double avgAge=list.stream().collect(Collectors.averagingDouble(Employee::getAge));
        list.stream().filter(people->people.getAge()>avgAge).forEach(e->System.out.println(e));
    }
}
