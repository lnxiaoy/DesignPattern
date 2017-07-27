package com.example.factorymethodpattern;

public class DatabaseLoggerFactory implements LoggerFactory{
    public Logger createLogger(){
        Logger logger = new DatabaseLogger();
        return logger;
    }
    public Logger createLogger(String arg){
        Logger logger = new DatabaseLogger();
        return logger;
    }
    public Logger createLogger(Object obj){
        Logger logger = new DatabaseLogger();
        return logger;
    }
}
