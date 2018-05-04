package cn.cinling.srv.service.user;

import cn.cinling.srv.model.UserDomain;

import java.util.List;

public interface UserService {
    int addUser(UserDomain user);

    List<UserDomain> findAllUser(int pageNum, int pageSize);
}
