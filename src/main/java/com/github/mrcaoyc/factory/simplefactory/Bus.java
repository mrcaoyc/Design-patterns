package com.github.mrcaoyc.factory.simplefactory;

/**
 * 大巴车
 *
 * @author CaoYongCheng
 */
public class Bus implements Auto {
    @Override
    public void drive() {
        System.out.println("大巴车启动了");
    }
}
