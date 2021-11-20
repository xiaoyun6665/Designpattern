package com.yun.singleton.hungry;

public class Singleton {
    private static final Singleton singleton = new Singleton();

    public static Singleton getSingleton() {
        return singleton;
    }

    public void doSomeThing(){
        System.out.println("this is HungrySingleton!");
    }
}
