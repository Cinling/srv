package cn.cinling.srv.mapper;

import cn.cinling.srv.entity.UserEntity;

import java.util.List;

public interface UserMapper {


    int insert(UserEntity record);



    List<UserEntity> selectUsers();
}