package com.yun.AbstractFactory.factories;

import com.yun.AbstractFactory.buttons.Button;
import com.yun.AbstractFactory.buttons.MacOSButton;
import com.yun.AbstractFactory.checkboxes.Checkbox;
import com.yun.AbstractFactory.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
