package com.huibudc.thymeLeafDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

@Controller
public class IndexController {
    @RequestMapping("vue-thymeleaf")
    public String vueTyhmeleaf(Model model){
        model.addAttribute("items", Arrays.asList("aa", "bb", "cc"));
        return "vue-thymeleaf";
    }
}
