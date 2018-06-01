package com.woniu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class ServiceApplication
{
    @GetMapping("/hello")
    public String service(){
        return "world";
    }
    public static void main( String[] args )
    {
        SpringApplication.run(ServiceApplication.class, args);
    }
}
