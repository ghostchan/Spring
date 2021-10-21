package com.itheima.aop;

/**
 * @author jinn
 */
public class Target implements TargetInterface {
    @Override
    public void save() {
        System.out.println("save running.....");
    }
}
