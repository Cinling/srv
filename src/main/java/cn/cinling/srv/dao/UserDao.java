package cn.cinling.srv.dao;

import cn.cinling.srv.model.UserDomain;

import java.util.List;

public interface UserDao {


    int insert(UserDomain record);



    List<UserDomain> selectUsers();
}