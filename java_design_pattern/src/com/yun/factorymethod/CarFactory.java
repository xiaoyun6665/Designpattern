package com.yun.factorymethod;

public abstract class CarFactory {
    public void makeCarRun(){
        Car car = createCar();
        car.run();
    }

    public abstract Car createCar();
}
