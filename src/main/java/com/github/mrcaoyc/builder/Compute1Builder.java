package com.github.mrcaoyc.builder;

/**
 * 具体建造者
 *
 * @author CaoYongCheng
 */
public class Compute1Builder implements Builder {
    private Compute compute = new Compute();

    @Override
    public Builder buildMainBoard() {
        compute.setMainBoard("华硕");
        return this;
    }

    @Override
    public Builder buildHardDisk() {
        compute.setHandDisk("东芝");
        return this;
    }

    @Override
    public Builder buildCpu() {
        compute.setCpu("Inter i7");
        return this;
    }

    @Override
    public Compute getCompute() {
        return compute;
    }
}
