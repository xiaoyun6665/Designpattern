package com.yun.factorymethod;

public class Taxi implements Car{
    @Override
    public void run() {
        System.out.println("run taxi");
    }
}
