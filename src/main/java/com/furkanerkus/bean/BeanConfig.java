package com.furkanerkus.bean;

import com.furkanerkus.dto.BeanDto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfig {

    @Bean(initMethod = "initialBeanMethod", destroyMethod = "destroyBeanMethod")
    @Scope("singleton") // Proje ile baslar proje ile biter.
    // @Scope("request") // Istek boyunca calisir.
    // @Scope("session") // Oturum boyunca calisir.
    public BeanDto beanDto() {
        return BeanDto
                .builder()
                    .id(0L).beanName("Bean Name").beanData("Bean Data")
                .build();
    }
}
