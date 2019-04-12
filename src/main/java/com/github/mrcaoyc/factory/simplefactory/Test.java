package com.github.mrcaoyc.factory.simplefactory;

/**
 * @author CaoYongCheng
 */
public class Test {
    public static void main(String[] args) {
        AutoFactory autoFactory = new AutoFactory();

        // 要生产一个小轿车
        Auto car = autoFactory.produce("car");
        car.drive();

        // 生产大巴车
        Auto bus = autoFactory.produce("bus");
        bus.drive();
    }
}
