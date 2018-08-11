# 11 动态sql修改

在com.marshal.dao.impl.UserDaoImpl类中的如下方法：

    @Test
    public void dynamicUpdate() {
    
        Map<String, Object> paramMap = new HashMap<String, Object>();
        
        // paramMap.put("computerName", "外星人");
        // paramMap.put("brand", "联想");
        // paramMap.put("runMem", 8);
        // paramMap.put("price", 6500);
        
        paramMap.put("id", 1L);
        int flag = session.update("cn.java.dao.impl.UserDaoImpl.dynamicUpdate", paramMap);
        session.commit();
        System.out.println(flag);
        
    }

在com.marshal.dao.impl文件夹下的UserDaoImpl.xml文件中增加如下配置：

    <!-- 动态sql修改 -->
	<update id="dynamicUpdate" parameterType="Map">
		UPDATE computers
		<set>
			<if test="computerName!=null">
				computerName=#{computerName},
			</if>
			<if test="brand!=null">
				brand=#{brand},
			</if>
			<if test="runMem!=null">
				runMem=#{runMem},
			</if>
			<if test="price!=null">
				price = #{price},
			</if> 
			id=#{id}
		</set> 
		WHERE id=#{id}
	</update>

其中的set标签可以将最后一个查询条件末尾的“，”去掉。其中set标记中最末尾的id=#{id}是为了防止什么更新条件都不存在的情况。  
类似sql语句为：

    update computers set id = null where id = null