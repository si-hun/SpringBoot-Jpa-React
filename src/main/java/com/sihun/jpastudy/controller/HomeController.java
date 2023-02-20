package com.sihun.jpastudy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @GetMapping("/")
    public ModelAndView index(ModelAndView mav) {

        mav.addObject("test","안녕하세요!");
        mav.setViewName("hello");

        return mav;
    }
}
