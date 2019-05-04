package com.noyer.start;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import com.noyer.controller.IndexController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

@SpringBootApplication(scanBasePackages = "com.noyer")
public class SpringBootStart extends WebMvcConfigurerAdapter {

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        FastJsonHttpMessageConverter converter=new FastJsonHttpMessageConverter();
        FastJsonConfig config=new FastJsonConfig();
        config.setSerializerFeatures(SerializerFeature.PrettyFormat);
        converter.setFastJsonConfig(config);
        converters.add(converter);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootStart.class,args);

    }
}
