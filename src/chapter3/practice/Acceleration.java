/*
 * 计算机车加速度：平均加速度，即速度的变化量除以这个变化所用的时间。现有一辆轿车用了8.7秒从每小时0千米加速到每小时100千米，计算并输出这辆轿车的
 * 平均加速度。
 * */

package chapter3.practice;

public class Acceleration
{
    public static void main(String[] args)
    {
        int startSpeed=0;
        double endSpeed=100.0*1000/3600;
        double time=8.7;
        double acceleration=(endSpeed-startSpeed)/time;
        System.out.println("一辆轿车用了8.7秒从0km/h加速到100km/h，这辆轿车的平局加速度 = "+acceleration);
    }
}
