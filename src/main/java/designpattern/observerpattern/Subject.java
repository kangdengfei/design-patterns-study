package designpattern.observerpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * created  by KDF on 2017/11/14.
 */

public class Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    private  int status;
    public int getStatus(){
        return  status;
    }
    public void setStatus(int status){
        this.status = status;
    }

    public  void attach(Observer observer){
        observers.add(observer);
    }
    public void notifyAllObservers(){
        for(Observer observer:observers){
            observer.update();
        }
    }

}
