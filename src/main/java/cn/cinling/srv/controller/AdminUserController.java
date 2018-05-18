package cn.cinling.srv.controller;

import cn.cinling.srv.entity.AdminUserEntity;
import cn.cinling.srv.service.admin_user.AdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

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
