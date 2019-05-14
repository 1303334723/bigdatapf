package com.behavioranalysis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.behavioranalysis.mapper")
public class BigdatapfApplication {

    public static void main(String[] args) {
        SpringApplication.run(BigdatapfApplication.class, args);
    }

}
