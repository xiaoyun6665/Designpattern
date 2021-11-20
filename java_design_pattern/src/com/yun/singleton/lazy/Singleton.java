package com.yun.singleton.lazy;

public class Singleton {
    private static Singleton singleton;

    public Singleton getInstance(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }

    public static Singleton getSingleton() {
        return singleton;
    }

    public void doSomeThing(){
        System.out.println("this is LazySingleton!");
    }
}
