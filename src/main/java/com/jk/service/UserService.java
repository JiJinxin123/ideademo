package com.jk.service;

import com.jk.model.Cangku;
import com.jk.model.Tree;
import com.jk.model.User;

import java.util.List;

/**
 * Created by Administrator on 2017/11/14.
 */
public interface UserService {
    List<Cangku> getCangku();

    List<Tree> getTree();

    List<User> selectUser();
}
