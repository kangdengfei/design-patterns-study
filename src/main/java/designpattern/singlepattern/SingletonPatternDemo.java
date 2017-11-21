package designpattern.singlepattern;

/**
 * created  by KDF on 2017/11/14.
 */


public class SingletonPatternDemo {
    public static void main(String[] args) {
        Single single = Single.getSingle();
        single.showMessage();
    }

}
