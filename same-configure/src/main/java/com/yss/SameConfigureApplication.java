package com.yss;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@NacosPropertySource(dataId = "yss", autoRefreshed = true)
@EnableDiscoveryClient
public class SameConfigureApplication {

    public static void main(String[] args) {
        SpringApplication.run(SameConfigureApplication.class, args);
    }

}
