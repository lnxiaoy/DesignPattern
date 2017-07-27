package com.example.factorymethodpattern;

public interface LoggerFactory{
    Logger createLogger();
    //Logger createLogger(String args);
   // public Logger createLogger(Object obj);
//    public void writeLog(){
//        Logger logger = this.createLogger();
//        logger.writeLog();
//    }
}
