package cn.cinling.srv.database.service.admin_user.impl;

import cn.cinling.srv.database.entity.AdminUserEntity;
import cn.cinling.srv.database.mapper.AdminUserMapper;
import cn.cinling.srv.database.service.admin_user.AdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "adminUserService")
public class AdminUserServiceImpl implements AdminUserService {
    @Autowired
    private AdminUserMapper adminUserMapper;

    @Override
    public int AddAdminUser(AdminUserEntity adminUserEntity) {
        return this.adminUserMapper.Insert(adminUserEntity);
    }

    @Override
    public List<AdminUserEntity> GetAll() {
        return this.adminUserMapper.SelectAll();
    }
}
