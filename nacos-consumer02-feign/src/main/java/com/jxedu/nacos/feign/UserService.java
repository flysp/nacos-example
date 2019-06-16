package com.jxedu.nacos.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "nacos-userprovider")
public interface UserService {

    @GetMapping("/user/info")
    public ResponseEntity<String> userInfo();
}
