package chapter14.training;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.Function;

public class Demo4
{
    public static void main(String[] args)
    {
        Function<Object,String> now=n->
        {
            return new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒").format(new Date());
        };
        System.out.println(now.apply(null));
    }
}
