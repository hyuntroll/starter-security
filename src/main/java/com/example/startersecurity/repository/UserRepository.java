package com.example.startersecurity.repository;

import com.example.startersecurity.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

// <userentity id의 int의 레퍼런스 타입>
public interface UserRepository extends JpaRepository<UserEntity, Integer> {

    // username이 존재하는지
    Boolean existsByUsername(String username);


    // username을 받아 DB 테이블에서 회원을 조회하는 메서드
    UserEntity findByUsername(String username);

}
