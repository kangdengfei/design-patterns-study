package designpattern.bridgepattern;

/**
 * created  by KDF on 2017/12/1.
 */


public abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}

