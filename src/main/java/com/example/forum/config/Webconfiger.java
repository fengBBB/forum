package com.example.forum.config;

import com.example.forum.Interceptor.LoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@Component
public class Webconfiger implements WebMvcConfigurer {

   @Bean
   public LoginInterceptor loginInterceptor(){
       return new LoginInterceptor();
   }
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(loginInterceptor())
                .addPathPatterns("/**").excludePathPatterns("/one","/login","/index");

    }
}
