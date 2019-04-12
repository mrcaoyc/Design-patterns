package com.github.mrcaoyc.factory.factorymethod;

/**
 * @author CaoYongCheng
 */
public class CarFactory implements IAutoFactory {
    @Override
    public Auto produce() {
        return new Car();
    }
}
