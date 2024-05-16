package org.liyu.live.web.starter.config;

import org.liyu.live.web.starter.context.LiyuUserInfoInterceptor;
import org.liyu.live.web.starter.context.RequestLimitInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author 傅泽杭
 * @Data 2024-03-24 13:54
 * @Description
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Bean
    public LiyuUserInfoInterceptor LiyuUserInfoInterceptor() {
        return new LiyuUserInfoInterceptor();
    }

    @Bean
    public RequestLimitInterceptor requestLimitInterceptor(){
        return new RequestLimitInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(LiyuUserInfoInterceptor()).addPathPatterns("/**").excludePathPatterns("/error");
        registry.addInterceptor(requestLimitInterceptor()).addPathPatterns("/**").excludePathPatterns("/error");
    }

}
