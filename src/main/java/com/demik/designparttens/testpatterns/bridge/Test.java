package com.demik.designparttens.testpatterns.bridge;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/8/29 10:54 AM
 * @since JDK 1.8
 */
public class Test {

    public static void main(String args[]){
        Bridge bridgeXL = new Bridge(new XiaoLi());
        Bridge bridgeXM = new Bridge(new XiaoMing());

        bridgeXL.drawCircle();
        bridgeXM.drawCircle();


    }

}
