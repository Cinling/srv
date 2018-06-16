package cn.cinling.srv.database.service.admin_user;

import cn.cinling.srv.database.entity.AdminUserEntity;

import java.util.List;

public interface AdminUserService {
    int AddAdminUser(AdminUserEntity adminUserEntity);
    List<AdminUserEntity> GetAll();
}
