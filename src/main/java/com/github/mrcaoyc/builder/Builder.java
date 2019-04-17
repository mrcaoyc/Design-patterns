package com.github.mrcaoyc.builder;

/**
 * 抽象建造者
 *
 * @author CaoYongCheng
 */
public interface Builder {
    Builder buildMainBoard();

    Builder buildHardDisk();

    Builder buildCpu();

    Compute getCompute();
}
