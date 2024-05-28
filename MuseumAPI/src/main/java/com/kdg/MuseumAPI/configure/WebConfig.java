package com.kdg.MuseumAPI.configure;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
@RequiredArgsConstructor
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry
                .addMapping("/**") // 모든 주소에 대해서
                .allowedHeaders("*") // 허용합니다. 모든 헤더를
                .allowedOrigins("*") // 허용합니다. 어디서 오든... 누구든..
                .allowedMethods("*"); // 허용합니다. http method --> post, get, put, delete
    }
}


