package designpattern.decoratorpattern;

/**
 * created  by KDF on 2017/11/21.
 */


public abstract class ShapeDecorator implements Shape  {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
    }
}
