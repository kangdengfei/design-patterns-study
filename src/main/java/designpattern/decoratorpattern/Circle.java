package designpattern.decoratorpattern;

/**
 * created  by KDF on 2017/11/21.
 */


public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
