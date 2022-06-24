package com.sihun.jpastudy.dto;

import com.sihun.jpastudy.entity.Member;
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
    @NotBlank(message = "userName를 입력해주세요")
    private String userName;
    private LocalDateTime regDate;


    public Member toEntity() {
        return Member.builder().userName(userName).regDate(regDate).build();
    }

}
