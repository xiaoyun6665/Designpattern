package com.yun.factorymethod;

public class BusFactory extends CarFactory{
    @Override
    public Car createCar() {
        return new Bus();
    }
}
