package com.example.simplefactorypattern;

public abstract class Product{
    public void methodSame(){
        //公共方法
        System.out.println("Printing common method!");
    }
    //抽象方法各自实现
    public abstract void methodDiff();
}
