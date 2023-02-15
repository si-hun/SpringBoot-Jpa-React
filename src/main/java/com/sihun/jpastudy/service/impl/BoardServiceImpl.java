package com.sihun.jpastudy.service.impl;

import com.sihun.jpastudy.dto.BoardDto;
import com.sihun.jpastudy.repository.BoardRepository;
import com.sihun.jpastudy.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
@Transactional
public class BoardServiceImpl implements BoardService {

    private final BoardRepository boardRepository;

    @Override
    public Long addBoard(BoardDto boardDto) throws Exception {
        return boardRepository.save(boardDto.toEntity()).getId();
    }
}
