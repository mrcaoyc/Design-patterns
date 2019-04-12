package com.github.mrcaoyc.factory.factorymethod;

/**
 * @author CaoYongCheng
 */
public class Truck implements Auto {
    @Override
    public void drive() {
        System.out.println("卡车启动了");
    }
}
