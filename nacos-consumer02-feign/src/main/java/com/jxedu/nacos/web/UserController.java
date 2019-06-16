package com.jxedu.nacos.web;

import com.jxedu.nacos.feign.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {

      @Resource
      private UserService userService;

     @GetMapping("/user/info")
     public ResponseEntity<String> userInfo(){
          return userService.userInfo();
     }
}
