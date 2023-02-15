package com.sihun.jpastudy.controller;


import com.sihun.jpastudy.dto.BoardDto;
import com.sihun.jpastudy.service.BoardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Slf4j
@RequiredArgsConstructor
@RequestMapping("board")
public class BoardController {

    private final BoardService boardService;

    @GetMapping("/write")
    public ModelAndView boardWriteForm(ModelAndView mav) {
        mav.setViewName("board/write");
        return mav;
    }

    @PostMapping("/write")
    public ModelAndView boardWriteFormPost(ModelAndView mav, BoardDto boardDto) throws Exception {

        boardService.addBoard(boardDto);

        mav.setViewName("board/write");
        return mav;
    }

    @GetMapping("/list")
    public ModelAndView list(ModelAndView mav) throws Exception {

        mav.addObject("boardList", boardService.boardList());
        mav.setViewName("board/list");
        return mav;
    }

    @GetMapping("/detail/{idx}")
    public ModelAndView detail(ModelAndView mav) {

        mav.addObject("");
        mav.setViewName("board/detail");
        return mav;
    }


}
