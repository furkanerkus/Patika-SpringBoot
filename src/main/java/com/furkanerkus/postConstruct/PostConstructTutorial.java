package com.furkanerkus.postConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import java.util.logging.Logger;


@Controller
public class PostConstructTutorial {

//    @Autowired
//    Logger LOG;

    // parametresiz constructor
    // " because 'this.LOG' is null " hatası alırsak @PostConstruct anotasyonu kullanılır.
    /*public PostConstructTutorial() {
        LOG.info("Log dosyasi cagrildi.");
    }*/

    // bean henuz baslamadigindan null aliyoruz ve burada bagimliligi inject edemiyoruz. (Inject yerime autowired kullaniliyor.)
    // Gorevi : Bir bean nesnesi olusturuldugunda hemen olusur.
//    @PostConstruct
//    public void init() {
//        LOG.info("Log dosyasi cagrildi.");
//    }

//    public static void main(String[] args) {
//        PostConstructTutorial postConstructTutorial = new PostConstructTutorial();
//        System.out.println(postConstructTutorial);
//    }



}
