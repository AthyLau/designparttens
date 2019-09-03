package com.demik.designparttens.behaviorpatterns.responsibilitychain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Function:
 *
 * @author liubing
 * Date: 2019/9/3 11:56 AM
 * @since JDK 1.8
 */
public abstract class AbstractLogger {
    private static Integer START = 0;
    private static Integer INFO = 1;
    private static Integer DEBUG = 2;
    private static Integer WARNING = 3;

    private Integer level;
    private AbstractLogger abstractLogger;
    final Logger logger = LoggerFactory.getLogger(this.getClass());


    public static final AbstractLogger loggerEntenr = AbstractLogger.getAbstractLogger(START,"");
    private static final AbstractLogger infoLogger = AbstractLogger.getAbstractLogger(INFO,"info");
    private static final AbstractLogger debugLogger = AbstractLogger.getAbstractLogger(DEBUG,"debug");
    private static final AbstractLogger warnLogger = AbstractLogger.getAbstractLogger(WARNING,"warn");

    static {
        loggerEntenr.setNextLogger(infoLogger);
        infoLogger.setNextLogger(debugLogger);
        debugLogger.setNextLogger(warnLogger);
    }

    public AbstractLogger(Integer level){
        this.level = level;
    }
    private void setNextLogger(AbstractLogger logger){
        this.abstractLogger = logger;
    }
    public void transmitLogger(int level, String message){
        if (this.level == level) {
            write(message);
        }else {
            abstractLogger.transmitLogger(level, message);
        }
    }
    public abstract void write(String message);

    public static AbstractLogger getAbstractLogger(int level, String logger){

        switch (logger){
            case "info":
                return new INFOLogger(level);
            case "debug":
                return new DEBUGLogger(level);
            case "warn":
                return new WARNLogger(level);
            default:
                return new DEFAULTLogger(level);
        }
    }

    @Override
    public String toString() {
        return "AbstractLogger{" +
                "DEBUG=" + DEBUG +
                ", WARNING=" + WARNING +
                ", INFO=" + INFO +
                ", level=" + level +
                '}';
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}
