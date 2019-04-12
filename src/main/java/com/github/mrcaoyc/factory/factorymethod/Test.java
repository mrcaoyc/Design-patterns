package com.github.mrcaoyc.factory.factorymethod;

/**
 * @author CaoYongCheng
 */
public class Test {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        // 这里用反射方式创建工厂
        IAutoFactory carFactory = (IAutoFactory) Class.forName("com.github.mrcaoyc.factory.factorymethod.CarFactory").newInstance();
        carFactory.produce().drive();

        IAutoFactory busFactory = (IAutoFactory) Class.forName("com.github.mrcaoyc.factory.factorymethod.BusFactory").newInstance();
        busFactory.produce().drive();

        IAutoFactory truckFactory = (IAutoFactory) Class.forName("com.github.mrcaoyc.factory.factorymethod.TruckFactory").newInstance();
        truckFactory.produce().drive();
    }
}
