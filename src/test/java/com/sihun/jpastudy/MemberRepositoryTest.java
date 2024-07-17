package com.sihun.jpastudy;

import com.sihun.jpastudy.dto.MemberDto;
import com.sihun.jpastudy.entity.MemberEntity;
import com.sihun.jpastudy.repository.MemberRepository;
import com.sihun.jpastudy.service.MemberService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class MemberRepositoryTest {

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private MemberService memberService;


    @Test
    @Transactional
    public void testMember() throws Exception {

        MemberDto memberDto = new MemberDto();

        memberDto.setUserName("z");
        memberService.addMember(memberDto);


    }

    @Test
    public void findAll(){
        long cnt = memberRepository.count();
        List<MemberEntity> members = memberRepository.findAll();
    }


}