#!/bin/bash

####################################
## 关闭服务
####################################
####################################
####################################
####################################
####################################
####################################


####################################
## 重置版本为远端的版本
####################################
git reset --hard HEAD
git fetch
git checkout origin/master


####################################
## 根据环境创建配置文件 application.yml
####################################
# 项目根路径
ROOT_DIR=$(cd `dirname $0`/..; pwd)
# 环境配置文件
CONFIG_FILE=${ROOT_DIR}/srv.config
# 配置模板文件
TEMPLATE_FILE=${ROOT_DIR}/src/main/resources/application.yml.template
# application.yml 文件
APPLICATION_CONFIG_FILE=${ROOT_DIR}/src/main/resources/application.yml

# 检查配置文件是否存在
if [ ! -f $CONFIG_FILE ];then
echo -e "\033[31mERROR:File not exists!\033[0m"
echo -e "\tconfig file:${CONFIG_FILE}"
echo -e "\t-- please run script to create config file:[${ROOT_DIR}/script/create_config_file.sh] "
exit 1
fi

# 检查配置文件的模板是否存在
if  [ ! -f $TEMPLATE_FILE ];then
echo -e "\033[31mERROR:File not exists!\033[0m"
echo -e "\tconfig template file:${CONFIG_FILE}"
echo -e "\t-- please check your Git Repository  "
exit 1
fi

# 复制并覆盖原来的 application.yml
cp -rf $TEMPLATE_FILE $APPLICATION_CONFIG_FILE

# 把环境配置数据存入字典
declare -A CONFIG_DICT
while read LINE
do
    CONFIG=$(echo "${LINE}" | grep -E '(^[^#]{1})\w+={1}\w')

    if [ "$CONFIG" != "" ];then
        KEY=${CONFIG%=*}
        VALUE=${CONFIG#*=}
        CONFIG_DICT+=([${KEY}]="${VALUE}")
    fi
done < $CONFIG_FILE

# 替换 application.yml 中的内容
for KEY in $(echo ${!CONFIG_DICT[*]})
do
    VALUE=${CONFIG_DICT[$KEY]}
    sed -i "s/${KEY}/${VALUE}/g" $APPLICATION_CONFIG_FILE
done


####################################
## 使用 maven 编译生成可执行的 jar 文件
####################################
mvn install

####################################
## 启动服务
####################################
####################################
####################################
####################################
####################################
####################################
