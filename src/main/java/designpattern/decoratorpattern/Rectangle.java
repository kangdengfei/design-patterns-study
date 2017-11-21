package designpattern.decoratorpattern;

/**
 * created  by KDF on 2017/11/21.
 */


public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
