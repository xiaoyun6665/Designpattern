package com.yun.AbstractFactory;

import com.yun.AbstractFactory.app.Application;
import com.yun.AbstractFactory.factories.GUIFactory;
import com.yun.AbstractFactory.factories.MacOSFactory;
import com.yun.AbstractFactory.factories.WindowsFactory;

import java.util.Locale;

public class Demo {

    private static Application configureApplication(){
        Application application;
        GUIFactory guiFactory;
        String osName = System.getProperty("os.name").toLowerCase(Locale.ROOT);
        if(osName.contains("mac")){
            guiFactory = new MacOSFactory();
        }else{
            guiFactory = new WindowsFactory();
        }
        application = new Application(guiFactory);
        return application;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
