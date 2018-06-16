package cn.cinling.srv.database.service.user;

import cn.cinling.srv.database.entity.UserEntity;

import java.util.List;

public interface UserService {
    int addUser(UserEntity user);

    List<UserEntity> findAllUser(int pageNum, int pageSize);
}
