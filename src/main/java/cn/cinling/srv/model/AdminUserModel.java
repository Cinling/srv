package cn.cinling.srv.model;

import cn.cinling.srv.config.define.SES;
import cn.cinling.srv.database.service.admin_user.AdminUserService;
import cn.cinling.srv.database.service.admin_user.impl.AdminUserServiceImpl;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpSession;

/**
 * 用于处理管理员账号的模块
 */
@Component
public class AdminUserModel {
    /**
     * 判断是否已经登陆
     * @return 是否登陆
     */
    public boolean IsLogin(HttpSession session) {
        Object objUserId = session.getAttribute(SES.USER_ID);
        return (objUserId != null);
    }

    /**
     * 判断是否已经初始化系统的管理员账号
     * @return 是否已经初始化系统的管理员账号
     */
    public boolean IsInitAdminUserAccount() {

        AdminUserService adminUserService = SpringUtil.getBean(AdminUserServiceImpl.class);

        if (adminUserService.GetCount() == 0) {
            return false;
        }

        return true;
    }

}
