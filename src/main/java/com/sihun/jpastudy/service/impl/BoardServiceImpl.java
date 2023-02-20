package com.sihun.jpastudy.service.impl;

import com.sihun.jpastudy.dto.BoardDto;
import com.sihun.jpastudy.entity.BoardEntity;
import com.sihun.jpastudy.mapper.BoardMapper;
import com.sihun.jpastudy.repository.BoardRepository;
import com.sihun.jpastudy.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

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
    public Page<BoardEntity> boardList(Pageable pageable) throws Exception {
        return boardRepository.findAll(pageable);
    }

    @Override
    public Optional<BoardEntity> boardView(Long id) throws Exception {
        return boardRepository.findById(id);
    }

    @Override
    public List<BoardDto> testBoardList() throws Exception {
        return boardMapper.selectBoardList();
    }


}
