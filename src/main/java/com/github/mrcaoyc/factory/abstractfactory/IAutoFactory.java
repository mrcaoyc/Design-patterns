package com.github.mrcaoyc.factory.abstractfactory;

/**
 * @author CaoYongCheng
 */
public interface IAutoFactory {
    Auto produce();

    Light produceLight();
}
