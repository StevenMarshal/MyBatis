# 9 sql标签和include标签

sql标签可以存放多条sql语句中相同的部分，在局部配置文件中增加如下部分sql标签代码：  

	<!-- sql标签可以存放多条sql语句中相同的部分 -->
	<sql id="common">
		username,PASSWORD
	</sql>

在其他sql语句中通过include标签将sql标签进行引入，示例代码如下：

    <select id="getUserByCondition" resultType="Map" parameterType="Map">
		SELECT <include refid="common"/>   FROM users WHERE username=#{username} AND PASSWORD=#{password}
	</select>
	
	<select id="getUserByCondition2" resultType="Map" parameterType="Map">
		SELECT <include refid="common"/>   FROM users
	</select>

从以上可以看出：  
1：sql标签和include标签是一对组合标签，相互配合进行使用。  
2：sql标签的id属性值和include标签的refid属性值是相同的。  
3：include标签是存在select标签之下的，其他标签下没有include标签。
