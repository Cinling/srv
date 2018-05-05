package cn.cinling.srv.service.user;

import cn.cinling.srv.entity.UserEntity;

import java.util.List;

public interface UserService {
    int addUser(UserEntity user);

    List<UserEntity> findAllUser(int pageNum, int pageSize);
}
