package com.sihun.jpastudy.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name="nm_member")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 30, nullable = false)
    private String userName;

    @Column(nullable = false)
    private LocalDateTime regDate;


}
