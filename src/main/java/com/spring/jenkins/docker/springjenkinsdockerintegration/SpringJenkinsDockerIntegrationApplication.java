package com.spring.jenkins.docker.springjenkinsdockerintegration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringJenkinsDockerIntegrationApplication {

    @GetMapping("/home")
    public String home(){
        return "The code is working...great";
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringJenkinsDockerIntegrationApplication.class, args);
    }

}
