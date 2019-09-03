package com.demik.designparttens.testpatterns.bridge;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/8/29 10:31 AM
 * @since JDK 1.8
 */
public class XiaoMing implements DrawCircleAPI {

    @Override
    public void drawCircle() {
        System.out.println("xiaoming draw one Green circle !");
    }

}
