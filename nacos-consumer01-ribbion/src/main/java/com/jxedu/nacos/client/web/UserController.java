package com.jxedu.nacos.client.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {

     @Autowired
     private RestTemplate restTemplate;

     @GetMapping("/user/info")
     public ResponseEntity<String> userInfo(){
         String url = "http://nacos-userprovider/user/info";
          return  restTemplate.getForEntity(url,String.class);
     }
}
