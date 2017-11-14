package designpattern.observerpattern;

/**
 * created  by KDF on 2017/11/14.
 */


public class HexaObserver extends Observer {
    public HexaObserver(Subject subject){
        this.subject = subject;
        subject.attach(this);
    }
    @Override
    public void update() {

    }
}
