package com.github.mrcaoyc.factory.abstractfactory;

/**
 * 小汽车
 *
 * @author CaoYongCheng
 */
public class Car implements Auto {
    @Override
    public void drive() {
        System.out.println("小轿车启动了");
    }
}
