package com.yun.factorymethod;

public class Main {
    private static CarFactory carFactory;

    public static void main(String[] args) {
        carFactory = new BusFactory();
        carFactory.makeCarRun();

        carFactory = new TaxiFactory();
        carFactory.makeCarRun();
    }
}
