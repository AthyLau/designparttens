package com.demik.designparttens.structurepatterns.decorator;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/8/22 1:56 PM
 * @since JDK 1.8
 */
public abstract class PictureDecorator implements Picture {
    protected Picture picture;

    public PictureDecorator(Picture picture) {
        this.picture = picture;
    }

    @Override
    public void show() {
        picture.show();
    }
}
