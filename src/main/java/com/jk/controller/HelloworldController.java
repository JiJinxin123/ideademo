package com.jk.controller;


import com.fasterxml.jackson.databind.util.JSONPObject;
import com.jk.model.User;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/11/14.
 */
@RestController
public class HelloworldController {
    @RequestMapping("/")
    public String index() {
        return "";
    }

    @RequestMapping("/user/{userData}")
    public String testController(@PathVariable String userData) {
        return "Hello"+userData;
    }

    @RequestMapping("/getUser")
    public User getUser() {
        User user = new User();
        user.setUserName("是多少");
        user.setUserPwd("123");

        return user;
    }

    @RequestMapping(value = "/testOne",produces = MediaType.APPLICATION_JSON_VALUE)
    public User testOne() {
        User user = new User();
        user.setUserName("是多少");
        user.setUserPwd("123");

        return user;
    }
}
