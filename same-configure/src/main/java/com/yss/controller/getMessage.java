package com.yss.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yss
 */
@RestController
@RequestMapping
public class getMessage {

    @NacosValue(value = "${message}",autoRefreshed = true)
    private String message;

    @GetMapping("getMessage")
    public String getMessage(){
        return message;
    }
}
