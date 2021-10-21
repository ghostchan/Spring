package com.itheima.proxy.jdk;

/**
 * @author jinn
 */
public class Target implements TargetInterface {
    @Override
    public void save() {
        System.out.println("save running.....");
    }
}
