package com.github.mrcaoyc.factory.abstractfactory;

/**
 * @author CaoYongCheng
 */
public class CarLight implements Light {
    @Override
    public void turnOn() {
        System.out.println("小车大灯亮了");
    }
}
