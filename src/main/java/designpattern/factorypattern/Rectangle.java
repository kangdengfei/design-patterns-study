package designpattern.factorypattern;

/**
 * created  by KDF on 2017/11/14.
 */


public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }

}
