package com.sihun.jpastudy.controller;

import com.sihun.jpastudy.dto.BoardDto;
import com.sihun.jpastudy.entity.BoardEntity;
import com.sihun.jpastudy.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/")
public class ApiController {

    private final BoardService boardService;


    @GetMapping("board/list")
    public List<BoardEntity> findAll() throws Exception {
        return boardService.findAll();
    }

    @PostMapping("board/write")
    public void write(@RequestBody BoardDto boardDto) throws Exception{
        boardService.addBoard(boardDto);
    }
}
