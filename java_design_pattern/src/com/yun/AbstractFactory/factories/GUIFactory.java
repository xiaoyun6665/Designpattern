package com.yun.AbstractFactory.factories;

import com.yun.AbstractFactory.buttons.Button;
import com.yun.AbstractFactory.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
