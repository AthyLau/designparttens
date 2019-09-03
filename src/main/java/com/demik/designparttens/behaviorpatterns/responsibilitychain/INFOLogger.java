package com.demik.designparttens.behaviorpatterns.responsibilitychain;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/9/3 1:36 PM
 * @since JDK 1.8
 */
public class INFOLogger extends AbstractLogger{

    public INFOLogger(Integer level) {
        super(level);
    }

    @Override
    public void write(String message) {
        logger.info(message);
    }
}
