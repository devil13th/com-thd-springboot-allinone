package com.thd.springboot.allinone.controller;

import com.thd.springboot.allinone.entity.MyTest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.util.Date;

/**
 * @author devil13th
 **/

//if all methods need with Annotation @ResponseBody then use @RestController be better
//@RestController

@Controller
@RequestMapping("/myTest")
public class MyTestController extends BasicController {

    /**
     * 使用@ResponseBody 直接返回内容
     * @return
     */
    @ResponseBody
    @RequestMapping("/index")
    public MyTest index(){
        this.getLog().info("index");

        MyTest myTest = new MyTest();
        myTest.setName("devil13th");
        myTest.setDatetime(new Timestamp(System.currentTimeMillis()));

        return myTest;
    }

    /**
     * 不使用@ResponseBody 使用ResponseEntity
     * @return
     */
    @RequestMapping("/test1")
    public ResponseEntity<MyTest> test1(){
        this.getLog().info("test1");

        MyTest myTest = new MyTest();
        myTest.setName("devil13th");
        myTest.setDatetime(new Timestamp(System.currentTimeMillis()));

        ResponseEntity<MyTest> re = new ResponseEntity(myTest, HttpStatus.OK);
        return re;
    }

    /**
     * 不使用@ResponseBody 使用ResponseEntity,并且设置相应头信息
     * @return
     */
    @RequestMapping("/test2")
    public ResponseEntity<MyTest> test2(){
        this.getLog().info("test2");

        MyTest myTest = new MyTest();
        myTest.setName("devil13th");
        myTest.setDatetime(new Timestamp(System.currentTimeMillis()));

        HttpHeaders headers = new HttpHeaders();
        headers.add("Custom-Header", "foo");

        ResponseEntity<MyTest> re = new ResponseEntity(myTest,headers, HttpStatus.OK);
        return re;
    }



}
