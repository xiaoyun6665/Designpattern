package com.yun.AbstractFactory.buttons;

public class MacOSButton implements Button{
    @Override
    public void paint() {
        System.out.println("you have created MacOSButton");
    }
}
