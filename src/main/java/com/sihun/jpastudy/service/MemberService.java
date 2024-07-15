package com.sihun.jpastudy.service;

import com.sihun.jpastudy.dto.MemberDto;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface MemberService {

    Optional<MemberDto> getMember(String userName);

    void addMember(MemberDto memberDto);

}
