/**
 * HTML控件帮助对象
 * @var {object} htmlComponent
 */

let HTMLComponent = {
    /**
     * 时间选项空间
     * @param {string} id
     * @return {string}
     */
    Time(id) {
        return "123" + id;
    },
    /**
     * 打印菜单
     * @return {string}
     */
    GetMenuHtml() {
        <!--导航栏-->
        let menuHtml = "";
        $.ajax({
            url: "/get-menu",
            method: "get",
            async: false,
            dataType: "text",
            success: function(text) {
                menuHtml = text;
            },
            error: function(error) {
                console.error(error);
            }
        });

        return menuHtml;
    }
};

