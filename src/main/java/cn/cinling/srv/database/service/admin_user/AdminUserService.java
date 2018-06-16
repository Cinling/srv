package cn.cinling.srv.database.service.admin_user;

import cn.cinling.srv.database.entity.AdminUserEntity;

import java.util.List;

public interface AdminUserService {
    /**
     * 添加一个管理员数据
     * @param adminUserEntity 管理员对象
     * @return 成功处理的数据条数
     */
    int AddAdminUser(AdminUserEntity adminUserEntity);

    /**
     * 获取所有数据
     * @return 管理员数据列表
     */
    List<AdminUserEntity> GetAll();

    /**
     * 获取总数据条数
     * @return 数据条数
     */
    int GetCount();
}
