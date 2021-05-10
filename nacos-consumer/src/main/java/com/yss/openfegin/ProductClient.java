package com.yss.openfegin;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

/**
 * @author yuzhian
 */
@FeignClient("product")
@Component
public interface ProductClient {

    @GetMapping("/product/find")
    public Map<String, Object> find();
}
