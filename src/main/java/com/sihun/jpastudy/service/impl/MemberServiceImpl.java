package com.sihun.jpastudy.service.impl;

import com.sihun.jpastudy.dto.MemberDto;
import com.sihun.jpastudy.repository.MemberRepository;
import com.sihun.jpastudy.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

	private final MemberRepository memberRepository;

	@Transactional
	@Override
	public Optional<MemberDto> getMember(String userName) {
		return memberRepository.findMemberByUserName(userName);
	}

	@Override
	public void addMember(MemberDto memberDto) {
		memberRepository.save(memberDto.toEntity());
	}


}
