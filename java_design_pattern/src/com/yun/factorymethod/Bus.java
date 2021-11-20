package com.yun.factorymethod;

public class Bus implements Car{
    @Override
    public void run() {
        System.out.println("run Bus");
    }
}
