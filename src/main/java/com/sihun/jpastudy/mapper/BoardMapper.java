package com.sihun.jpastudy.mapper;


import com.sihun.jpastudy.dto.BoardDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {

    public List<BoardDto> selectBoardList() throws Exception;

}
