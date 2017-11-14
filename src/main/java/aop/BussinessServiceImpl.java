package aop;

import aop.BussinessService;

import java.util.logging.Logger;

/**
 * created  by KDF on 2017/11/14.
 */


public class BussinessServiceImpl implements BussinessService {
    private Logger logger = Logger.getLogger(this.getClass().getSimpleName());

    @Override
    public String login(String username, String password) {
        return "login success";
    }

    @Override
    public String find() {
        return "find success";
    }

}