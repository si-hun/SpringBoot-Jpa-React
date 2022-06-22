package com.sihun.jpastudy;

import com.sihun.jpastudy.entity.Member;
import com.sihun.jpastudy.repository.MemberRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
class MemberRepositoryTest {

    @Autowired
    private MemberRepository memberRepository;


    @Test
    @Transactional
    public void testMember() throws Exception {

        Member member = Member.builder()
                .username("zz")
                .build();

        Member newMember = memberRepository.save(member);


    }



}