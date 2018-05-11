package cn.cinling.srv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 系统监控的控制器
 */
@RequestMapping("/system-monitor")
@Controller
public class SystemMonitorController extends BaseController {
    @RequestMapping("/")
    public String Home() {
        return "system-monitor/home";
    }

    @RequestMapping("/home")
    public String Home2() {
        return this.Home();
    }
}
