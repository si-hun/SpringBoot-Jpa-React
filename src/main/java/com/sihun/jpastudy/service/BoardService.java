package com.sihun.jpastudy.service;

import com.sihun.jpastudy.dto.BoardDto;
import org.springframework.stereotype.Service;

@Service
public interface BoardService {

    Long addBoard(BoardDto boardDto) throws Exception;


}
