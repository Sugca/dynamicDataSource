package com.mygod;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan(basePackages = {"com.mygod.*"})
@SpringBootApplication
public class MygodApplication {

    public static void main(String[] args) {
        SpringApplication.run(MygodApplication.class, args);
    }

}
