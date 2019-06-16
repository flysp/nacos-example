package com.jxedu.nacos.service.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

     @GetMapping("/info")
    public ResponseEntity<String> userInfo(){
         return  ResponseEntity.ok("fly少年");
     }
}
