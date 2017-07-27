package com.example.simplefactorypattern;

/**
 * Created by jinshu.fu on 2017/7/27.
 * Description : 1.
 */


public class Factory{
    public static Product getProduct(String arg){
        Product product = null;
        if(arg.equalsIgnoreCase("A")){
            product = new ConcreteProductA();
        }else if(arg.equalsIgnoreCase("B")){
            product = new ConcreteProductB();
        }
        return product;
    }
}
