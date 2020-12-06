package com.minipig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.minipig.mapper")
public class MinipigApplication {

    public static void main(String[] args) {
        SpringApplication.run(MinipigApplication.class, args);
    }

}
