/*
* 细胞分裂实验：生物实验室做单细胞细菌繁殖实验，每一代细菌数量会成倍数增长，一代菌落中只有一个细菌，二代菌落中分裂成两个细菌，三代菌落中分裂成4个
* 细菌，以此类推，计算第十代菌落中的细菌数量。
* */

package chapter4.training;

public class SingleCellReproduction
{
    public static void main(String[] args)
    {
        int cellNum=1, time=1;
        while(time<10)
        {
            cellNum*=2;
            time++;
        }
        System.out.println("第"+time+"代菌落中的细菌数量:"+cellNum+"个。");
    }
}
