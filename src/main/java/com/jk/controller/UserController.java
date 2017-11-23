package com.jk.controller;

import com.jk.model.Cangku;
import com.jk.model.Tree;
import com.jk.model.User;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2017/11/14.
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getCangku")
    public List<Cangku> getCangku(){
        List<Cangku> list = userService.getCangku();
        return list;
    }

    @RequestMapping("/getTree")
    public List<Tree> getTree(){
        List<Tree> list = userService.getTree();
        return list;
    }

    @RequestMapping("/selectUser")
    public List<User> selectUser(){
        List<User> list = userService.selectUser();
        return list;
    }
}
