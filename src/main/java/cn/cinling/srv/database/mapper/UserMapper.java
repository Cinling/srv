package cn.cinling.srv.database.mapper;

import cn.cinling.srv.database.entity.UserEntity;

import java.util.List;

public interface UserMapper {


    int insert(UserEntity record);



    List<UserEntity> selectUsers();
}