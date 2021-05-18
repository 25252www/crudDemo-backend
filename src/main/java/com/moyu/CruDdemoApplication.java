package com.moyu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.moyu.mapper")
public class CruDdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CruDdemoApplication.class, args);
    }

}
