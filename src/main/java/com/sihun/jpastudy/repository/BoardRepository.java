package com.sihun.jpastudy.repository;

import com.sihun.jpastudy.entity.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<BoardEntity, Long> {
}
