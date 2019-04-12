package com.github.mrcaoyc.factory.abstractfactory;


/**
 * @author CaoYongCheng
 */
public class Test {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        // 这里用反射方式创建工厂
        IAutoFactory carFactory = (IAutoFactory) Class.forName("com.github.mrcaoyc.factory.abstractfactory.CarFactory").newInstance();
        carFactory.produce().drive();
        carFactory.produceLight().turnOn();

        IAutoFactory busFactory = (IAutoFactory) Class.forName("com.github.mrcaoyc.factory.abstractfactory.BusFactory").newInstance();
        busFactory.produce().drive();
        busFactory.produceLight().turnOn();

        IAutoFactory truckFactory = (IAutoFactory) Class.forName("com.github.mrcaoyc.factory.abstractfactory.TruckFactory").newInstance();
        truckFactory.produce().drive();
        truckFactory.produceLight().turnOn();
    }
}
