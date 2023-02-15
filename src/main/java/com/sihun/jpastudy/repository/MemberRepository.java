package com.sihun.jpastudy.repository;

import com.sihun.jpastudy.dto.MemberDto;
import com.sihun.jpastudy.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface MemberRepository extends JpaRepository<MemberEntity, Long> {

    Optional<MemberDto> findMemberByUserName(String userName);



}
