package com.sihun.jpastudy.service.impl;

import com.sihun.jpastudy.dto.BoardDto;
import com.sihun.jpastudy.entity.BoardEntity;
import com.sihun.jpastudy.mapper.BoardMapper;
import com.sihun.jpastudy.repository.BoardRepository;
import com.sihun.jpastudy.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class BoardServiceImpl implements BoardService {

    private final BoardMapper boardMapper;

    private final BoardRepository boardRepository;

    @Override
    public void addBoard(BoardDto boardDto) throws Exception {
        boardRepository.save(boardDto.toEntity());
    }

    @Override
    public List<BoardEntity> boardList() throws Exception {
        return boardRepository.findAll();
    }

    @Override
    public List<BoardDto> testBoardList() throws Exception {
        return boardMapper.selectBoardList();
    }
}
