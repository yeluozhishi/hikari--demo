package com.example.hikarimultipledata.db1.dao;

import com.example.hikarimultipledata.bean.userOne;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier("db1SqlSessionTemplate")
public interface userOneDao {
    /**
     * 通过id 查看工资详情
     */
    @Select("SELECT * FROM sys_user_one WHERE user_id = #{id}")
    userOne findMoneyById(@Param("id") int id);
}
