package com.demik.designparttens.testpatterns.bridge;

/**
 * Function:    桥接抽象类
 *
 * @author liubing
 * Date: 2019/8/29 10:50 AM
 * @since JDK 1.8
 */
public abstract class BridgeAbstraction {

    private DrawCircleAPI drawCircleAPI;

    public BridgeAbstraction(DrawCircleAPI drawCircleAPI) {
        this.drawCircleAPI = drawCircleAPI;
    }

    public DrawCircleAPI getDrawCircleAPI() {
        return drawCircleAPI;
    }

    public void setDrawCircleAPI(DrawCircleAPI drawCircleAPI) {
        this.drawCircleAPI = drawCircleAPI;
    }

    public abstract void drawCircle();

    public abstract void operation();

}
