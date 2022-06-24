package com.sihun.jpastudy.controller;

import com.sihun.jpastudy.dto.MemberDto;
import com.sihun.jpastudy.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;


@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("member")
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/add")
    public Map<String, Object> memberPost(@RequestParam Map<String, Object> input) {
        Map<String, Object> returnMap = new HashMap<>();
        MemberDto memberDto = new MemberDto();

        memberDto.setUserName("길");
        /*memberDto.setRegDate(LocalDateTime.now());*/

        memberService.addMember(memberDto);

        returnMap.put("key","name");
        return returnMap;
    }

    @GetMapping("/list")
    public String memberGet(Model model) {

        Optional<MemberDto> member = memberService.getMember("");
        model.addAttribute("member", member);

        return "";
    }

    @DeleteMapping
    public void delete() {
    }

    @PutMapping
    public void update() {
    }

    @GetMapping("/test")
    public ModelAndView test(ModelAndView mav) {
        mav.addObject("test", "zzxczxc");
        mav.setViewName("hello.html");
        return mav;
    }

}