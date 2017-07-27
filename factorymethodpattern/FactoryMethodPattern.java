package com.example.factorymethodpattern;

/**
 * Created by jinshu.fu on 2017/7/27.
 * Description : 工厂方法模式
 * 模式动机：相比于简单工厂模式，本模式提供不同的工厂类，实例化放到子类方法里
 * 角色：1. 具体产品类
 *       2. 将具体产品的公共方法抽象出来，做成一个抽象产品类
 *       3. 具体工厂类
 *       4. 抽象工厂类，可以加入重载方法
 * PS:新的需求来的时候只需要添加新的工厂和新的产品就可以
 *
 */

public class FactoryMethodPattern {
    public static void main(String []args){
//        Factory factory;
//        factory = new ConcreteFactory();
//        Product product;
//        product = factory.factoryMethod();
        LoggerFactory factory;
        Logger logger;
        factory = new FileLoggerFactory();
        logger = factory.createLogger();
        logger.writeLog();
    }
}

//public interface Factory{
//    public Product factoryMethod();
//}
//public class ConcreteFactory implements Factory{
//    public Product factroyMethod(){
//        return new ConcreteProduct();
//    }
//    //其他操作，连接数据库 读取配置文件等
//}

