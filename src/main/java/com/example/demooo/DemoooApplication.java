package com.example.demooo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.example.demooo.dao")

public class DemoooApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoooApplication.class, args);
    }


}
