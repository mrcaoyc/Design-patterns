package com.github.mrcaoyc.prototype;

/**
 * @author CaoYongCheng
 */
public class Test {
    public static void main(String[] args) {
        Resume r1=new Resume("cyc",18,"male");
        Resume r2 = r1.clone();

        System.out.println(r1);
        System.out.println(r2);
    }
}
