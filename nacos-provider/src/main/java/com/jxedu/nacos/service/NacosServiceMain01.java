package com.jxedu.nacos.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NacosServiceMain01 {
    public static void main(String[] args) {
        SpringApplication.run(NacosServiceMain01.class,args);
    }
}
