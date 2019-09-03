package com.demik.designparttens.behaviorpatterns.responsibilitychain;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/9/3 3:08 PM
 * @since JDK 1.8
 */
public class DEFAULTLogger extends AbstractLogger{

    public DEFAULTLogger(Integer level) {
        super(level);
    }

    @Override
    public void write(String message) {
        logger.info("default : " + message);
    }
}
