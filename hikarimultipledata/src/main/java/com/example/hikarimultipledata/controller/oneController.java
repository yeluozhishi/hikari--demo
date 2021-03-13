package com.example.hikarimultipledata.controller;

import com.example.hikarimultipledata.bean.userOne;
import com.example.hikarimultipledata.db1.service.UserOneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/one")
public class oneController {
    @Autowired
    UserOneService userOneService;

    @RequestMapping("/query")
    public userOne testQuery() {
        return userOneService.selectUserByName(2);
    }
    
}
