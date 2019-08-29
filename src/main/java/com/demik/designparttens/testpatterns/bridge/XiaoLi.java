package com.demik.designparttens.testpatterns.bridge;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/8/29 10:32 AM
 * @since JDK 1.8
 */
public class XiaoLi implements DrawCircleAPI {
    @Override
    public void drawCircle() {
        System.out.println("xiaoli draw one red circle !");
    }
}
