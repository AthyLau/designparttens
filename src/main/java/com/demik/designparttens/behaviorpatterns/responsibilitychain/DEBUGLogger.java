package com.demik.designparttens.behaviorpatterns.responsibilitychain;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/9/3 1:27 PM
 * @since JDK 1.8
 */
public class DEBUGLogger extends AbstractLogger{

    public DEBUGLogger(Integer level) {
        super(level);
    }

    @Override
    public void write(String message) {
        logger.debug(message);
    }
}
