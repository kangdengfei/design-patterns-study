package designpattern.single;

/**
 * created  by KDF on 2017/11/14.
 */


public class Single {
    private Single(){}
    private static Single single;

    public static Single getSingle() {
        if(single == null){
            synchronized (Single.class){
                if (single == null){
                    single = new Single();
                }
            }
        }

        return single;
    }

    public void showMessage(){
        System.out.println("Hello World");
    }
}
