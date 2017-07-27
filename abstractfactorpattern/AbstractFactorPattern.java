package com.example.abstractfactorpattern;

/**
 * Created by jinshu.fu on 2017/7/27.
 * Description : 抽象工厂模式
 * 模式动机：解决工厂方法成对添加类导致代码庞大，资源损耗的问题
 * 角色：1. 抽象工厂
 *       2. 具体工厂
 *       3. 抽象产品
 *       4. 具体产品
 * PS：将产品分组分线，形成一个二维的数组
 *
 */

public class AbstractFactorPattern {
    public static void main(String args[]) {
        //使用抽象层定义
        SkinFactory factory;
        Button bt;
        TextField tf;
        ComboBox cb;
        bt = factory.createButton();
        tf = factory.createTextField();
        cb = factory.createComboBox();
        bt.display();
        tf.display();
        cb.display();
    }
}
