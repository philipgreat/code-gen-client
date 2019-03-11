# 代码生成客户端

## 工具

### Java 8 
本软件已经更新到Java8，工作在Java8以上环境中，JDK7不再支持

### putty 工具集（Windows）或者FileZilla

下载链接

https://www.chiark.greenend.org.uk/~sgtatham/putty/latest.html

我们使用pscp来上传文件

## 建立模型

编辑需要的的xml文件

## 上传到服务器（临时）



* username 需要替换成你的用户名
* YOURPASSWORD 需要替换成你的密码

```
pscp his.xml -P 4422  -pw YOURPASSWORD username@t420.doublechaintech.cn:/home/username/
```


## 更新客户端

```
wget -O splitter.jar https://github.com/philipgreat/code-gen-client/raw/master/dist/splitter.jar

```

## 运行客户端 

```
java -jar splitter.jar his
```

## 检查生成的代码





