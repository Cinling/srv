package cn.cinling.srv.mapper;

import cn.cinling.srv.entity.AdminUserEntity;

import java.util.List;

public interface AdminUserMapper {
    int Insert(AdminUserEntity adminUserEntity);
    List<AdminUserEntity> SelectAll();
}
