/*
* 为用户名和密码创建注解
* */
package chapter16.training;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Test4
{
    @LoginMethodAnnotation
    public void login(@UsernameParamAnnotation String username,@PasswordParamAnnotation String password)
    {

    }

    public static void main(String[] args)
    {
        Class c=null;
        try
        {
            c=Class.forName("chapter16.training.Test4");
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
                        if(parameterA[j][k].annotationType().equals(UsernameParamAnnotation.class))
                        {
                            UsernameParamAnnotation ua=(UsernameParamAnnotation)parameterA[j][k];
                            System.out.println(ua.describe());
                            System.out.println(ua.type());
                        }
                        if(parameterA[j][k].annotationType().equals(PasswordParamAnnotation.class))
                        {
                            PasswordParamAnnotation ua=(PasswordParamAnnotation)parameterA[j][k];
                            System.out.println(ua.describe());
                            System.out.println(ua.type());
                        }
                    }
                }
            }
            System.out.println();
        }
    }
}
