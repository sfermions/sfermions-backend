package com.sfermions.service;

import org.springframework.stereotype.Service;

import com.sfermions.dto.user.AddUserRequest;
import com.sfermions.model.User;
import com.sfermions.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User save(AddUserRequest request) {
        return userRepository.save(request.toEntity());
    }
}
