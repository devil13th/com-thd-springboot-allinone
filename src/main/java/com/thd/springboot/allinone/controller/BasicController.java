package com.thd.springboot.allinone.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * com.thd.springboot.allinone.controller.BasicController
 * User: devil13th
 * Date: 2019/9/17
 * Time: 23:21
 * Description: No Description
 */
public class BasicController {
    public Logger getLog() {
        return log;
    }

    public void setLog(Logger log) {
        this.log = log;
    }

    private Logger log = LoggerFactory.getLogger(this.getClass());

}
