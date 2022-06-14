package com.furkanerkus.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Log4j2
@Builder
public class BeanDto {

    private Long id;
    private String beanName;
    private String beanData;

    //baslangic
    public void initialBeanMethod() {
        log.info("Bean baslamadan once ben varim!");
        System.out.println("Bean baslamadan once calisacak metot");
    }

    //bitis
    public void destroyBeanMethod() {
        log.info("Bean bittikten sonra ben varim!");
        System.err.println("Bean bittikten sonra calisacak metot");
    }
}
