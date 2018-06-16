package cn.cinling.srv.http.controller;

import cn.cinling.srv.database.service.admin_user.AdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "admin-user")
public class AdminUserController extends BaseController {

    @Autowired
    private AdminUserService adminUserService;

    /**
     * 管理员查看的页面
     * @return html页面
     */
    @GetMapping("home")
    public String AdminManagement() {
        return "admin-user/home";
    }
}
