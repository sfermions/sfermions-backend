package com.sfermions.dto.user;

import com.sfermions.model.User;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class AddUserRequest {
    private String name;
    
    public User toEntity() {
        return User.builder()
                .name(name)
                .build();
    }
}
