package com.netcracker.Task1;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ServletComponentScan
@ImportResource("classpath:app-config.xml")
public class SpringBootStarter{
    public static void main(String[] args){
        SpringApplication.run(SpringBootStarter.class, args);

    }
}
