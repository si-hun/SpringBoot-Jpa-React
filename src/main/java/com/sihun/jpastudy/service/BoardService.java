package com.sihun.jpastudy.service;

import com.sihun.jpastudy.dto.BoardDto;
import com.sihun.jpastudy.entity.BoardEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BoardService {

    void addBoard(BoardDto boardDto) throws Exception;

    List<BoardEntity> boardList() throws Exception;

}
