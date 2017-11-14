package designpattern.observerpattern;

/**
 * created  by KDF on 2017/11/14.
 */


public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

       new  BinaryObserver(subject);
       new HexaObserver(subject);
       new OctalObserver(subject);

        System.out.println("First state change: 15");
        subject.setStatus(15);
        System.out.println("Second state change: 10");
        subject.setStatus(10);
    }
}
