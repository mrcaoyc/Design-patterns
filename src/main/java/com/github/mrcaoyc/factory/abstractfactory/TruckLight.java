package com.github.mrcaoyc.factory.abstractfactory;

/**
 * @author CaoYongCheng
 */
public class TruckLight implements Light {
    @Override
    public void turnOn() {
        System.out.println("卡车大灯亮了");
    }
}
