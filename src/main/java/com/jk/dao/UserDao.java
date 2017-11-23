package com.jk.dao;

import com.jk.model.Cangku;
import com.jk.model.Tree;
import com.jk.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Administrator on 2017/11/14.
 */
@Mapper
public interface UserDao {

    @Select("select * from Cangku")
    List<Cangku> getCangku();

    @Select("select * from Tree")
    List<Tree> getTree();

    @Select("select * from User")
    List<User>  selectUser();
}
