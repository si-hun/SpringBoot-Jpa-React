package com.sihun.jpastudy.service;

import com.sihun.jpastudy.dto.BoardDto;
import com.sihun.jpastudy.entity.BoardEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface BoardService {

    void addBoard(BoardDto boardDto) throws Exception;

    Page<BoardEntity> boardList(Pageable pageable) throws Exception;

    List<BoardEntity> findAll() throws Exception;

    List<BoardDto> testBoardList() throws Exception;

    Optional<BoardEntity> boardView(Long id) throws Exception;

}
