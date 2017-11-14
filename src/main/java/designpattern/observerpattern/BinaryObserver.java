package designpattern.observerpattern;

/**
 * created  by KDF on 2017/11/14.
 */


public class BinaryObserver extends Observer{

    public BinaryObserver(Subject subject){
        this.subject = subject;
        subject.attach(this);

    }

    @Override
    public void update() {
        System.out.println( "Binary String: " + Integer.toBinaryString( subject.getStatus() ) );
    }
}
