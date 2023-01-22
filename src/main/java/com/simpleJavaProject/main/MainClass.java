package com.simpleJavaProject.main;


import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class MainClass {
    private static final Logger logger = Logger.getLogger("MainClass");

    public static void init() {
        try {
            FileHandler fh;
            fh = new FileHandler("D:/GitWithJenkins/SimpleProject/logs/MyFile.log");
            SimpleFormatter formatter=new SimpleFormatter();
            fh.setFormatter(formatter);
            logger.addHandler(fh);
            logger.info("in init Method of Logger ");
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {
        init();
        logger.info("in MAIN Method of Logger ");
    }
}
