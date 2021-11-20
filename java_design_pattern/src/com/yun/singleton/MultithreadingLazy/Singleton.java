package com.yun.singleton.MultithreadingLazy;

public class Singleton {
    private static volatile Singleton singleton;

    public static Singleton getInstance() {
        if(singleton == null){
            synchronized (Singleton.class){
                if(singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    public void doSomething(){
        System.out.println("this is MultithreadingLazySingleton!");
    }
}
