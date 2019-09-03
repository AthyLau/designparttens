package com.demik.designparttens.testpatterns.bridge;

/**
 * Function:桥接模式具体实现类
 *
 * @author liubing
 * Date: 2019/8/29 10:52 AM
 * @since JDK 1.8
 */
public class Bridge extends BridgeAbstraction {


    public Bridge(DrawCircleAPI drawCircleAPI) {
        super(drawCircleAPI);
    }

    public void drawCircle(){
        super.getDrawCircleAPI().drawCircle();
    }

    @Override
    public void operation() {
        System.out.println("some else operation");
    }

}
