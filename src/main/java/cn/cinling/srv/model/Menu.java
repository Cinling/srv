package cn.cinling.srv.model;

import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;

/**
 * 菜单模块
 */
public class Menu {
    private static Menu shareInstance = null;
    private Menu() {
        this.InitMenu();
    }
    public static Menu GetInstance() {
        if (Menu.shareInstance == null) {
            Menu.shareInstance = new Menu();
        }
        return Menu.shareInstance;
    }


    /**
     * 菜单对象
     */
    private JSONObject menu;

    /**
     * 初始化菜单
     */
    private void InitMenu() {
        this.menu = new JSONObject();
        JSONArray menuChild = new JSONArray();
        this.menu.put("child", menuChild);

        // 系统
        JSONObject system = new JSONObject();
        JSONArray systemChild = new JSONArray();
        system.put("child", systemChild);

        menuChild.appendElement(system);
        system.put("name", "系统");

        // 系统-服务器状态
        JSONObject systemMonitor = new JSONObject();
        systemMonitor.put("name", "服务器状态");
        systemMonitor.put("url", "/system-monitor/");
        systemChild.appendElement(systemMonitor);
    }

    /**
     * @return 菜单 JSONObject 对象
     */
    public JSONObject GetMenuJSONObject() {
        return this.menu;
    }
}
