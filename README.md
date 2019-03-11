# 代码生成客户端

## 工具

### Java 8 
本软件已经更新到Java8，工作在Java8以上环境中，JDK7不再支持

### putty 工具集（Windows）或者FileZilla

下载链接
```
https://www.chiark.greenend.org.uk/~sgtatham/putty/latest.html
```


FileZilla 下载地址

```
https://filezilla-project.org/
```


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
这个会生成到$HOME/githome/his-biz-suite/下面

大多数情况下，需要指定输出目录
```
java -Dskynet.output.basefolder=/Users/Philip/gittemp/  -jar splitter.jar  his
```


his 对应上传目录里面 his.xml

## 检查生成的代码





