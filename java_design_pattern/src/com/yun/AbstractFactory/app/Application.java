package com.yun.AbstractFactory.app;

import com.yun.AbstractFactory.buttons.Button;
import com.yun.AbstractFactory.checkboxes.Checkbox;
import com.yun.AbstractFactory.factories.GUIFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory guiFactory){
        button = guiFactory.createButton();
        checkbox = guiFactory.createCheckbox();
    }

    public void paint(){
        button.paint();
        checkbox.paint();
    }
}
