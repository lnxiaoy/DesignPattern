package com.example.factorymethodpattern;

public class FileLogger implements Logger{
    public void writeLog(){
        System.out.println("File recording...");
    }
}
