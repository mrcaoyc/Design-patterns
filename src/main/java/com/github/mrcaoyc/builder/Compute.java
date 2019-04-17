package com.github.mrcaoyc.builder;

import lombok.Data;

/**
 * 这是一个具体的产品，产品由很多零部件组成
 *
 * @author CaoYongCheng
 */
@Data
public class Compute {
    private String mainBoard;
    private String handDisk;
    private String cpu;
}
