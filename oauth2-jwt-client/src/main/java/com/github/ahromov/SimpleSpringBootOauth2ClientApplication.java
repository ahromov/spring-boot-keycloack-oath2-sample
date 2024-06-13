package com.github.ahromov;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableFeignClients
public class SimpleSpringBootOauth2ClientApplication {

    private static Logger logger = LoggerFactory.getLogger(SimpleSpringBootOauth2ClientApplication.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SimpleSpringBootOauth2ClientApplication.class, args);
        TaskApiClient bean = run.getBean(TaskApiClient.class);
        String hello = bean.getHello();
        logger.info(hello);
    }

}
