package com.sts.ejb_stateless.test;

import javax.ejb.Stateless;
@Stateless
public class HelloBean implements HelloBeanLocal {
    @Override
    public String sayHello() {
        return "Hello, EJB!";
    }
}
