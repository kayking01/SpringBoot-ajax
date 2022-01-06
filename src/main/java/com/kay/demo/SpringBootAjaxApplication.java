package com.kay.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.kay.demo.mapper")
public class SpringBootAjaxApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAjaxApplication.class, args);
    }

}
