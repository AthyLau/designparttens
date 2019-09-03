package com.demik.designparttens.behaviorpatterns.responsibilitychain;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/9/3 1:33 PM
 * @since JDK 1.8
 */
public class WARNLogger extends AbstractLogger{

    public WARNLogger(Integer level) {
        super(level);
    }

    @Override
    public void write(String message) {
        logger.warn(message);
    }
}
