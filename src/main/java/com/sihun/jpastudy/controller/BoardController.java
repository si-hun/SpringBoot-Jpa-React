package com.sihun.jpastudy.controller;


import com.sihun.jpastudy.dto.BoardDto;
import com.sihun.jpastudy.entity.BoardEntity;
import com.sihun.jpastudy.service.BoardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

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
    public ModelAndView list(ModelAndView mav, Pageable pageable) throws Exception {

        Page<BoardEntity> list = boardService.boardList(pageable);

        int nowPage = list.getPageable().getPageNumber();
        int startPage = Math.max(nowPage - 4, 1);
        int endPage = Math.min(nowPage + 5, list.getTotalPages());

        mav.addObject("boardList", boardService.boardList(pageable));

        mav.addObject("nowPage", nowPage);
        mav.addObject("startPage", startPage);
        mav.addObject("endPage", endPage);

        mav.setViewName("board/list");
        return mav;
    }


    @GetMapping("/view/{id}")
    public ModelAndView boardView(ModelAndView mav, BoardDto boardDto) throws Exception {
        
        mav.addObject("board", boardService.boardView(boardDto.getId()));
        
        mav.setViewName("board/view");
        
        
        return mav;
    }


}
