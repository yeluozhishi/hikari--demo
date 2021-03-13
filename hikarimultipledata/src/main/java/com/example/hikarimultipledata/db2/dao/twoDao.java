package com.example.hikarimultipledata.db2.dao;

import com.example.hikarimultipledata.bean.sysTwo;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier("db2SqlSessionTemplate")
public interface twoDao {
    @Select("SELECT * FROM sys_two WHERE two_id = #{id)}")
    sysTwo findUserByName(Integer id);
}
