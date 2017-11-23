package com.jk.service;

import com.jk.dao.UserDao;
import com.jk.model.Cangku;
import com.jk.model.Tree;
import com.jk.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/11/14.
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public List<Cangku> getCangku() {
        return userDao.getCangku();
    }

    @Override
    public List<Tree> getTree() {
        return userDao.getTree();
    }

    @Override
    public List<User> selectUser() {
        return userDao.selectUser();
    }

}
