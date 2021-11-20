package com.yun.factorymethod;

public class TaxiFactory extends CarFactory{
    @Override
    public Car createCar() {
        return new Taxi();
    }
}
