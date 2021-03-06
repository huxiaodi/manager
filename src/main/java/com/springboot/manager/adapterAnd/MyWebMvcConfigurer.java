package com.springboot.manager.adapterAnd;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @Description：
 * @Author:hudi
 * @Date: Created in 13:16 2018/2/28
 */
@Configuration
public class MyWebMvcConfigurer extends WebMvcConfigurerAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new AuthInterceptor())
                // 排除配置
                .excludePathPatterns("/login/**")
                // 拦截配置
                .addPathPatterns("/**");
    }
}
