package com.galaxy.framework.gemini;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@MapperScan("com.galaxy.framework.gemini.mapper")
public class GeminiApplication {

    public static void main(String[] args) {
        SpringApplication.run(GeminiApplication.class, args);
    }
}
