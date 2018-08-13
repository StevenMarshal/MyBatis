# 18 p6spy工具的使用

## 18.1 导入p6spy的jar包

将jar文件p6spy-2.1.4.jar加入到项目中去。

![](images/jiarup6spyjarbao.png) 

## 18.2 导入p6spy的配置文件

将p6spy的配置文件spy.properties导入到项目中的resource文件夹中。

## 18.3 改写mybatis.xml

在mybatis.xml的配置文件中，envirements标记中增加关于p6spy的envirment配置：

	<?xml version="1.0" encoding="UTF-8"?>
	<!DOCTYPE configuration
	PUBLIC "-//mybatis.org//DTD Config 3.0//EN"
	"http://mybatis.org/dtd/mybatis-3-config.dtd">
	<configuration>
	
	    <!-- 配置数据库连接环境：driver、url、username、password -->
	    <environments default="p6spy">
	    
	        <!-- 开始配置mysql -->
	        <environment id="mysql">
	            <!-- 配置事务 -->
	            <transactionManager type="JDBC"></transactionManager>
	            <dataSource type="POOLED">
	                <property name="driver" value="com.mysql.jdbc.Driver"/>
	                <property name="url" value="jdbc:mysql:///mybatis"/>
	                <property name="username" value="root"/>
	                <property name="password" value="root"/>
	            </dataSource>
	        </environment>
	        
	        <environment id="p6spy">
	            <!-- 配置事务 -->
	            <transactionManager type="JDBC"></transactionManager>
	            <dataSource type="POOLED">
	                <property name="driver" value="com.p6spy.engine.spy.P6SpyDriver"/>
	                <property name="url" value="jdbc:p6spy:mysql://localhost:3306/mybatisg"/>
	                <property name="username" value="root"/>
	                <property name="password" value="root"/>
	            </dataSource>
	        </environment>
	    </environments>
	    
	    <!-- 关联局部配置文件 -->
	    <mappers>
	    	<!-- <mapper resource="com/marshal/dao/impl/UserDaoImpl.xml"/>
	    	<mapper resource="com/marshal/dao/impl/One2OneDaoImpl.xml"/>  -->
	    	<mapper resource="com/marshal/dao/impl/One2ManyDaoImpl.xml"/>
	    </mappers> 
	    
	</configuration>

其中，<environments default="p6spy">中的defaul属性被修改为p6spy。

