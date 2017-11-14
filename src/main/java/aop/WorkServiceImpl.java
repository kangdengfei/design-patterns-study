package aop;

import aop.WorkService;

/**
 * created  by KDF on 2017/11/14.
 */


public class WorkServiceImpl implements WorkService {
    @Override
    public String work() {
        return "work success";
    }

    @Override
    public String sleep() {
        return "sleep success";
    }
}
