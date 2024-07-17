package com.sihun.jpastudy.dto;

import com.sihun.jpastudy.entity.MemberEntity;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberDto {

    private String id;
    
    @NotBlank(message = "이름을 입력해주세요")
    private String userName;
    
    private LocalDateTime regDate;


    public MemberEntity toEntity() {
        return MemberEntity.builder().userName(userName).build();
    }

}
