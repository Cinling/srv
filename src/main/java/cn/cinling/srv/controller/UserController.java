package cn.cinling.srv.controller;

import cn.cinling.srv.model.UserDomain;
import cn.cinling.srv.service.user.UserService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/add")
    public String addUser(){
        UserDomain user = new UserDomain();
        user.setUserName("aa");
        user.setPassword("bb");
        user.setPhone("cc");
        userService.addUser(user);

        return "add success";
    }

    @ResponseBody
    @GetMapping("/all")
    public Object findAllUser(
            @RequestParam(name = "pageNum", required = false, defaultValue = "1")
                    int pageNum,
            @RequestParam(name = "pageSize", required = false, defaultValue = "10")
                    int pageSize){
        //开始分页
        PageHelper.startPage(pageNum,pageSize);
        return userService.findAllUser(pageNum,pageSize);
    }
}
