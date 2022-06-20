package com.furkanerkus.controller;

import com.furkanerkus.dto.TeacherDTO;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
@Log4j2
public class FormController {

    // FORM
    // @GetMapping
    // @PostMapping
    // @PutMapping
    // @DeleteMapping

    // http://localhost:8080/form
    @GetMapping("/form")
    public String getForm(Model model) {
        model.addAttribute("cv_teacher",new TeacherDTO());
        return "form_post/formvalidation";
    }

    // http://localhost:8080/form
    @PostMapping("/form")
    public String postForm(@Valid @ModelAttribute("cv_teacher") TeacherDTO teacherDTO, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            log.error("Hata var...");
            System.err.println("Hata var...");
            return "form_post/formvalidation";
        }
        log.info("Success !" + teacherDTO);
        // Database kaydetme alanı - Ödev
        // Dosyaya yazma - Ödev
        return "form_post/success";
    }
}
