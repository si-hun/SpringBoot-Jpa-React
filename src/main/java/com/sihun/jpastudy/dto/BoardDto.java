package com.sihun.jpastudy.dto;

import com.sihun.jpastudy.entity.BoardEntity;
import com.sihun.jpastudy.entity.MemberEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BoardDto {

    private Long id;
    private String title;
    private String contents;
    private String writer;
    private LocalDateTime regDate;


    public BoardEntity toEntity() {
        return BoardEntity.builder().title(title).contents(contents).writer(writer).build();
    }


}
