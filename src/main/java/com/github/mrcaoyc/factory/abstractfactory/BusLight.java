package com.github.mrcaoyc.factory.abstractfactory;

/**
 * @author CaoYongCheng
 */
public class BusLight implements Light {
    @Override
    public void turnOn() {
        System.out.println("大巴车大灯亮了");
    }
}
