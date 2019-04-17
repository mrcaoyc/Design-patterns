package com.github.mrcaoyc.builder;

/**
 * 具体建造者
 *
 * @author CaoYongCheng
 */
public class Compute2Builder implements Builder {
    private Compute compute = new Compute();

    @Override
    public Builder buildMainBoard() {
        compute.setMainBoard("技嘉");
        return this;
    }

    @Override
    public Builder buildHardDisk() {
        compute.setHandDisk("西部数据");
        return this;
    }

    @Override
    public Builder buildCpu() {
        compute.setCpu("CMD");
        return this;
    }

    @Override
    public Compute buildCompute() {
        return compute;
    }
}
