#注意
### 该项目已经停止开发，已经整合到新的项目里，开发成一个更大的项目
https://github.com/Cinling/multiple-webside


# 项目简介
### 项目所需的软件版本
    jdk 1.8.x 或以上版本
    Apache Maven 3.5.3 或以上版本
### 运行环境
    redis 3.0 或以上版本
    mysql 5.6 或以上版本

------------

------------

## 初始化说明

#### 1.创建环境配置文件
##### 可以使用脚本创建配置文件。执行脚本后，会创建一个配置文件的模板，把相关的值改为环境的值即可
> **注意：**如果已经修改过该脚本生成的文件，请勿再次执行，否则源文件将会被覆盖

##### 脚本
    srv/script/create_config_file.sh

##### 配置文件模板(路径：srv/srv.config) 如下：
    # 数据库端口
    DB_PORT=3306
    # 数据库名
    DB_NAME=srv
    # 登陆账号
    DB_USERNAME=root
    # 登陆密码
    DB_PASSWORD=123456
    # HTTP端口
    HTTP_PORT=8080

------------
#### 2.执行更新项目的脚本
##### 脚本执行步骤说明：
    从远端更新，并把项目重置到 origin/master 的最新版本
    读取 srv/srv.config ，生成环境所需的配置
    使用 mvn 命令生成最终的 jar 文件

##### 脚本
    srv/script/update_project.sh

