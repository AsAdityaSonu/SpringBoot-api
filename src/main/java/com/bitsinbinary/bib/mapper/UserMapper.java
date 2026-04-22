package com.bitsinbinary.bib.mapper;

import com.bitsinbinary.bib.dto.user.UserRequest;
import com.bitsinbinary.bib.dto.user.UserResponse;
import com.bitsinbinary.bib.entity.User;

public class UserMapper {
    public static User toUser(UserRequest request) {
        return User.builder()
                .name(request.getName())
                .email(request.getEmail())
                .password(request.getPassword())
                .role(request.getRole())
                .build();
    }

    public static UserResponse toResponse(User user) {
        return UserResponse.builder()
                .id(user.getId())
                .name(user.getName())
                .email(user.getEmail())
                .role(user.getRole())
                .createdAt(user.getCreatedAt())
                .updatedAt(user.getUpdatedAt())
                .build();
    }
}
