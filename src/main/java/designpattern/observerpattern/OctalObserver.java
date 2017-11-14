package designpattern.observerpattern;

/**
 * created  by KDF on 2017/11/14.
 */


public class OctalObserver extends Observer {

    public OctalObserver(Subject subject){
        this.subject = subject;
        subject.attach(this);
    }
    @Override
    public void update() {
        System.out.println( "Octal String: " + Integer.toOctalString( subject.getStatus() ) );
    }
}
