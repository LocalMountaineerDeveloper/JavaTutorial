/*
* 水池放水：创建一个水池类，定义一个静态变量表示水池的水量，初始化为0，定义两个静态方法，即注水（一次注入3个单位水）方法和放水方法（一次放出2个单
* 位）方法，通过调用这两个方法，控制水池中的水量。
* */

package chapter6.training;

public class Pool2 { // 创建水池类
    public static int water = 0; // 初始化静态变量之水池中的水量为0

    public static void outlet() { // 放水，一次放出2个单位
        if (water >= 2) { // 如果水池中的水量大于等于2个单位
            water = water - 2; // 放出2个单位的水
        } else { // 如果水池中的水量小于2个单位
            water = 0; // 水池中的水量为0
        }
    }

    public static void inlet() { // 注水，一次注入3个单位
        water = water + 3; // 注入3个单位的水
    }

    public static void main(String[] args) {
        System.out.println("水池的水量：" + Pool2.water); // 输出水池当前水量
        System.out.println("水池注水两次。");
        Pool2.inlet(); // 调用静态的注水方法
        Pool2.inlet(); // 调用静态的注水方法
        System.out.println("水池的水量：" + Pool2.water); // 输出水池当前水量
        System.out.println("水池放水一次。");
        Pool2.outlet(); // 调用静态的放水方法
        System.out.println("水池的水量：" + Pool2.water); // 输出水池当前水量
    }
}
