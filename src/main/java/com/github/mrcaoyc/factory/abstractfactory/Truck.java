package com.github.mrcaoyc.factory.abstractfactory;

/**
 * @author CaoYongCheng
 */
public class Truck implements Auto {
    @Override
    public void drive() {
        System.out.println("卡车启动了");
    }
}
