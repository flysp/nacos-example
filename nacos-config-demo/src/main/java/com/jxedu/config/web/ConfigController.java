package com.jxedu.config.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@RequestMapping("/config")
public class ConfigController {

      @Value("${xw.name:默认}")
      private String name;

      @Value("${xw.age:23}")
      private Integer age;

      @GetMapping
     public ResponseEntity<Object> changeConfig(){

          return ResponseEntity.ok(String.format("%s:%s-%s:%s","姓名",name,"年龄",age));
      }
}
