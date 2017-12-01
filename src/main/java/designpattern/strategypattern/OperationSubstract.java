package designpattern.strategypattern;

/**
 * created  by KDF on 2017/12/1.
 */


public class OperationSubstract implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}

