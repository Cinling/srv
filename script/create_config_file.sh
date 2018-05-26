#!/bin/bash

#创建基本的配置文件
ROOT_DIR=$(cd `dirname $0`/..; pwd)
FILE_NAME=${ROOT_DIR}/srv.config

echo -e "DB_PORT=3306" > $FILE_NAME
echo -e "DB_NAME=srv" >> $FILE_NAME
echo -e "DB_USERNAME=root" >> $FILE_NAME
echo -e "DB_PASSWORD=123456" >> $FILE_NAME
echo -e "# HTTP端口" >> $FILE_NAME
echo -e "HTTP_PORT=8080" >> $FILE_NAME
