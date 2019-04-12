package com.github.mrcaoyc.factory.abstractfactory;

/**
 * @author CaoYongCheng
 */
public class CarFactory implements IAutoFactory {
    @Override
    public Auto produce() {
        return new Car();
    }

    @Override
    public Light produceLight() {
        return new CarLight();
    }
}
