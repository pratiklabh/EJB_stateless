package com.sts.ejb_stateless.test;

import javax.ejb.Local;
@Local
public interface HelloBeanLocal {
    String sayHello();
}
