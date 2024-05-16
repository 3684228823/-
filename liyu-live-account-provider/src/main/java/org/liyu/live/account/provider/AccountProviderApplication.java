package org.liyu.live.account.provider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.io.IOException;

/**
 * @Author 傅泽杭
 * @Date: Created in 10:13 2023/6/20
 * @Description
 */
@SpringBootApplication
@EnableDubbo
@EnableDiscoveryClient
public class AccountProviderApplication{

    public static void main(String[] args) {

        try {
            try {
                SpringApplication springApplication = new SpringApplication(AccountProviderApplication.class);
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
