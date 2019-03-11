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


## 错误情况

出现下面输出，大概率是文件找不到

```
java.io.IOException: Server returned HTTP response code: 500 for URL: http://t420.doublechaintech.cn:2080/sky/locale/dictionary.jsp?name=his4&english=false
	at sun.net.www.protocol.http.HttpURLConnection.getInputStream0(HttpURLConnection.java:1876)
	at sun.net.www.protocol.http.HttpURLConnection.getInputStream(HttpURLConnection.java:1474)
	at skynet.CodeSplitter.splitIntoFiles(CodeSplitter.java:25)
	at skynet.CodeGenTask.doSingleTask(CodeGenTask.java:51)
	at skynet.FullTask.doTask(FullTask.java:6)
	at skynetsplitter.PowerSplitter.run(PowerSplitter.java:206)
	at skynetsplitter.PowerSplitter.lambda$0(PowerSplitter.java:62)
	at java.util.Spliterators$ArraySpliterator.forEachRemaining(Spliterators.java:948)
	at java.util.stream.ReferencePipeline$Head.forEach(ReferencePipeline.java:580)
	at skynetsplitter.PowerSplitter.main(PowerSplitter.java:60)
+       318 ReactTask                      start task with model: his4


```




