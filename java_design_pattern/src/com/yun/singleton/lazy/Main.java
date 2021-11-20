package com.yun.singleton.lazy;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();
        singleton.doSomeThing();
    }
}
