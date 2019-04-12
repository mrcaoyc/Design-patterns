package com.github.mrcaoyc.factory.abstractfactory;

/**
 * @author CaoYongCheng
 */
public class BusFactory implements IAutoFactory {

    @Override
    public Auto produce() {
        return new Bus();
    }

    @Override
    public Light produceLight() {
        return new BusLight();
    }

}
