package com.example.hikarimultipledata.db1.service;

import com.example.hikarimultipledata.bean.userOne;
import com.example.hikarimultipledata.db1.dao.userOneDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserOneService {
    @Resource
    private userOneDao userOneDao;

    /**
     * 根据名字查找用户
     */
    public userOne selectUserByName(Integer name) {
        return userOneDao.findMoneyById(name);
    }
}
