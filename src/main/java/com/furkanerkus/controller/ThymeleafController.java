package com.furkanerkus.controller;


import com.furkanerkus.dto.ProductDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

@Controller
public class ThymeleafController {

    //opsiyonel: root {}
    // http://localhost:8080
    @GetMapping({"/", "index"})
    public String index() {
        return "index";
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////

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

    ///////////////////////////////////////////////////////////////////////////////////////////////////////
    // Model object göndermek

    // http://localhost:8080/thymeleaf5
    @GetMapping("/thymeleaf5") // EndPoint
    public String getThymeleaf5ModelObject(Model model) {
        model.addAttribute("key_model1", "text");
        ProductDto productDto = ProductDto
                .builder()
                .productId(0L).productName("Product Name").productPrice(200)
                .build();
        model.addAttribute("key_model2", productDto);
        return "thymeleaf5";
    }

    // http://localhost:8080/thymeleaf6
    @GetMapping("/thymeleaf6") // EndPoint
    public String getThymeleaf6ModelList(Model model) {
        model.addAttribute("key_model1", "text");
        List<ProductDto> listem = new ArrayList<>();

        listem.add(ProductDto.builder()
                .productId(1L).productName("Product Name1").productPrice(100)
                .build());

        listem.add(ProductDto.builder()
                .productId(2L).productName("Product Name2").productPrice(200)
                .build());

        listem.add(ProductDto.builder()
                .productId(3L).productName("Product Name3").productPrice(300)
                .build());

        listem.add(ProductDto.builder()
                .productId(4L).productName("Product Name4").productPrice(400)
                .build());


        model.addAttribute("product_list", listem);
        return "thymeleaf6";
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////
    // http://localhost:8080/thymeleaf7
    @GetMapping({"/thymeleaf7/{id}", "/thymeleaf7"})
    public String getThymeleaf5ModelObject(Model model, @PathVariable(name = "id") Long id) {
        if(id != null) {
            model.addAttribute("key_model1", "id: " + id);
        }else {
            model.addAttribute("key_model1", "id bulunamadı");
        }
        return "thymeleaf7";
    }
}
