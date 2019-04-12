package com.github.mrcaoyc.factory.abstractfactory;

/**
 * @author CaoYongCheng
 */
public class TruckFactory implements IAutoFactory {
    @Override
    public Auto produce() {
        return new Truck();
    }

    @Override
    public Light produceLight() {
        return new TruckLight();
    }
}
