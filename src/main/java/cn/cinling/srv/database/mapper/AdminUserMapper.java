package cn.cinling.srv.database.mapper;

import cn.cinling.srv.database.entity.AdminUserEntity;

import java.util.List;

public interface AdminUserMapper {
    int Insert(AdminUserEntity adminUserEntity);
    List<AdminUserEntity> SelectAll();
}
