package com.sihun.jpastudy.dto;

import com.sihun.jpastudy.entity.MemberEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberDto {

    private String id;
    @NotBlank(message = "userName을 입력해주세요")
    private String userName;
    private LocalDateTime regDate;


    public MemberEntity toEntity() {
        return MemberEntity.builder().userName(userName).build();
    }

}
