package designpattern.strategypattern;

/**
 * created  by KDF on 2017/12/1.
 */


public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}

