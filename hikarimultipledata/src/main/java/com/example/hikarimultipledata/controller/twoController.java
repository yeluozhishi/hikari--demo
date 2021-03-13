package com.example.hikarimultipledata.controller;

import com.example.hikarimultipledata.bean.sysTwo;
import com.example.hikarimultipledata.db2.service.sysTwoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/two")
public class twoController {
    @Autowired
    sysTwoService sysTwoService;

    @RequestMapping("/query")
    public sysTwo twoUser() {
        return sysTwoService.selectUserByName(1);
    }
}
