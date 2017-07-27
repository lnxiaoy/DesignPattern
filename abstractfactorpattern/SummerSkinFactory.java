package com.example.abstractfactorpattern;

/**
 * Created by jinshu.fu on 2017/7/27.
 * Description : 1.
 */

public class SummerSkinFactory implements SkinFactory {
    public Button createButton(){
        return new SummerButton();
    }public TextField createTextField(){
        return new SummerTextField();
    }public ComboBox createComboBox(){
        return new SummerComboBox();
    }
}
