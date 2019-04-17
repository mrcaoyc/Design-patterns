package com.github.mrcaoyc.prototype;

import lombok.Data;

import java.time.LocalTime;

/**
 * 一个简历对象
 *
 * @author CaoYongCheng
 */
@Data
public class Resume implements Cloneable {
    private String name;
    private int age;
    private String gender;

    public Resume(String name, int age, String gender) {
        System.out.println(LocalTime.now() + "：对象开始构建，耗时比较长，请耐心等待.......");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.name = name;
        this.age = age;
        this.gender = gender;
        System.out.println(LocalTime.now() + "：对象创建完成了");
    }

    @Override
    public Resume clone() {
        Resume resume = null;
        try {
            resume = (Resume) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return resume;
    }
}

