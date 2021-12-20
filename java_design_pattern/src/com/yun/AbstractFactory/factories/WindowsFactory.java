package com.yun.AbstractFactory.factories;

import com.yun.AbstractFactory.buttons.Button;
import com.yun.AbstractFactory.buttons.MacOSButton;
import com.yun.AbstractFactory.buttons.WindowsButton;
import com.yun.AbstractFactory.checkboxes.Checkbox;
import com.yun.AbstractFactory.checkboxes.MacOSCheckbox;
import com.yun.AbstractFactory.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
