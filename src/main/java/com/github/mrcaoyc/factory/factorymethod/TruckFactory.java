package com.github.mrcaoyc.factory.factorymethod;

/**
 * @author CaoYongCheng
 */
public class TruckFactory implements IAutoFactory {
    @Override
    public Auto produce() {
        return new Truck();
    }
}
