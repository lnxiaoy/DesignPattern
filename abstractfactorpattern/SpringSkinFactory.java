package com.example.abstractfactorpattern;

/**
 * Created by jinshu.fu on 2017/7/27.
 * Description : 1.
 */

public class SpringSkinFactory implements SkinFactory {
    public Button createButton(){
        return new SpringButton();
    }public TextField createTextField(){
        return new SpringTextField();
    }public ComboBox createComboBox(){
        return new SpringComboBox();
    }
}
