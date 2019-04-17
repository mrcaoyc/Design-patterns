package com.github.mrcaoyc.builder;

/**
 * @author CaoYongCheng
 */
public class Test {
    public static void main(String[] args) {
        Compute compute1 = Director.constructCompute(new Compute1Builder());
        Compute compute2 = Director.constructCompute(new Compute2Builder());
        System.out.println(compute1);
        System.out.println(compute2);
    }
}
