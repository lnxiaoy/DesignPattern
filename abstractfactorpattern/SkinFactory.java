package com.example.abstractfactorpattern;

/**
 * Created by jinshu.fu on 2017/7/27.
 * Description : 1.
 */

public interface SkinFactory {
    public Button createButton();
    public TextField createTextField();
    public ComboBox createComboBox();
}
