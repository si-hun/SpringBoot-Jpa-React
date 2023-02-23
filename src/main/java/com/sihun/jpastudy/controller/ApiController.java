package com.sihun.jpastudy.controller;

import com.sihun.jpastudy.entity.BoardEntity;
import com.sihun.jpastudy.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequiredArgsConstructor
public class ApiController {

    private final BoardService boardService;


    @GetMapping("/api/board/list")
    public List<BoardEntity> findAll() throws Exception {
        return boardService.findAll();

    }
}
