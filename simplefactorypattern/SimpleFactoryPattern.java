package com.example.simplefactorypattern;
/*
 * author：lnxiaoy
 * description：简单工厂模式（Simple Factory Pattern/Static Factory Patter)
 * 模式动机：根据参数不同，返回不同类的实例
 * 角色：1. 具体产品类
 *       2. 将具体产品的公共方法抽象出来，做成一个抽象产品类
 *       3. 工厂类，负责传入参数，产出实例，需要有逻辑判断
 */
public class SimpleFactoryPattern {
    public static void main(String [] args){
        Product product;
        product = Factory.getProduct("A");
        product.methodDiff();
        product.methodSame();

    }
}
