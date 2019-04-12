package com.github.mrcaoyc.factory.simplefactory;

/**
 * 汽车工厂
 *
 * @author CaoYongCheng
 */
public class AutoFactory {
    public Auto produce(String name) {
        switch (name) {
            case "car":
                return new Car();
            case "bus":
                return new Bus();
            default:
                throw new RuntimeException("还没有这样的汽车");
        }
    }
}
