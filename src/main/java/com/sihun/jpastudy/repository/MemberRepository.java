package com.sihun.jpastudy.repository;

import com.sihun.jpastudy.dto.MemberDto;
import com.sihun.jpastudy.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.expression.spel.support.ReflectivePropertyAccessor;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {

    Optional<MemberDto> findMemberByUserName(String userName);



}
