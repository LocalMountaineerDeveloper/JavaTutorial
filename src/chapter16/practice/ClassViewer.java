/*
* 反射ArrayList类：利用反射机制查看ArrayList类中定义的域、构造方法和普通方法。
* */

package chapter16.practice;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassViewer
{
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws ClassNotFoundException
    {
        Class<?> clazz=Class.forName("java.util.ArrayList");
        System.out.println("类的标准名称："+clazz.getCanonicalName());
        Constructor[] constructors=clazz.getConstructors();// 获得该类对象的所有构造方法
        System.out.println("类的构造方法：");
        if(constructors.length!=0)
        {
            for(Constructor constructor : constructors)
            {
                System.out.println("\t"+constructor);// 输出构造方法
            }
        }else
        {
            System.out.println("\t空");
        }
        Field[] fields=clazz.getDeclaredFields();// 获得该类对象的所有非继承字段
        System.out.println("类的非继承域字段：");
        if(fields.length!=0)
        {
            for(Field field : fields)
            {
                System.out.println("\t"+field);// 输出非继承字段
            }
        }else
        {
            System.out.println("\t空");
        }
        Method[] methods=clazz.getDeclaredMethods();// 获得该类对象的所有非继承方法
        System.out.println("类的非继承方法：");
        if(methods.length!=0)
        {
            for(Method method : methods)
            {
                System.out.println(method);// 输出非继承方法
            }
        }else
        {
            System.out.println("\t空");
        }
    }
}
