package com.jpa.demo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model){ //클래스 명은 뷰 네임 templates/hello 랑 매칭


        model.addAttribute("data" , "hello");

        return "hello"; //html이 자동으로 붙는다.

    }
}
