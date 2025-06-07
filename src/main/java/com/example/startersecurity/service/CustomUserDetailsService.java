package com.example.startersecurity.service;

import com.example.startersecurity.dto.CustomUserDetails;
import com.example.startersecurity.entity.UserEntity;
import com.example.startersecurity.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    public CustomUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        UserEntity userData = userRepository.findByUsername(username);

        if ( userData != null) {
            // 조회해서 있다면 커스텀유저디테일즈를 반환(dto)
            return new CustomUserDetails(userData);
        }

        return null;
    }
}
