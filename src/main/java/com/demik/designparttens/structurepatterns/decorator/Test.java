package com.demik.designparttens.structurepatterns.decorator;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/8/22 1:54 PM
 * @since JDK 1.8
 */
public class Test {

    public static void main(String args[]){

        new MonaLisa().show();
        System.out.println();
        new Sunset().show();
        System.out.println();
        PictureDecorator pd = new GlassAndFrameDecorator(new MonaLisa(),true,true);
        pd.show();

    }

}
