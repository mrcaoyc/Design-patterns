package com.github.mrcaoyc.factory.factorymethod;

/**
 * @author CaoYongCheng
 */
public class BusFactory implements IAutoFactory {
    @Override
    public Auto produce() {
        return new Bus();
    }
}
