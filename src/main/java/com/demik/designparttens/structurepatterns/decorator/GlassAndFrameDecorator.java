package com.demik.designparttens.structurepatterns.decorator;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/8/22 1:48 PM
 * @since JDK 1.8
 */
public class GlassAndFrameDecorator extends PictureDecorator{

    private boolean useGlass;
    private boolean useFrame;

    public GlassAndFrameDecorator(Picture picture, boolean useGlass, boolean useFrame) {
        super(picture);
        this.useGlass = useGlass;
        this.useFrame = useFrame;
    }

    public void show() {
        super.show();
        System.out.println("Decorator :"+glass()+and()+frame());
    }

    private String and(){
        if(useGlass && useFrame){
            return "and";
        }
        return "";
    }

    private String glass(){
        if(useGlass){
            return " glass ";
        }
        return "";
    }

    private String frame(){
        if(useFrame){
            return " frame ";
        }
        return "";
    }

}
