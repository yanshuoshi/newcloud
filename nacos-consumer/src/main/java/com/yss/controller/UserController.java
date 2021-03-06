package com.yss.controller;

import com.yss.openfegin.ProductClient;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author yanshuoshi
 */
@RestController
@Slf4j
@RequestMapping
public class UserController {


    @Autowired
    private ProductClient productClient;

    @GetMapping("/getProductInfo")
    @GlobalTransactional(name ="cloud-seata-info",timeoutMills = 60000)
    public Map<String, Object> getProductInfo() {
        Map<String, Object> map = productClient.find();
        log.info("返回的信息:[{}]" + map);
        return map;
    }
}