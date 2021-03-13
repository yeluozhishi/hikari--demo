package com.example.hikarimultipledata.db2.service;

import com.example.hikarimultipledata.bean.sysTwo;
import com.example.hikarimultipledata.db2.dao.twoDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class sysTwoService {
    @Resource
    private twoDao twoDao;

    /**
     * 根据名字查找用户
     */
    public sysTwo selectUserByName(Integer name) {
        return twoDao.findUserByName(name);
    }

}
