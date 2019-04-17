package com.github.mrcaoyc.builder;

/**
 * 指挥者
 *
 * @author CaoYongCheng
 */
public class Director {
    public static Compute constructCompute(Builder builder) {
        // 组装零部件
        builder.buildMainBoard()
                .buildCpu()
                .buildHardDisk();
        // 生产出具体的产品
        return builder.buildCompute();
    }
}
