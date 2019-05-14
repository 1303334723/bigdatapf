package com.behavioranalysis.config;

import com.behavioranalysis.config.intercepors.LoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Arrays;

@Configuration
public class WebConfigurer implements WebMvcConfigurer {

    // 将LoginInterceptor注入到WebCongfigurer中
    @Autowired
    private LoginInterceptor loginInterceptor;

    /**
     * 此方法用来配置静态资源，比如html，js，css 等等
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
    }

    /**
     * 此方法用来注册拦截器，我们自己写好的拦截器需要通过这里添加注册才能生效
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // addPathPatterns("/**") 表示拦截所有的请求
        // excludePathPatterns("/login", "/register") 表示除了登录和注册之外
        //registry.addInterceptor(loginInterceptor).addPathPatterns("/**").excludePathPatterns(Arrays.asList("/user/login", "/css/login/**"));
    }
}
