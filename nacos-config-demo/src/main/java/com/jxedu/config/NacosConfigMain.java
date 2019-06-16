package com.jxedu.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author libin
 * @version 1.0
 */
@SpringBootApplication
@RestController
@Slf4j
@RefreshScope
public class NacosConfigMain implements ApplicationRunner {

    @Value("${fly.name}")
    private String name;

    @Value("${fly.age}")
    private Integer age;

    public static void main(String[] args) {
        SpringApplication.run(NacosConfigMain.class,args);
    }

    @GetMapping("/user/info")
    public ResponseEntity getUserInfo(){
        return ResponseEntity.ok(String.format("%s:%s-%s:%d","姓名",name,"年龄",age));
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.debug("NacosConfigMain.....启动");
    }
}
