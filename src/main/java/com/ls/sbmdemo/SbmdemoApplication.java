package com.ls.sbmdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ls.sbmdemo.dao")
public class SbmdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbmdemoApplication.class, args);
    }
}
