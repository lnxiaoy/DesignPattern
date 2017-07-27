package com.example.factorymethodpattern;

public class FileLoggerFactory implements LoggerFactory{
    public Logger createLogger(){
        Logger logger = new FileLogger();
        return logger;
    }
}
