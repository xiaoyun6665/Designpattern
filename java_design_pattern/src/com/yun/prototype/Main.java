package com.yun.prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype data1 = new Prototype("data1");
        Prototype clone = (Prototype)data1.clone();

        System.out.println(data1.getData());
        System.out.println(clone.getData());
    }
}
