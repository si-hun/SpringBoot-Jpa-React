package com.sihun.jpastudy.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/v1")
public class MemberController {


    @PostMapping("/member")
    public void memberPost() {
    }

    @GetMapping("/member")
    public String memberGet() {
        return "";
    }

    @DeleteMapping
    public void delete() {

    }

    @PutMapping
    public void update() {

    }

    @GetMapping("/test")
    public ModelAndView test(ModelAndView mav){


        mav.addObject("test", "zzxczxc");
        mav.setViewName("hello.html");
        return mav;

    }

}