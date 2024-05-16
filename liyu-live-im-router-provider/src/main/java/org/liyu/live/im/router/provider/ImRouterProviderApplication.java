package org.liyu.live.im.router.provider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

/**
 * @Author 傅泽杭
 * @Data 2024-03-31 16:35
 * @Description
 */
@SpringBootApplication
@EnableDubbo
public class ImRouterProviderApplication{


    public static void main(String[] args) {
        try {
            try {
                SpringApplication springApplication = new SpringApplication(ImRouterProviderApplication.class);
                springApplication.setWebApplicationType(WebApplicationType.NONE);
                springApplication.run(args);
                System.in.read();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}
