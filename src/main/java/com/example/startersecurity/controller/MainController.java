package com.example.startersecurity.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody // 특정한 문자열 데이터를
public class MainController {

    @GetMapping("/")
    public String mainP() {
        return "Main Controller";
    }
}
