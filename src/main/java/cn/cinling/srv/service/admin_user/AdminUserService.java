package cn.cinling.srv.service.admin_user;

import cn.cinling.srv.entity.AdminUserEntity;

import java.util.List;

public interface AdminUserService {
    int AddAdminUser(AdminUserEntity adminUserEntity);
    List<AdminUserEntity> GetAll();
}
