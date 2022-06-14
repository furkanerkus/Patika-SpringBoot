package com.furkanerkus.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ThymeleafController {

    // http://localhost:8080/thymeleaf1
    @GetMapping("/thymeleaf1") // EndPoint
    //@ResponseBody // Herhangi bir sayfaya yonlendirmeden direk gosteriyor.
    public String getThymeleaf1() {
        return "thymeleaf1"; // Html dosyasının adına referans ediyor.
    }

    // http://localhost:8080/thymeleaf2
    @GetMapping("/thymeleaf2") // EndPoint
    public String getThymeleaf2Model(Model model) {
        model.addAttribute("key_model1", "Ben modelden geldim.");
        model.addAttribute("key_model2", "Ben yeniden modelden geldim.");
        return "thymeleaf2";
    }

    // http://localhost:8080/thymeleaf3
    @GetMapping("/thymeleaf3") // EndPoint
    public String getThymeleaf3Model(Model model) {
        model.addAttribute("key_model1", "Ben thymeleaf3 modelinden geldim.");
        return "Thymeleaf_file/thymeleaf3";
    }

    // http://localhost:8080/thymeleaf4
    @GetMapping("/thymeleaf4") // EndPoint
    public String getThymeleaf4Model(Model model) {
        model.addAttribute("key_model1", "Ben thymeleaf4 modelinden geldim.");
        return "thymeleaf4";
    }

}
