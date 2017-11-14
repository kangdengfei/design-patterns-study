package designpattern.observerpattern;

/**
 * created  by KDF on 2017/11/14.
 */


public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
