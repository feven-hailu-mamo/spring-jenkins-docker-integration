package com.spring.jenkins.docker.springjenkinsdockerintegration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringJenkinsDockerIntegrationApplication {

    public static Logger logger = LoggerFactory.getLogger(SpringJenkinsDockerIntegrationApplication.class);

    @GetMapping("/home")
    public String home(){
        return "The code is working...great";
    }
    public static void main(String[] args) {
        logger.info("Application executed...");
        SpringApplication.run(SpringJenkinsDockerIntegrationApplication.class, args);
    }

}
