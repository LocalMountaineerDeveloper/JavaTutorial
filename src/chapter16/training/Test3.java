/*
* 为用户登录方法创建注解
* */
package chapter16.training;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Test3
{
    @LoginMethodAnnotation
    public void login(String username,String password)
    {

    }

    public static void main(String[] args)
    {
        Class c=null;
        try
        {
            c=Class.forName("chapter16.training.Test3");
        }catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        Method[] ms=c.getDeclaredMethods();
        for(Method m:ms)
        {
            if(m.isAnnotationPresent(LoginMethodAnnotation.class))
            {
                LoginMethodAnnotation la=m.getAnnotation(LoginMethodAnnotation.class);
                System.out.println(la.value());
            }
            Annotation[][] parameterA=m.getParameterAnnotations();
            for(int j=0;j<parameterA.length;++j)
            {
                int length=parameterA[j].length;
                if(length==0)
                {
                    System.out.println("未添加Annotation的参数");
                }else
                {
                    for(int k=0;k<length;++k)
                    {
                        LoginMethodAnnotation la=(LoginMethodAnnotation)parameterA[j][k];
                        System.out.println(la.value());
                    }
                }
            }
            System.out.println();
        }
    }
}
