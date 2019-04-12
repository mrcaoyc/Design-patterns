package com.github.mrcaoyc.singleton;

/**
 * 饿汉式（静态常量） [可用]
 *
 *  <p>优点：这种写法比较简单，就是在类装载的时候就完成实例化。避免了线程同步问题。</p>
 * <p>缺点：在类装载的时候就完成实例化，没有达到Lazy Loading的效果。如果从始至终从未使用过这个实例，则会造成内存的浪费。</p>
 *
 * @author CaoYongCheng
 */
public class Singleton1 {
    private static Singleton1 singleton1 = new Singleton1();

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        return singleton1;
    }
}
